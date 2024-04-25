package dz.ibnrochd.master14.Mapper;

import dz.ibnrochd.master14.model.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {

    void insert(Patient patient);


    Patient selectById(int id);


    List<Patient> selectAll();


    void update(Patient patient);


    void delete(int id);

    // TODO ajouter la signature d'une méthode pour rechercher des patients par leurs noms (convention Spring Data)

    List<Patient> findByNom(String nom);
}
