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
public class Psicologia {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	//private String pdfExamenPsico;
	private String observaciones;
	private String nombrePsicologo;
	private String opinion;
	@OneToOne
	@JoinColumn(name="idPsicologia")
	private HistoriaClinica historiaClinica;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getNombrePsicologo() {
		return nombrePsicologo;
	}
	public void setNombrePsicologo(String nombrePsicologo) {
		this.nombrePsicologo = nombrePsicologo;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	

}
