package com.yapa.HMS.service;

import com.yapa.HMS.dto.DoctorInformationDTO;
import com.yapa.HMS.dto.MedicalHistoryDTO;
import com.yapa.HMS.dto.PatientInformationDTO;
import com.yapa.HMS.dto.PatientLoggingInformationDTO;
import com.yapa.HMS.entity.MedicalHistory;

import java.util.Hashtable;
import java.util.List;

public interface HMSService {
    void SavePatientInformation(PatientInformationDTO patientInformationDTO);

    void SaveDoctorInformation(DoctorInformationDTO doctorInformationDTO);

    void SaveMedicalHistory(MedicalHistoryDTO medicalHistoryDTO);

    List<MedicalHistory> FindAllMedicalHistory();
}
