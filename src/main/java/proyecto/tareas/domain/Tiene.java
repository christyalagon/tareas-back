package proyecto.tareas.domain;

import lombok.NoArgsConstructor;
import proyecto.tareas.models.TareaYAlumno;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
@NoArgsConstructor
public class Tiene implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;
	@Column(name = "nombre")
	private String nombreProyecto;
	@Column(name = "codigo_tarea")
	private String codigoTarea;

	public Tiene(String codigo, String nombre){
		this.codigoTarea = codigo;
		this.nombreProyecto = nombre;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getCodigoTarea() {
		return codigoTarea;
	}

	public void setCodigoTarea(String codigoTarea) {
		this.codigoTarea = codigoTarea;
	}

}