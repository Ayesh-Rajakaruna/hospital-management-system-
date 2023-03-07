package com.yapa.HMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoctorInformationDTO {
    private int doctorId;
    private String doctorName;
    private String doctorAddress;
    private String doctorContactNumber;
    private String doctorNic;
    private String doctorPassword;
    private String doctorUniversity;
    private String doctorDescription;
}
