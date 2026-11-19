package pe.saludpublica.model;

public class Doctor {

    private String documento;
    private String nombres;
    private String apellidos;
    private String colegiatura;
    private String especialidad;

    public Doctor(String documento, String nombres, String apellidos, String colegiatura, String especialidad) {
        if (colegiatura == null) throw new IllegalArgumentException("El campo colegiatura es obligatorio");
        if (apellidos == null) throw new IllegalArgumentException("El campo apellidos es obligatorio");
        if (nombres == null) throw new IllegalArgumentException("El campo nombres es obligatorio");
        if (documento == null) throw new IllegalArgumentException("El campo documento es obligatorio");
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.colegiatura = colegiatura;
        this.especialidad = especialidad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getColegiatura() {
        return colegiatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
