package dz.ibnrochd.master14.Service;

import dz.ibnrochd.master14.Mapper.PatientMapper;
import dz.ibnrochd.master14.Mapper.RendezVousMapper;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.RendezVous;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Service
public class PatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Autowired
    private RendezVousMapper rendezVousMapper;

    public void creerPatient(Patient patient) {
        patientMapper.insert(patient);
    }

    public Patient obtenirPatientParId(int id) {
        return patientMapper.selectById(id);
    }

    public List<Patient> getPatientParNom(String nom) {
        return patientMapper.findByNom(nom);
    }

    public List<Patient> obtenirTousPatients() {
        return patientMapper.selectAll();
    }

    public void miseAjourPatient(Patient patient) {
        patientMapper.update(patient);
    }

    public void supprimerPatient(int id) {
        patientMapper.delete(id);
    }

    public void creerRendezVous(RendezVous rendezVous) {
        rendezVousMapper.insert(rendezVous);
    }

    public RendezVous obtenirRendezVous(int id) {
        return rendezVousMapper.selectById(id);
    }

    public List<RendezVous> obtenirRendezVousParIdPatient(int patientId) {
        return rendezVousMapper.selectByPatientId(patientId);
    }

    public void miseAjourRendezVous(RendezVous rendezVous) {
        rendezVousMapper.update(rendezVous);
    }

    public void supprimerRendezVous(int id) {
        rendezVousMapper.delete(id);
    }
}

