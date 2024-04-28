package dz.ibnrochd.master14.Business.ConsultationService;

import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.LigneConsultation;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/28.
 */

public interface IConsultationService {

     void creerConsultation(Consultation consultation);

     Consultation obtenirConsultationParId(int id);

     List<Consultation> obtenirConsultationsParPatientId(int patientId);

     void miseAjourConsultation(Consultation consultation);

     void supprimerConsultation(int id);

     void creerLigneConsultation(LigneConsultation ligneConsultation);

     LigneConsultation obtenirLigneConsultation(int id);

     void miseAjourLigneConsultation(LigneConsultation ligneConsultation);

     void supprimerLigneConsultation(int id);
}
