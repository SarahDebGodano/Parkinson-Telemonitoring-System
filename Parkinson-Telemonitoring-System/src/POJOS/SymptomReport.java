package POJOS;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SymptomReport implements Serializable {
    //Enunciado proyecto: el paciente debe introducir sus sintomas autoinformados, la fecha y hora de la presentacion
    //y observaciones clinicas
    private static final long serialVersionUID = 2L;
    private String reportId;
    private String patientId; //RELACIONAR EL REPORT CON EL PACIENTE
    private LocalDateTime timeStamp; //fecha y hora del reporte
    private int percievedRigidity; //escala del 1 al 5 de stiffness
    private int percievedTremor; //escala del 1 al 5 de temblor
    private boolean freezingEpisode; //¿episodio de bloqueo al caminar?
    private String notes; //Ovservaciones en texto libre --> enunciado

    public SymptomReport(String reportId, String patientId, int percievedRigidity, int percievedTremor, boolean freezingEpisode, String notes) {
        this.reportId = reportId;
        this.patientId = patientId;
        this.timeStamp = LocalDateTime.now();
        this.percievedRigidity = percievedRigidity;
        this.percievedTremor = percievedTremor;
        this.freezingEpisode = freezingEpisode;
        this.notes = notes;
    }

    public String getReportId() {
        return reportId;
    }

    public String getPatientId() {
        return patientId;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public int getPercievedRigidity() {
        return percievedRigidity;
    }

    public int getPercievedTremor() {
        return percievedTremor;
    }

    public boolean isFreezingEpisode() {
        return freezingEpisode;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "SymptomReport{" +
                "reportId='" + reportId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", timeStamp=" + timeStamp +
                ", percievedRigidity=" + percievedRigidity +
                ", percievedTremor=" + percievedTremor +
                ", freezingEpisode=" + freezingEpisode +
                ", notes='" + notes + '\'' +
                '}';
    }
}

