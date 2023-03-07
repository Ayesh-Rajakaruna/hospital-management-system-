package com.yapa.HMS.service.impl;

import com.google.zxing.WriterException;
import com.yapa.HMS.dto.DoctorInformationDTO;
import com.yapa.HMS.dto.MedicalHistoryDTO;
import com.yapa.HMS.dto.PatientInformationDTO;
import com.yapa.HMS.dto.PatientLoggingInformationDTO;
import com.yapa.HMS.entity.DoctorInformation;
import com.yapa.HMS.entity.MedicalHistory;
import com.yapa.HMS.entity.PatientInformation;
import com.yapa.HMS.qrcode.QROperation;
import com.yapa.HMS.repo.DoctorInformationREPO;
import com.yapa.HMS.repo.PatientInformationREPO;
import com.yapa.HMS.repo.MedicalHistoryREPO;
import com.yapa.HMS.service.HMSService;
import com.yapa.HMS.util.mappers.InformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

@Service
public class HMSSaveServiceIMPL implements HMSService {
    @Autowired
    PatientInformationREPO patientInformationREPO;
    @Autowired
    DoctorInformationREPO doctorInformationREPO;
    @Autowired
    InformationMapper informationMapper;
    @Autowired
    MedicalHistoryREPO medicalHistoryREPO;

    @Override
    public void SavePatientInformation(PatientInformationDTO patientInformationDTO){
        PatientInformation patientInformation = informationMapper.PatientInformationDtoToEntity(patientInformationDTO);
        if(!patientInformationREPO.existsById(patientInformation.getPatientId())){
            patientInformationREPO.save(patientInformation);
        }
    }

    @Override
    public void SaveDoctorInformation(DoctorInformationDTO doctorInformationDTO) {
        DoctorInformation doctorInformation = informationMapper.DoctorInformationDtoToEntity(doctorInformationDTO);
        if(!patientInformationREPO.existsById(doctorInformation.getDoctorId())){
            doctorInformationREPO.save(doctorInformation);
        }

    }

    @Override
    public void SaveMedicalHistory(MedicalHistoryDTO medicalHistoryDTO) {
        MedicalHistory medicalHistory = informationMapper.MedicalHistoryDtoToEntity(medicalHistoryDTO);
        if(!medicalHistoryREPO.existsById(medicalHistoryDTO.getPatientIdForMedicalHistory())){
            medicalHistoryREPO.save(medicalHistory);
        }

    }

    @Override
    public List<MedicalHistory> FindAllMedicalHistory() {
        List<MedicalHistory> AllData = medicalHistoryREPO.findAll();
        return AllData;
    }
}
