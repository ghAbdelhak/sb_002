package dz.ibnrochd.master14.Service;


import dz.ibnrochd.master14.Mapper.ConsultationMapper;
import dz.ibnrochd.master14.Mapper.LigneConsultationMapper;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.LigneConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Service
public class ConsultationService {

    @Autowired
    private ConsultationMapper consultationMapper;

    @Autowired
    private LigneConsultationMapper ligneConsultationMapper;


    public void creerConsultation(Consultation consultation) {
        consultationMapper.insert(consultation);
    }

    public Consultation obtenirConsultationParId(int id) {
        return consultationMapper.selectById(id);
    }

    public List<Consultation> obtenirConsultationsParPatientId(Long patientId) {
        return consultationMapper.selectByPatientId(patientId);
    }

    public void miseAjourConsultation(Consultation consultation) {
        consultationMapper.update(consultation);
    }

    public void supprimerConsultation(Long id) {
        consultationMapper.delete(id);
    }

    public void creerLigneConsultation(LigneConsultation ligneConsultation) {
        ligneConsultationMapper.insert(ligneConsultation);
    }

    public LigneConsultation obtenirLigneConsultation(Long id) {
        return ligneConsultationMapper.selectById(id);
    }

    public void miseAjourLigneConsultation(LigneConsultation ligneConsultation) {
        ligneConsultationMapper.update(ligneConsultation);
    }

    public void supprimerLigneConsultation(Long id) {
        ligneConsultationMapper.delete(id);
    }
}

