package com.yapa.HMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Medical_History")
public class MedicalHistory {
    @Id
    @Column(name = "Patient_Id",length = 45)
    private int patientIdForMedicalHistory;

    @Column(name = "Date")
    private String date;

    @Column(name = "Small_Description", length = 100, nullable = false)
    private String smallDescription;

    @Column(name = "quantity", length = 255)
    private String quantity;

}
