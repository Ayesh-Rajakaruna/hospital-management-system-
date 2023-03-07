package com.yapa.HMS.repo;

import com.yapa.HMS.entity.PatientInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface PatientInformationREPO extends JpaRepository<PatientInformation, Integer>{
}


