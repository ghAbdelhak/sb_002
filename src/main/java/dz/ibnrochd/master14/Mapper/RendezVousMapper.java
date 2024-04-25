package dz.ibnrochd.master14.Mapper;


import dz.ibnrochd.master14.model.RendezVous;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Mapper
public interface RendezVousMapper {


    void insert(RendezVous rendezVous);


    RendezVous selectById(int id);


    List<RendezVous> selectByPatientId(int patientId);


    void update(RendezVous rendezVous);


    void delete(int id);
}
