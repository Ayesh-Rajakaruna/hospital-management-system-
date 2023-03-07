package com.yapa.HMS.repo;


import com.yapa.HMS.entity.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface MedicalHistoryREPO extends JpaRepository<MedicalHistory, Integer> {
}
