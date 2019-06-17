package proyecto.tareas.domain;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Proyecto implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;
	@Column(name = "nombre", unique = true)
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "tutor_id")
	private Long tutorId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getTutorId() {
		return tutorId;
	}
	public void setTutorId(Long tutorId) {
		this.tutorId = tutorId;
	}
}
