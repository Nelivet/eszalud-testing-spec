package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas del modelo CitaMedica")
class CitaMedicaTest {

    @Test
    @DisplayName("Crear una cita médica con datos válidos")
    void shouldCreateAppointmentWithValidData() {
        CitaMedica cita = new CitaMedica("pac-001", "doc-001", "esp-001",
                LocalDateTime.of(2026, 12, 1, 10, 30), "Control general", EstadoCita.PROGRAMADA);

        assertNotNull(cita);
        assertEquals("pac-001", cita.getPaciente());
        assertEquals("doc-001", cita.getDoctor());
        assertEquals("esp-001", cita.getEspecialidad());
        assertEquals(LocalDateTime.of(2026, 12, 1, 10, 30), cita.getFechaHora());
        assertEquals("Control general", cita.getMotivo());
        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());
    }

    @Test
    @DisplayName("Rechazar una cita sin identificador de paciente")
    void shouldRejectAppointmentWithoutPatient() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new CitaMedica(null, "doc-001", "esp-001",
                    LocalDateTime.of(2026, 12, 1, 10, 30), "Control general", EstadoCita.PROGRAMADA)
        );
    }

    @Test
    @DisplayName("Rechazar una cita sin identificador de doctor")
    void shouldRejectAppointmentWithoutDoctor() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new CitaMedica("pac-001", null, "esp-001",
                    LocalDateTime.of(2026, 12, 1, 10, 30), "Control general", EstadoCita.PROGRAMADA)
        );
    }

    @Test
    @DisplayName("Rechazar una cita sin identificador de especialidad")
    void shouldRejectAppointmentWithoutSpecialty() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new CitaMedica("pac-001", "doc-001", null,
                    LocalDateTime.of(2026, 12, 1, 10, 30), "Control general", EstadoCita.PROGRAMADA)
        );
    }

    @Test
    @DisplayName("Rechazar una cita sin fecha y hora")
    void shouldRejectAppointmentWithoutDateTime() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new CitaMedica("pac-001", "doc-001", "esp-001",
                    null, "Control general", EstadoCita.PROGRAMADA)
        );
    }

    @Test
    @DisplayName("Asignar estado PROGRAMADA cuando el estado es null")
    void shouldAssignScheduledStatusWhenStatusIsNull() {
        CitaMedica cita = new CitaMedica("pac-001", "doc-001", "esp-001",
                LocalDateTime.of(2026, 12, 1, 10, 30), "Control general", null);

        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());
    }
}
