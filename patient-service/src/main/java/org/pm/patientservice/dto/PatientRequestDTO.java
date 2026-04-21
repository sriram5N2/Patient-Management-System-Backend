package org.pm.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.pm.patientservice.dto.CreatePatientValidatorGroups.CreatePatientValidatorGroup;

public class PatientRequestDTO {
    @NotBlank(message = "Name cannot be left blank")
    @Size(max = 100,message = "cannot exceed more than 100 words")
    private String name;
    @Email(message = "create a valid email")
    @NotBlank(message = "email cannot be left blank")
    private String email;
    @NotBlank(message = "Address cannot be blank")
    private String address;
    @NotBlank(message = "dateofbirth cannot be blank")
    private String date_of_birth;
    @NotBlank(groups = CreatePatientValidatorGroup.class, message = "registered date cannot be blank")
    private String registered_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateofbirth() {
        return date_of_birth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.date_of_birth = date_of_birth;
    }

    public String getRegistereddate() {
        return registered_date;
    }

    public void setRegistereddate(String registereddate) {
        this.registered_date = registered_date;
    }
}
