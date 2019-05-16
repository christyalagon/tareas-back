package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import proyecto.tareas.domain.Usuario;
import proyecto.tareas.domain.UsuarioFusion;
import proyecto.tareas.models.UsuariosSeparados;

import java.util.List;

public interface UsuarioFusionRepository extends JpaRepository<UsuarioFusion, Long> {
    List<UsuarioFusion> findAll();

}
