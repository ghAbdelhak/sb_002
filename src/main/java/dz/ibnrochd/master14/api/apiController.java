package dz.ibnrochd.master14.api;

import dz.ibnrochd.master14.Business.ConsultationService.IConsultationService;
import dz.ibnrochd.master14.Business.PatientService.IPatientService;
import dz.ibnrochd.master14.Business.TraitementService.ITraitementService;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/29.
 */
@RestController
@RequestMapping("/api")
public class apiController {

    @Autowired
    private IConsultationService consultationService;

    @Autowired
    private IPatientService patientService;

    @Autowired
    private ITraitementService traitementService;

    @GetMapping("/traitement/list")
    public ResponseEntity<List<Traitement>> getAllTraitement() {
        List<Traitement> ListTraitement = traitementService.getAllTraitements();
        return ResponseEntity.ok(ListTraitement);
    }

    @PutMapping("/traitement/update/{id}")
    public ResponseEntity<String> updateTraitement(@PathVariable("id") int id, @RequestBody Traitement updatedTraitement) {
        Traitement existingTraitement = traitementService.getTraitement(id);
        if (existingTraitement != null) {
            System.out.println(updatedTraitement.getNom());
            traitementService.updateTraitement(id,updatedTraitement);
            return ResponseEntity.ok("Traitement updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Traitement with id " + id + " not found");
        }
    }

    @PostMapping("/traitement/form")
    public ResponseEntity<String> submitForm(@RequestBody Traitement traitement) {
        try {
            traitementService.createTraitement(traitement);
            return ResponseEntity.ok("Traitement inserted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected error occurred");
        }
    }

    @DeleteMapping("/traitement/delete/{id}")
    public ResponseEntity<String> deleteTraitement(@PathVariable("id") int id) {
        try {
            traitementService.deleteTraitement(id);
            return ResponseEntity.ok("Traitement deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected error occurred");
        }
    }

    @GetMapping("/patient/list")
    public ResponseEntity<List<Patient>> getAllPatient() {
        List<Patient> ListPatient = patientService.obtenirTousPatients();
        return ResponseEntity.ok(ListPatient);
    }

    @PutMapping("/patient/update/{id}")
    public ResponseEntity<String> updatePatient(@PathVariable("id") int id, @RequestBody Patient updatedPatient) {
        Patient existingPatient = patientService.obtenirPatientParId(id);
        if (existingPatient != null) {
            patientService.miseAjourPatient(id,updatedPatient);
            return ResponseEntity.ok("Patient updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Patient with id " + id + " not found");
        }
    }

    @PostMapping("/patient/form")
    public ResponseEntity<String> submitForm(@RequestBody Patient patient) {
        try {
            patientService.creerPatient(patient);
            return ResponseEntity.ok("Patient inserted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected error occurred");
        }
    }

    @DeleteMapping("/patient/delete/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable("id") int id) {
        try {
            patientService.supprimerPatient(id);
            return ResponseEntity.ok("Patient deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected error occurred");
        }
    }
}
