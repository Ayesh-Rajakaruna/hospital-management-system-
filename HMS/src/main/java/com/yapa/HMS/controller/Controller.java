package com.yapa.HMS.controller;

import com.google.zxing.WriterException;
import com.yapa.HMS.dto.DoctorInformationDTO;
import com.yapa.HMS.dto.MedicalHistoryDTO;
import com.yapa.HMS.dto.PatientInformationDTO;
import com.yapa.HMS.dto.PatientLoggingInformationDTO;
import com.yapa.HMS.entity.MedicalHistory;
import com.yapa.HMS.service.HMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin
public class Controller {
    @Autowired
    private HMSService hMSService;

    @PostMapping(path = "PatientInformation/save")
    public String savePatient(@RequestBody PatientInformationDTO patientInformationDTO){
        hMSService.SavePatientInformation(patientInformationDTO);
        return "Save";
    }
    @PostMapping(path = "DoctorInformation/save")
    public String saveDoctor(@RequestBody DoctorInformationDTO doctorInformationDTO){
        hMSService.SaveDoctorInformation(doctorInformationDTO);
        return "Save";
    }
    @PostMapping(path = "MedicalHistory/save")
    public String MedicalHistory(@RequestBody MedicalHistoryDTO medicalHistoryDTO){
        hMSService.SaveMedicalHistory(medicalHistoryDTO);
        return "Save";
    }
    @GetMapping(path = "MedicalHistory/get")
    public List<MedicalHistory>  MedicalHistory(){
        List<MedicalHistory> AllData = hMSService.FindAllMedicalHistory();
        return AllData;
    }
}
