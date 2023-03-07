package com.yapa.HMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Doctor_Information")
public class DoctorInformation {
    @Id
    @Column(name = "Doctor_Id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int doctorId;

    @Column(name = "Doctor_Name", length = 100, nullable = false)
    private String doctorName;

    @Column(name = "Doctor_Address", length = 255)
    private String doctorAddress;

    @Column(name = "Doctor_Contact_Number", length = 50)
    private String doctorContactNumber;

    @Column(name = "Doctor_Nic")
    private String doctorNic;

    @Column(name = "Doctor_Password")
    private String doctorPassword;

    @Column(name = "Doctor_University")
    private String doctorUniversity;

    @Column(name = "Doctor_Description")
    private String doctorDescription;
}
