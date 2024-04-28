package dz.ibnrochd.master14.Business.ConsultationService;


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
public class ConsultationService implements IConsultationService {

    @Autowired
    private ConsultationMapper consultationMapper;

    @Autowired
    private LigneConsultationMapper ligneConsultationMapper;


    @Override
    public void creerConsultation(Consultation consultation) {
        consultationMapper.insert(consultation);
    }

    @Override
    public Consultation obtenirConsultationParId(int id) {
        return consultationMapper.selectById(id);
    }

    @Override
    public List<Consultation> obtenirConsultationsParPatientId(int patientId) {
        return consultationMapper.selectByPatientId(patientId);
    }

    @Override
    public void miseAjourConsultation(Consultation consultation) {
        consultationMapper.update(consultation);
    }

    @Override
    public void supprimerConsultation(int id) {
        consultationMapper.delete(id);
    }

    public void creerLigneConsultation(LigneConsultation ligneConsultation) {
        ligneConsultationMapper.insert(ligneConsultation);
    }

    @Override
    public LigneConsultation obtenirLigneConsultation(int id) {
        return ligneConsultationMapper.selectById(id);
    }

    @Override
    public void miseAjourLigneConsultation(LigneConsultation ligneConsultation) {
        ligneConsultationMapper.update(ligneConsultation);
    }

    @Override
    public void supprimerLigneConsultation(int id) {
        ligneConsultationMapper.delete(id);
    }
}

