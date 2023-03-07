package com.yapa.HMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicalHistoryDTO {
    private int patientIdForMedicalHistory;
    private String date;
    private String smallDescription;
    private String quantity;
}
