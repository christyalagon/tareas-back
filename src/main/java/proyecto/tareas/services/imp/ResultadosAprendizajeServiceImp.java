package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.ResultadosAprendizaje;
import proyecto.tareas.repositories.ResultadosAprRepository;
import proyecto.tareas.services.ResultadosAprendizajeService;

@Service("resultadosAprendizajeServiceImp")
public class ResultadosAprendizajeServiceImp implements ResultadosAprendizajeService {
    @Autowired
    private ResultadosAprRepository resultadosAprRepository;

    @Override
    public ResultadosAprendizaje findById(Long id) {
        return resultadosAprRepository.findById(id);
    }
}
