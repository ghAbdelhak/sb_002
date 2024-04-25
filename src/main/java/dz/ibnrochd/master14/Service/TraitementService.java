package dz.ibnrochd.master14.Service;


import dz.ibnrochd.master14.Mapper.TraitementMapper;
import dz.ibnrochd.master14.model.Traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Service
public class TraitementService {

    @Autowired
    private TraitementMapper traitementMapper;

    public void createTraitement(String nom) {
        Traitement traitement = new Traitement();
        traitement.setNom(nom);
        traitementMapper.insert(traitement);
    }

    public Traitement getTraitement(Long id) {
        return traitementMapper.selectById(id);
    }

    public List<Traitement> getAllTraitements() {
        return traitementMapper.selectAll();
    }

    public void updateTraitement(Long id, String nom) {
        Traitement traitement = traitementMapper.selectById(id);
        if (traitement != null) {
            traitement.setNom(nom);
            traitementMapper.update(traitement);
        }
    }

    public void deleteTraitement(Long id) {
        traitementMapper.delete(id);
    }
}
