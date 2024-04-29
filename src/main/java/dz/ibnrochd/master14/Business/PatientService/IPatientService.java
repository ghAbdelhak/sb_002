package dz.ibnrochd.master14.Business.PatientService;

import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.RendezVous;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/28.
 */


public interface IPatientService {

    void creerPatient(Patient patient);

    Patient obtenirPatientParId(int id);

    List<Patient> getPatientParNom(String nom);

    List<Patient> obtenirTousPatients();

    void miseAjourPatient(int id,Patient patient);

    void supprimerPatient(int id);

    void creerRendezVous(RendezVous rendezVous);

    RendezVous obtenirRendezVous(int id);

    List<RendezVous> obtenirRendezVousParIdPatient(int patientId);

    void miseAjourRendezVous(RendezVous rendezVous);

    void supprimerRendezVous(int id);
}
