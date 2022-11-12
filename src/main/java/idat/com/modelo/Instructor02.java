package idat.com.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor02")
public class Instructor02 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer instructorId;

	@Column
	private String nombre;

	@Column
	private String apellido;

	@Column
	private Double salario;

	public Instructor02() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor02(Integer instructorId, String nombre, String apellido, Double salario) {
		super();
		this.instructorId = instructorId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	public Integer getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(Integer instructorId) {
		this.instructorId = instructorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
