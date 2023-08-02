package mymoney.migiration.configuration;

import com.zaxxer.hikari.HikariDataSource;

import mymoney.migiration.collaboration.entity.*;

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

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "mymoney.migiration.Collaboration.repository",
        entityManagerFactoryRef = "collaborationEntityManagerFactory",
        transactionManagerRef = "collaborationTransactionManager")
public class CollaborationDataSourceConfiguration {
    @Bean
    @ConfigurationProperties("spring.datasource.collaboration")
    public DataSourceProperties collaborationDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.collaboration.configuration")
    public DataSource collaborationDataSource() {
        return collaborationDataSourceProperties().initializeDataSourceBuilder()
                .type( HikariDataSource.class).build();
    }

    @Bean(name = "collaborationEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean collaborationEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(collaborationDataSource())
                .packages( TfFxRecord.class)
                .build();
    }

    @Bean(name = "collaborationTransactionManager")
    public PlatformTransactionManager collaborationTransactionManager(
            final @Qualifier("collaborationEntityManagerFactory") LocalContainerEntityManagerFactoryBean collaborationEntityManagerFactory) {
        return new JpaTransactionManager(collaborationEntityManagerFactory.getObject());
    }
}
