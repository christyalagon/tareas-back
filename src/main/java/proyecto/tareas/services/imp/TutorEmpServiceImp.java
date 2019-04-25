package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.TutorEmpresa;
import proyecto.tareas.repositories.TutorEmpresaRepository;
import proyecto.tareas.services.TutorEmpService;

@Service("tutorEmpServiceImp")
public class TutorEmpServiceImp implements TutorEmpService {
    @Autowired
    private TutorEmpresaRepository tutorEmpresaRepository;

    @Override
    public TutorEmpresa findById(Long id) {
        return tutorEmpresaRepository.findById(id);
    }
}
