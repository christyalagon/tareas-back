package proyecto.tareas.services;

import proyecto.tareas.domain.Realiza;

public interface RealizaService {
    public Realiza findById(Long id);
    public Realiza guardarSinNota(Realiza realiza);
    public Realiza guardarConNota(Realiza realiza);
}
