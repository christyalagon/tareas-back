package proyecto.tareas.services;

import proyecto.tareas.domain.Proyecto;
import proyecto.tareas.models.ProyectoYTareas;
import proyecto.tareas.repositories.ProyectoRepository;

import java.util.List;

public interface ProyectoService {
    public Proyecto findById(Long id);

    public Proyecto guardarProyecto(Proyecto proyecto);

    public List<Proyecto> buscarPorTutorId(Long tutorId);

    public List<ProyectoYTareas> listarProyectosYTareas(Long tutorId);


}
