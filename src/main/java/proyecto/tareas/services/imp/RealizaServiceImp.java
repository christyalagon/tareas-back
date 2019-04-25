package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Realiza;
import proyecto.tareas.repositories.RealizaRepository;
import proyecto.tareas.services.RealizaService;

@Service("realizaServiceImp")
public class RealizaServiceImp implements RealizaService {
    @Autowired
    private RealizaRepository realizaRepository;

    @Override
    public Realiza findById(Long id) {
        return realizaRepository.findById(id);
    }
}
