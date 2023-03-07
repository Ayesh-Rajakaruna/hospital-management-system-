package com.yapa.HMS.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientInformationDTO {
    private int patientId;
    private String patientName;
    private String patientAddress;
    private String patientContactNumber;
    private String patientNic;
    private String patientPassword;
}
