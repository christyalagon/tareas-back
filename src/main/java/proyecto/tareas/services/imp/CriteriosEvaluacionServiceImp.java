package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.CriteriosEvaluacion;
import proyecto.tareas.repositories.CriteriosRepository;
import proyecto.tareas.services.CriteriosEvaluacionService;

@Service("criteriosEvaluacionServiceImp")
public class CriteriosEvaluacionServiceImp implements CriteriosEvaluacionService {
    @Autowired
    private CriteriosRepository criteriosRepository;

    @Override
    public CriteriosEvaluacion findById(Long id) {
        return criteriosRepository.findById(id);
    }
}
