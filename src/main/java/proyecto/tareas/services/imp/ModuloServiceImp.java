package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Modulos;
import proyecto.tareas.repositories.ModulosRepository;
import proyecto.tareas.services.ModuloService;

@Service("moduloServiceImp")
public class ModuloServiceImp implements ModuloService {
    @Autowired
    private ModulosRepository modulosRepository;

    @Override
    public Modulos findById(Long id) {
        return modulosRepository.findById(id);
    }
}
