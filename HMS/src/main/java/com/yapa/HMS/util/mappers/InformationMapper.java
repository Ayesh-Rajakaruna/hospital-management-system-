package com.yapa.HMS.util.mappers;

import com.yapa.HMS.dto.DoctorInformationDTO;
import com.yapa.HMS.dto.MedicalHistoryDTO;
import com.yapa.HMS.dto.PatientInformationDTO;
import com.yapa.HMS.entity.DoctorInformation;
import com.yapa.HMS.entity.MedicalHistory;
import com.yapa.HMS.entity.PatientInformation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InformationMapper {
     PatientInformation PatientInformationDtoToEntity(PatientInformationDTO patientInformationDTO);
     DoctorInformation DoctorInformationDtoToEntity(DoctorInformationDTO doctorInformationDTO);
     MedicalHistory MedicalHistoryDtoToEntity(MedicalHistoryDTO medicalHistoryDTO);
}
