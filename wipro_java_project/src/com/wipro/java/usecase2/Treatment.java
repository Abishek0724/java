package com.wipro.java.usecase2;

public class Treatment extends Patient {
    
    private String treatmentType;
    
    public Treatment(int id, String name, String disease, String treatmentType) {
        super(id, name, disease);
        this.treatmentType = treatmentType;
    }
    
    @Override
    public void details() {
        System.out.println("Patient ID: " + getId() + ", Name: " + getName() + 
                           ", Disease: " + getDisease() + ", Treatment: " + treatmentType);
    }
}
