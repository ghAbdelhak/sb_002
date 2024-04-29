package dz.ibnrochd.master14.Business.TraitementService;
import dz.ibnrochd.master14.model.Traitement;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/28.
 */

public interface ITraitementService {
     void createTraitement(Traitement traitement);

     Traitement getTraitement(int id);

     List<Traitement> getAllTraitements();

     void updateTraitement(int id,Traitement traitement);

     void deleteTraitement(int id);
}
