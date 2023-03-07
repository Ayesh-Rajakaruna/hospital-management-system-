package com.yapa.HMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Patient_Information")

public class PatientInformation {
    @Id
    @Column(name = "Patient_Id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patientId;

    @Column(name = "Patient_Name", length = 100, nullable = false)
    private String patientName;

    @Column(name = "Patient_Address", length = 255)
    private String patientAddress;

    @Column(name = "Patient_Contact_Number", length = 50)
    private String patientContactNumber;

    @Column(name = "Patient_Nic")
    private String patientNic;

    @Column(name = "Patient_Password")
    private String patientPassword;

}
