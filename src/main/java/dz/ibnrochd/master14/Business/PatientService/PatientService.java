package dz.ibnrochd.master14.Business.PatientService;

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
public class PatientService implements IPatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Autowired
    private RendezVousMapper rendezVousMapper;

    @Override
    public void creerPatient(Patient patient) {
        patientMapper.insert(patient);
    }
    @Override
    public Patient obtenirPatientParId(int id) {
        return patientMapper.selectById(id);
    }
    @Override
    public List<Patient> getPatientParNom(String nom) {
        return patientMapper.findByNom(nom);
    }
    @Override
    public List<Patient> obtenirTousPatients() {
        return patientMapper.selectAll();
    }
    @Override
    public void miseAjourPatient(int id,Patient patient) {
        System.out.println(patient.getNom()+patient.getPrenom()+patient.getSexe()+patient.getDateNaissance()+patient.getNumeroTelephone()+patient.getAdresse());
        patientMapper.update(id,patient);
    }
    @Override
    public void supprimerPatient(int id) {
        patientMapper.delete(id);
    }
    @Override
    public void creerRendezVous(RendezVous rendezVous) {
        rendezVousMapper.insert(rendezVous);
    }
    @Override
    public RendezVous obtenirRendezVous(int id) {
        return rendezVousMapper.selectById(id);
    }
    @Override
    public List<RendezVous> obtenirRendezVousParIdPatient(int patientId) {
        return rendezVousMapper.selectByPatientId(patientId);
    }
    @Override
    public void miseAjourRendezVous(RendezVous rendezVous) {
        rendezVousMapper.update(rendezVous);
    }
    @Override
    public void supprimerRendezVous(int id) {
        rendezVousMapper.delete(id);
    }
}

