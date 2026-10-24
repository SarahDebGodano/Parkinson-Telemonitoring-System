package POJOS;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkinsonSession implements Serializable {
    //Sesión de monitorización fisiológica objetiva--> separacion de los datos adquiridos con BITalino
    //Canal EMG=Stiffness y exceso de temblor
    //Canal Acelerometro (ACC X, Y , Z) = freq y fuerza de temblor y lentitud de movimiento (bradicinesia)
    private static final long serialVersionUID = 3L;
    private String sessionId;
    private String patientId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int samplingFrequency;

    private List<Integer> emgSamples;
    private List<Integer> accXsamples;
    private List<Integer> accYsamples;
    private List<Integer> accZsamples;

    public ParkinsonSession(String sessionId, String patientId, int samplingFrequency) {
        this.sessionId = sessionId;
        this.patientId = patientId;
        this.startTime = LocalDateTime.now();
        this.samplingFrequency = samplingFrequency;
        this.emgSamples = new ArrayList<>();
        this.accXsamples = new ArrayList<>();
        this.accYsamples = new ArrayList<>();
        this.accZsamples = new ArrayList<>();
    }
    //Ir agregando datos del BITalino
    public void addFrameData(int emgValue, int accX, int accY, int accZ){
        this.emgSamples.add(emgValue);
        this.accXsamples.add(accX);
        this.accYsamples.add(accY);
        this.accZsamples.add(accZ);
    }
    public void stopSession(){
        this.endTime=LocalDateTime.now();
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getPatientId() {
        return patientId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public int getSamplingFrequency() {
        return samplingFrequency;
    }

    public List<Integer> getEmgSamples() {
        return emgSamples;
    }

    public List<Integer> getAccXsamples() {
        return accXsamples;
    }

    public List<Integer> getAccYsamples() {
        return accYsamples;
    }

    public List<Integer> getAccZsamples() {
        return accZsamples;
    }

    @Override
    public String toString() {
        return "ParkinsonSession{" +
                "sessionId='" + sessionId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", samplingFrequency=" + samplingFrequency +
                ", emgSamples=" + emgSamples +
                ", accXsamples=" + accXsamples +
                ", accYsamples=" + accYsamples +
                ", accZsamples=" + accZsamples +
                '}';
    }
}
