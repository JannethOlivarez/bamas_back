package bamas.espe.ec.modelos;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HistoriaClinica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	private String numeroHc;
	private Date fechaCreacion;
	private String lugarCreacion;
	

	@OneToMany(cascade = CascadeType.ALL, mappedBy="historiaClinica")
	private Collection<Rem>rem;
	@OneToOne
	@JoinColumn(name = "idHistoriaClinica")
	private Paciente paciente;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Collection<Rem> getRem() {
		return rem;
	}
	public void setRem(Collection<Rem> rem) {
		this.rem = rem;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getNumeroHc() {
		return numeroHc;
	}
	public void setNumeroHc(String numeroHc) {
		this.numeroHc = numeroHc;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getLugarCreacion() {
		return lugarCreacion;
	}
	public void setLugarCreacion(String lugarCreacion) {
		this.lugarCreacion = lugarCreacion;
	}	
	

}
