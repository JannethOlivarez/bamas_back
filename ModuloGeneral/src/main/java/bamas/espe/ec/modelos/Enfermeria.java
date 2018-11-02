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
public class Enfermeria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	private int estatura;
	private float peso;
	private String colorCabellos;
	private String colorOjos;
	private float imc;
	private int perimetroAbdominal;
	private int presionAcostadoSist;
	private int presionAcostadoDiast;
	private int presionSentadoSist;
	private int presionSentadoDiast;
	private int dePieSist;
	private int dePieDiast;
	private int pulsoBasal;
	private int pulsoDespuesEjercicio;
	private int pulsoMinutoDespues;
	private int indice;
	private String categoria;
	@OneToOne
	@JoinColumn(name="idEnfermeria" ,nullable=true)
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

	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getColorCabellos() {
		return colorCabellos;
	}
	public void setColorCabellos(String colorCabellos) {
		this.colorCabellos = colorCabellos;
	}
	public String getColorOjos() {
		return colorOjos;
	}
	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
	public int getPerimetroAbdominal() {
		return perimetroAbdominal;
	}
	public void setPerimetroAbdominal(int perimetroAbdominal) {
		this.perimetroAbdominal = perimetroAbdominal;
	}
	public int getPresionAcostadoSist() {
		return presionAcostadoSist;
	}
	public void setPresionAcostadoSist(int presionAcostadoSist) {
		this.presionAcostadoSist = presionAcostadoSist;
	}
	public int getPresionAcostadoDiast() {
		return presionAcostadoDiast;
	}
	public void setPresionAcostadoDiast(int presionAcostadoDiast) {
		this.presionAcostadoDiast = presionAcostadoDiast;
	}
	public int getPresionSentadoSist() {
		return presionSentadoSist;
	}
	public void setPresionSentadoSist(int presionSentadoSist) {
		this.presionSentadoSist = presionSentadoSist;
	}
	public int getPresionSentadoDiast() {
		return presionSentadoDiast;
	}
	public void setPresionSentadoDiast(int presionSentadoDiast) {
		this.presionSentadoDiast = presionSentadoDiast;
	}
	public int getDePieSist() {
		return dePieSist;
	}
	public void setDePieSist(int dePieSist) {
		this.dePieSist = dePieSist;
	}
	public int getDePieDiast() {
		return dePieDiast;
	}
	public void setDePieDiast(int dePieDiast) {
		this.dePieDiast = dePieDiast;
	}
	public int getPulsoBasal() {
		return pulsoBasal;
	}
	public void setPulsoBasal(int pulsoBasal) {
		this.pulsoBasal = pulsoBasal;
	}
	public int getPulsoDespuesEjercicio() {
		return pulsoDespuesEjercicio;
	}
	public void setPulsoDespuesEjercicio(int pulsoDespuesEjercicio) {
		this.pulsoDespuesEjercicio = pulsoDespuesEjercicio;
	}
	public int getPulsoMinutoDespues() {
		return pulsoMinutoDespues;
	}
	public void setPulsoMinutoDespues(int pulsoMinutoDespues) {
		this.pulsoMinutoDespues = pulsoMinutoDespues;
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
