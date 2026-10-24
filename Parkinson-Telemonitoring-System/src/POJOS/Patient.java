package POJOS;

import java.io.Serializable;

public class Patient implements Serializable {
//perfil e identifiacion del paciente
    private static final long serialVersionUID= 1L;

    private String patientId;
    private String name;
    private int age;
    private String lastMedicationTime;

    public Patient(String patientId, String name, int age, String lastMedicationTime) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.lastMedicationTime = lastMedicationTime;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLastMedicationTime() {
        return lastMedicationTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", lastMedicationTime='" + lastMedicationTime + '\'' +
                '}';
    }
}

