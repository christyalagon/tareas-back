package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Usuario;
import proyecto.tareas.domain.UsuarioFusion;
import proyecto.tareas.models.UsuariosSeparados;
import proyecto.tareas.repositories.UsuarioFusionRepository;
import proyecto.tareas.repositories.UsuarioRepository;
import proyecto.tareas.services.UsuarioService;

import java.util.List;

@Service("usuarioServiceImp")
public class UsuarioServiceImp implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioFusionRepository usuarioFusionRepository;

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario login(String nombre) {
        Usuario usuarioLogueado = usuarioRepository.findByNombre(nombre);
        return usuarioLogueado;
    }

}
