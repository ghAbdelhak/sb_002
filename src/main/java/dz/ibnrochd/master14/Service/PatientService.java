package dz.ibnrochd.master14.Service;

import dz.ibnrochd.master14.Mapper.PatientMapper;
import dz.ibnrochd.master14.model.Patient;
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

    public void createPatient(Patient patient) {
        patientMapper.insert(patient);
    }

    public Patient getPatientById(int id) {
        return patientMapper.selectById(id);
    }

    public List<Patient> getPatientByNom(String nom) {
        return patientMapper.findByNom(nom);
    }

    public List<Patient> getAllPatients() {
        return patientMapper.selectAll();
    }

    public void updatePatient(Patient patient) {
        patientMapper.update(patient);
    }

    public void deletePatient(int id) {
        patientMapper.delete(id);
    }
}

