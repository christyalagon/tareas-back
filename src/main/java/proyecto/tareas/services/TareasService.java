package proyecto.tareas.services;

import proyecto.tareas.domain.Tareas;

public interface TareasService {
    public Tareas findById(Long id);
    public Tareas save(Tareas tarea);
}
