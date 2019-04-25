package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.EstaCompuesto;
import proyecto.tareas.repositories.EstaCompuestoRepository;
import proyecto.tareas.services.EstaCompuestoService;

@Service("estaCompuestoServiceImp")
public class EstaCompuestoServiceImp implements EstaCompuestoService {
    @Autowired
    private EstaCompuestoRepository estaCompuestoRepository;

    @Override
    public EstaCompuesto findById(Long id) {
        return estaCompuestoRepository.findById(id);
    }
}
