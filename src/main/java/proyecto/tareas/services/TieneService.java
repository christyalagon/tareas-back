package proyecto.tareas.services;

import proyecto.tareas.domain.Tiene;

public interface TieneService {
    public Tiene findById(Long id);

    public Tiene guardar(Tiene tiene);
}
