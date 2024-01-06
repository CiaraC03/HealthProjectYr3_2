package ie.atu.healthprojectyr3_2_;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>
{
    Appointment findByPatientId(String patientId);
}
