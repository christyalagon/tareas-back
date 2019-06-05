package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Profesor;
import proyecto.tareas.domain.TutorEmpresa;
import proyecto.tareas.domain.Usuario;
import proyecto.tareas.models.UsuarioFusion;
import proyecto.tareas.repositories.ProfesorRepository;
import proyecto.tareas.repositories.TutorEmpresaRepository;
import proyecto.tareas.repositories.UsuarioRepository;
import proyecto.tareas.services.UsuarioService;

import java.util.ArrayList;
import java.util.List;

@Service("usuarioServiceImp")
public class UsuarioServiceImp implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private TutorEmpresaRepository tutorEmpresaRepository;
    @Autowired
    private ProfesorRepository profesorRepository;

    @Value("${usuario.perfil.profesor}")
    private char profesorPerfil;

    @Value("${usuario.perfil.empresa}")
    private char empresaPerfil;

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario login(String nombre) {
        Usuario usuarioLogueado = usuarioRepository.findByNombre(nombre);
        return usuarioLogueado;
    }

    @Override
    public List<UsuarioFusion> profesores() {
        List<Usuario> usuarios = usuarioRepository.findByPerfil(profesorPerfil);
        List<UsuarioFusion> usuarioFusions = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            UsuarioFusion usuarioFusion = new UsuarioFusion(usuario);
            usuarioFusion.setCentroEmpresa(profesorRepository.findById(usuario.getId()).getCentroEducativo());
            usuarioFusions.add(usuarioFusion);
        }
        return usuarioFusions;
    }

    @Override
    public List<UsuarioFusion> tutoresEmpresa() {
        List<Usuario> usuarios = usuarioRepository.findByPerfil(empresaPerfil);
        List<UsuarioFusion> usuarioFusions = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            UsuarioFusion usuarioFusion = new UsuarioFusion(usuario);
            usuarioFusion.setCentroEmpresa(tutorEmpresaRepository.findById(usuario.getId()).getEmpresa());
            usuarioFusions.add(usuarioFusion);
        }
        return usuarioFusions;
    }

    @Override
    public List<UsuarioFusion> listarTodosFusionados() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        List<UsuarioFusion> usuarioFusions = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            UsuarioFusion usuarioFusion = new UsuarioFusion(usuario);
            if (usuario.getPerfil() == profesorPerfil) {
                usuarioFusion.setCentroEmpresa(profesorRepository.findById(usuario.getId()).getCentroEducativo());
            } else {
                usuarioFusion.setCentroEmpresa(tutorEmpresaRepository.findById(usuario.getId()).getEmpresa());

            }
            ;
            usuarioFusions.add(usuarioFusion);
        }
        return usuarioFusions;
    }

    @Override
    public UsuarioFusion guardarUsuario(UsuarioFusion usuarioFusion) {
        Usuario nuevoUser = new Usuario(usuarioFusion);
        TutorEmpresa tutorEmpresa = new TutorEmpresa(usuarioFusion);
        Profesor profesor = new Profesor(usuarioFusion);
        nuevoUser = usuarioRepository.save(nuevoUser);
        if (nuevoUser.getPerfil() == this.empresaPerfil) {
            tutorEmpresa = tutorEmpresaRepository.save(tutorEmpresa);
        } else if (nuevoUser.getPerfil() == this.profesorPerfil) {
            profesor = profesorRepository.save(profesor);
        }
        return usuarioFusion;
    }
}
