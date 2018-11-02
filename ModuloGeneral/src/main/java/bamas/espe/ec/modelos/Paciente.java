package bamas.espe.ec.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	private String antecedentesPersonales;
	private String antecedentesFamiliares;
	@OneToOne
	@JoinColumn(name = "idPaciente")
	private Persona persona;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public String getAntecedentesPersonales() {
		return antecedentesPersonales;
	}
	public void setAntecedentesPersonales(String antecedentesPersonales) {
		this.antecedentesPersonales = antecedentesPersonales;
	}
	public String getAntecedentesFamiliares() {
		return antecedentesFamiliares;
	}
	public void setAntecedentesFamiliares(String antecedentesFamiliares) {
		this.antecedentesFamiliares = antecedentesFamiliares;
	}
	
	
	
}
