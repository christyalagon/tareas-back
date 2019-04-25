package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Puntua;
import proyecto.tareas.repositories.PuntuaRepository;
import proyecto.tareas.services.PuntuaService;

@Service("puntuaServiceImp")
public class PuntuaServiceImp implements PuntuaService {
    @Autowired
    private PuntuaRepository puntuaRepository;

    @Override
    public Puntua findById(Long id) {
        return puntuaRepository.findById(id);
    }
}
