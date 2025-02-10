package com.wipro.java.usecase2;

// Abstract Patient class
abstract class Patient {
    
    private int id;
    private String name;
    private String disease;
    
    public Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }
    
    public void setDisease(String disease) {
        this.disease = disease;
    }
    
    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", disease=" + disease + "]";
    }
    
    public abstract void details();
}
