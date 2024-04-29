package dz.ibnrochd.master14.View;



import dz.ibnrochd.master14.Business.PatientService.IPatientService;
import dz.ibnrochd.master14.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/28.
 */
@Controller
@RequestMapping("/patient")
public class patientController {

    @Autowired
   private IPatientService patientService;

    @GetMapping("/form")
    public String insertPatientPage(Model model) {
        model.addAttribute("patient", new Patient());
        return "patientPages/insertPatient";
    }

    @GetMapping("/list")
    public String getAllPatientPage(Model model) {
        List<Patient> ListPatient = patientService.obtenirTousPatients();
        model.addAttribute("listPatient", ListPatient);
        return "patientPages/ListPatient.html";
    }

    @GetMapping("/update/{id}")
    public String getUpdatePage(@PathVariable("id") int id, Model model) {
        Patient patient = patientService.obtenirPatientParId(id);
        model.addAttribute("patient", patient);
        return "patientPages/updatePatient";
    }
//    @PostMapping("/update/{id}")
//    public String updatePatient(@PathVariable("id") int id, @ModelAttribute("patient") Patient updatedpatient) {
//        Patient existingPatient = patientService.obtenirPatientParId(id);
//        if (existingPatient != null) {
//            existingPatient.setNom(updatedpatient.getNom());
//            patientService.miseAjourPatient(existingPatient);
//        }
//        return "redirect:/";
//    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute("patient") Patient patient, Model model) {
        try {
            patientService.creerPatient(patient);
            model.addAttribute("successMessage", "Inserted Successfully!");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Unexpected error occurred.");
        }
        model.addAttribute("patient", patient);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable("id") int id) {
        patientService.supprimerPatient(id);
        return "redirect:/";
    }
}

