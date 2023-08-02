package mymoney.migiration.dfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mymoney.migiration.dfe.entity.TfFxRecord;

public interface CollaborationFxRecordRepository extends JpaRepository<CollaborationFxRecord, Integer> {
}
