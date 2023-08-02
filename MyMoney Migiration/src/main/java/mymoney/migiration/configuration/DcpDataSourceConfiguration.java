package mymoney.migiration.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

import mymoney.migiration.dcp.entity.FxRecord;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "mymoney.migiration.dcp.repository",
        entityManagerFactoryRef = "dcpEntityManagerFactory",
        transactionManagerRef = "dcpTransactionManager")
public class DcpDataSourceConfiguration {
    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.dcp")
    public DataSourceProperties dcpDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.dcp.configuration")
    public DataSource dcpDataSource() {
        return dcpDataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    @Primary
	@Bean(name = "dcpEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean dcpEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(dcpDataSource())
                .packages( FxRecord.class)
                .build();
    }

    @Primary
    @Bean(name = "dcpTransactionManager")
    public PlatformTransactionManager dcpTransactionManager(
            final @Qualifier("dcpEntityManagerFactory") LocalContainerEntityManagerFactoryBean dcpEntityManagerFactory) {
        return new JpaTransactionManager(dcpEntityManagerFactory.getObject());
    }
}
