package com.prashant.liveasylogisticstask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prashant.liveasylogisticstask.model.LogisticEntity;


@Repository
public interface LogisticRepository extends JpaRepository<LogisticEntity, Long>{

}
