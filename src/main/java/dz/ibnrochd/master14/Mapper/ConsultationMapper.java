package dz.ibnrochd.master14.Mapper;


import dz.ibnrochd.master14.model.Consultation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Mapper
public interface ConsultationMapper {


    void insert(Consultation consultation);


    Consultation selectById(int id);


    List<Consultation> selectByPatientId(Long patientId);


    void update(Consultation consultation);


    void delete(Long id);
}

