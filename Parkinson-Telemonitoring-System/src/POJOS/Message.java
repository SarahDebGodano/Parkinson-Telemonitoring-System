package POJOS;

import java.io.Serializable;

public class Message implements Serializable {
    //Clase para estructurar las peticiones entre cliente y servidor
    //Cabecera del protocolo red
    //Permite definir un protocolo claro cliente-servidor
    private static final long serialVersionUID = 4L;
    public enum MessageType {
        CONNECT,          // Petición inicial de conexión del cliente
        SEND_SYMPTOMS,    // Envío del POJO SymptomReport
        SEND_SESSION,     // Envío del POJO ParkinsonSession
        DISCONNECT,       // Cierre normal de sesión
        ERROR             // Respuesta en caso de mensaje malformado o error
    }
    private MessageType type;
    private String patientId;
    private Object payload;// Contiene el POJO enviado (Patient, SymptomReport, ParkinsonSession o String)

    public Message(MessageType type, String patientId, Object payload) {
        this.type = type;
        this.patientId = patientId;
        this.payload = payload;
    }

    public MessageType getType() {
        return type;
    }

    public String getPatientId() {
        return patientId;
    }

    public Object getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "Message{" +
                "type=" + type +
                ", patientId='" + patientId + '\'' +
                ", payload=" + payload +
                '}';
    }
}
