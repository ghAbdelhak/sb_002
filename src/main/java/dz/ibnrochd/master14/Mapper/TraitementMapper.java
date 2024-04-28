package dz.ibnrochd.master14.Mapper;


import dz.ibnrochd.master14.model.Traitement;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Mapper
public interface TraitementMapper {


    void insert(Traitement traitement);


    Traitement selectByTraitementId(int id);


    List<Traitement> selectAll();


    void update(Traitement traitement);


    void delete(int id);

}
