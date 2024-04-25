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

    @Insert("INSERT INTO cabinet.traitement (nom) VALUES (#{nom})")
    void insert(Traitement traitement);

    @Select("SELECT * FROM cabinet.traitement WHERE id = #{id}")
    Traitement selectById(Long id);

    @Select("SELECT * FROM cabinet.traitement")
    List<Traitement> selectAll();

    @Update("UPDATE cabinet.traitement SET nom = #{nom} WHERE id = #{id}")
    void update(Traitement traitement);

    @Delete("DELETE FROM cabinet.traitement WHERE id = #{id}")
    void delete(Long id);

}
