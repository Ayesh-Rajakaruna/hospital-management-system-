package com.yapa.HMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientLoggingInformationDTO {
    private int patientId;
    private String patientPassword;
}
