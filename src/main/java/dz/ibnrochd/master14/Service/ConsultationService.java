package dz.ibnrochd.master14.Service;


import dz.ibnrochd.master14.Mapper.ConsultationMapper;
import dz.ibnrochd.master14.model.Consultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Service
public class ConsultationService {

    @Autowired
    private ConsultationMapper consultationMapper;

    public void createConsultation(Consultation consultation) {
        consultationMapper.insert(consultation);
    }

    public Consultation getConsultationById(int id) {
        return consultationMapper.selectById(id);
    }

    public List<Consultation> getConsultationsByPatientId(Long patientId) {
        return consultationMapper.selectByPatientId(patientId);
    }

    public void updateConsultation(Consultation consultation) {
        consultationMapper.update(consultation);
    }

    public void deleteConsultation(Long id) {
        consultationMapper.delete(id);
    }
}

