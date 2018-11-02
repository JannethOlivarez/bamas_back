package bamas.espe.ec.modelos;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Rem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;	
	private String numeroREM;
	private Date fecha;
	private String objeto;
	private String gabinete;
	private String sumarioDefectosEnfer;
	private String recomendaciones;
	private String fichaProcesado;
	private String calificacion;
	private String calificador;
	private String numeralesNoCalificacion;
	private String recalificacion;
	private String recalificador;
	private String numeralesRecalificacion;
	@JoinColumn(name="idRem")
	@ManyToOne
	private HistoriaClinica historiaClinica;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
		
	public String getNumeroREM() {
		return numeroREM;
	}
	public void setNumeroREM(String numeroREM) {
		this.numeroREM = numeroREM;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getObjeto() {
		return objeto;
	}
	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}
	public String getGabinete() {
		return gabinete;
	}
	public void setGabinete(String gabinete) {
		this.gabinete = gabinete;
	}
	public String getSumarioDefectosEnfer() {
		return sumarioDefectosEnfer;
	}
	public void setSumarioDefectosEnfer(String sumarioDefectosEnfer) {
		this.sumarioDefectosEnfer = sumarioDefectosEnfer;
	}
	public String getRecomendaciones() {
		return recomendaciones;
	}
	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	public String getFichaProcesado() {
		return fichaProcesado;
	}
	public void setFichaProcesado(String fichaProcesado) {
		this.fichaProcesado = fichaProcesado;
	}
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	public String getCalificador() {
		return calificador;
	}
	public void setCalificador(String calificador) {
		this.calificador = calificador;
	}
	public String getNumeralesNoCalificacion() {
		return numeralesNoCalificacion;
	}
	public void setNumeralesNoCalificacion(String numeralesNoCalificacion) {
		this.numeralesNoCalificacion = numeralesNoCalificacion;
	}
	public String getRecalificacion() {
		return recalificacion;
	}
	public void setRecalificacion(String recalificacion) {
		this.recalificacion = recalificacion;
	}
	public String getRecalificador() {
		return recalificador;
	}
	public void setRecalificador(String recalificador) {
		this.recalificador = recalificador;
	}
	public String getNumeralesRecalificacion() {
		return numeralesRecalificacion;
	}
	public void setNumeralesRecalificacion(String numeralesRecalificacion) {
		this.numeralesRecalificacion = numeralesRecalificacion;
	}
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

}
