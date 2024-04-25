package dz.ibnrochd.master14.Service;


import dz.ibnrochd.master14.Mapper.LigneConsultationMapper;
import dz.ibnrochd.master14.model.LigneConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Service
public class LigneConsultationService {

    @Autowired
    private LigneConsultationMapper ligneConsultationMapper;

    public void createLigneConsultation(LigneConsultation ligneConsultation) {
        ligneConsultationMapper.insert(ligneConsultation);
    }

    public LigneConsultation getLigneConsultation(Long id) {
        return ligneConsultationMapper.selectById(id);
    }

    public void updateLigneConsultation(LigneConsultation ligneConsultation) {
        ligneConsultationMapper.update(ligneConsultation);
    }


    public void deleteLigneConsultation(Long id) {
        ligneConsultationMapper.delete(id);
    }
}

