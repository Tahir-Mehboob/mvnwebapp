package mymoney.migiration.dcp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mymoney.migiration.dcp.entity.FxRecord;

public interface FxRecordRepository extends JpaRepository<FxRecord, Integer> {
}
