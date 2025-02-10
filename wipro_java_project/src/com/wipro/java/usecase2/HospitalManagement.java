package com.wipro.java.usecase2;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {

    private List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showPatients() {
        for (Patient patient : patients) {
            patient.details();
        }
    }

    public static void main(String[] args) {
        HospitalManagement management = new HospitalManagement();
        
        management.addPatient(new Treatment(1, "Alice", "Flu", "Medication"));
        management.addPatient(new Treatment(2, "Bob", "Fracture", "Surgery"));
        
        management.showPatients();
    }
}
