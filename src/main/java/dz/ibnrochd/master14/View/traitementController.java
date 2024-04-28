package dz.ibnrochd.master14.View;

import dz.ibnrochd.master14.Business.TraitementService.ITraitementService;
import org.springframework.ui.Model;
import dz.ibnrochd.master14.model.Traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/28.
 */
@Controller
@RequestMapping("/traitement")
public class traitementController {

    @Autowired
    private ITraitementService traitementService;

    @GetMapping("/form")
    public String insertTraitementPage(Model model) {
        model.addAttribute("traitement", new Traitement());
        return "traitementPages/insertTraitement";
    }

    @GetMapping("/list")
    public String getAllTraitementPage(Model model) {
        List<Traitement> ListTraitement = traitementService.getAllTraitements();
        model.addAttribute("listTraitement", ListTraitement);
        return "traitementPages/ListTraitement.html";
    }

    @GetMapping("/update/{id}")
    public String getUpdatePage(@PathVariable("id") int id, Model model) {
        Traitement traitement = traitementService.getTraitement(id);
        model.addAttribute("traitement", traitement);
        return "traitementPages/updateTraitement";
    }
    @PostMapping("/update/{id}")
    public String updateTraitement(@PathVariable("id") int id, @ModelAttribute("traitement") Traitement updatedTraitement) {
        Traitement existingTraitement = traitementService.getTraitement(id);
        if (existingTraitement != null) {
            existingTraitement.setNom(updatedTraitement.getNom());
            traitementService.updateTraitement(existingTraitement);
        }
        return "redirect:/";
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute("traitement") Traitement traitement, Model model) {
        try {
            traitementService.createTraitement(traitement);
            model.addAttribute("successMessage", "Inserted Successfully!");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Unexpected error occurred.");
        }
        model.addAttribute("traitement", traitement);
        return "traitementPages/insertTraitement";
    }

    @GetMapping("/delete/{id}")
    public String deleteTraitement(@PathVariable("id") int id) {
        traitementService.deleteTraitement(id);
        return "redirect:/";
    }
}
