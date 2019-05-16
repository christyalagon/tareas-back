package proyecto.tareas.models;

import lombok.Data;

@Data
public class UsuariosSeparados {
    private Long id;
    private char perfil;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String centroEmpresa;
}
