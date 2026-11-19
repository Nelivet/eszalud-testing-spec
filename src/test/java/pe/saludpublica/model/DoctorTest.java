package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas del modelo Doctor")
class DoctorTest {

    @Test
    @DisplayName("Crear un doctor con datos válidos")
    void shouldCreateDoctorWithValidData() {
        Doctor doctor = new Doctor("87654321", "Carlos", "Ramírez", "CMP-12345", "esp-001");

        assertNotNull(doctor);
        assertEquals("87654321", doctor.getDocumento());
        assertEquals("Carlos", doctor.getNombres());
        assertEquals("Ramírez", doctor.getApellidos());
        assertEquals("CMP-12345", doctor.getColegiatura());
        assertEquals("esp-001", doctor.getEspecialidad());
    }
}
