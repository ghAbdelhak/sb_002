package dz.ibnrochd.master14.Service;


import dz.ibnrochd.master14.Mapper.RendezVousMapper;
import dz.ibnrochd.master14.model.RendezVous;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Service
public class RendezVousService {

    @Autowired
    private RendezVousMapper rendezVousMapper;

    public void createRendezVous(RendezVous rendezVous) {
        rendezVousMapper.insert(rendezVous);
    }

    public RendezVous getRendezVous(int id) {
        return rendezVousMapper.selectById(id);
    }

    public List<RendezVous> getRendezVousByPatientId(int patientId) {
        return rendezVousMapper.selectByPatientId(patientId);
    }

    public void updateRendezVous(RendezVous rendezVous) {
        rendezVousMapper.update(rendezVous);
    }

    public void deleteRendezVous(int id) {
        rendezVousMapper.delete(id);
    }
}

