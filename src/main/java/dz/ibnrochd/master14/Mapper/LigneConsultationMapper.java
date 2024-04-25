package dz.ibnrochd.master14.Mapper;


import dz.ibnrochd.master14.model.LigneConsultation;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Mapper
public interface LigneConsultationMapper {


    void insert(LigneConsultation ligneConsultation);


    LigneConsultation selectById(Long id);


    void update(LigneConsultation ligneConsultation);


    void delete(Long id);
}

