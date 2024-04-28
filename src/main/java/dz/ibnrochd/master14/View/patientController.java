package dz.ibnrochd.master14.View;

import dz.ibnrochd.master14.Business.PatientService.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/28.
 */
@Controller
@RequestMapping("/patient")
public class patientController {
    @Autowired
    PatientService patientService;
}

