package org.pm.patientservice.mapper;

import org.pm.patientservice.dto.PatientRequestDTO;
import org.pm.patientservice.dto.PatientResponseDTO;
import org.pm.patientservice.model.Patient;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient)
    {
        PatientResponseDTO patientResponseDTO=new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId().toString());
        patientResponseDTO.setName(patient.getName());
        patientResponseDTO.setEmail(patient.getEmail());
        patientResponseDTO.setDateofbirth(patient.getDate_of_birth().toString());
        patientResponseDTO.setAddress(patient.getAddress());
        return patientResponseDTO;


    }
    public static Patient toModel(PatientRequestDTO patientRequestDTO)
    {
        Patient patient=new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setDate_of_birth(LocalDate.parse(patientRequestDTO.getDateofbirth()));
        patient.setRegistereddate(LocalDate.parse(patientRequestDTO.getRegistereddate()));
        return patient;
    }
}
