package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Ensena;
import proyecto.tareas.repositories.EnsenaRepository;
import proyecto.tareas.services.EnsenaService;

@Service("ensenaServiceImp")
public class EnsenaServiceImp implements EnsenaService {
    @Autowired
    private EnsenaRepository ensenaRepository;

    @Override
    public Ensena findById(Long id) {
        return ensenaRepository.findById(id);
    }
}
