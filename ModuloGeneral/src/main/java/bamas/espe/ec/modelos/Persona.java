package bamas.espe.ec.modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String cedula;
	private String direccion;
	private String telefono;
	private Date fechaNacimiento;
	private String lugarNacimiento;
	private String raza;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estado_civil_id", insertable = false, updatable = false)
	private Catalogo estadoCivil;
	
	@Column(name="estado_civil_id")
	private Long estadoCivilId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sexo_id", insertable = false, updatable = false)
	private Catalogo sexo;
	
	@Column(name="sexo_id")
	private Long sexoId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Catalogo getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Catalogo estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Long getEstadoCivilId() {
		return estadoCivilId;
	}

	public void setEstadoCivilId(Long estadoCivilId) {
		this.estadoCivilId = estadoCivilId;
	}

	public Catalogo getSexo() {
		return sexo;
	}

	public void setSexo(Catalogo sexo) {
		this.sexo = sexo;
	}

	public Long getSexoId() {
		return sexoId;
	}

	public void setSexoId(Long sexoId) {
		this.sexoId = sexoId;
	}

	

}
