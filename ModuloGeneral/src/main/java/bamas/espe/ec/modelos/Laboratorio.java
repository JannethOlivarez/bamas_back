package bamas.espe.ec.modelos;
import java.util.Date;

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
public class Laboratorio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	private String nombreExamen;
	private float ematocrito;
	private float velocidadSedi;
	private float leucocitos;
	private float formulaLeucocitaria;
	private float glucosa;
	private float urea;
	private float creatinina;
	private float acidoUrico;
	private float colesterol;
	private float trigliceridos;
	private float hdl;
	private float ldl;
	private float psa;
	private String toxicologia;
	private String pylori;
	private String hiv;
	private float hbsag;
	private String grupoSanguineo;
	private float densidad;
	private String reaccion;
	private float albumina;
	private String color;
	private String sangre;
	private String testEmbarazo;
	private String microscopico;
	private String parasitario;
	private String sagreOculta;
	//private int pdfecg;
	//private int feeg;
	//private int pdfRxPulmonar;
	//private int pdfRxColumnar;
	//private int pdfEndoscopia;
	//private int pdfEcoPelvico;
	//private int pdfEcoMamas;
	//private int doc;
	private Date fecha;
	@OneToOne
	@JoinColumn(name="idLaboratorio")
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
	
	public String getNombreExamen() {
		return nombreExamen;
	}
	public void setNombreExamen(String nombreExamen) {
		this.nombreExamen = nombreExamen;
	}
	public float getEmatocrito() {
		return ematocrito;
	}
	public void setEmatocrito(float ematocrito) {
		this.ematocrito = ematocrito;
	}
	public float getVelocidadSedi() {
		return velocidadSedi;
	}
	public void setVelocidadSedi(float velocidadSedi) {
		this.velocidadSedi = velocidadSedi;
	}
	public float getLeucocitos() {
		return leucocitos;
	}
	public void setLeucocitos(float leucocitos) {
		this.leucocitos = leucocitos;
	}
	public float getFormulaLeucocitaria() {
		return formulaLeucocitaria;
	}
	public void setFormulaLeucocitaria(float formulaLeucocitaria) {
		this.formulaLeucocitaria = formulaLeucocitaria;
	}
	public float getGlucosa() {
		return glucosa;
	}
	public void setGlucosa(float glucosa) {
		this.glucosa = glucosa;
	}
	public float getUrea() {
		return urea;
	}
	public void setUrea(float urea) {
		this.urea = urea;
	}
	public float getCreatinina() {
		return creatinina;
	}
	public void setCreatinina(float creatinina) {
		this.creatinina = creatinina;
	}
	public float getAcidoUrico() {
		return acidoUrico;
	}
	public void setAcidoUrico(float acidoUrico) {
		this.acidoUrico = acidoUrico;
	}
	public float getColesterol() {
		return colesterol;
	}
	public void setColesterol(float colesterol) {
		this.colesterol = colesterol;
	}
	public float getTrigliceridos() {
		return trigliceridos;
	}
	public void setTrigliceridos(float trigliceridos) {
		this.trigliceridos = trigliceridos;
	}
	public float getHdl() {
		return hdl;
	}
	public void setHdl(float hdl) {
		this.hdl = hdl;
	}
	public float getLdl() {
		return ldl;
	}
	public void setLdl(float ldl) {
		this.ldl = ldl;
	}
	public float getPsa() {
		return psa;
	}
	public void setPsa(float psa) {
		this.psa = psa;
	}
	public String getToxicologia() {
		return toxicologia;
	}
	public void setToxicologia(String toxicologia) {
		this.toxicologia = toxicologia;
	}
	public String getPylori() {
		return pylori;
	}
	public void setPylori(String pylori) {
		this.pylori = pylori;
	}
	public String getHiv() {
		return hiv;
	}
	public void setHiv(String hiv) {
		this.hiv = hiv;
	}
	public float getHbsag() {
		return hbsag;
	}
	public void setHbsag(float hbsag) {
		this.hbsag = hbsag;
	}
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}
	public float getDensidad() {
		return densidad;
	}
	public void setDensidad(float densidad) {
		this.densidad = densidad;
	}
	public String getReaccion() {
		return reaccion;
	}
	public void setReaccion(String reaccion) {
		this.reaccion = reaccion;
	}
	public float getAlbumina() {
		return albumina;
	}
	public void setAlbumina(float albumina) {
		this.albumina = albumina;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSangre() {
		return sangre;
	}
	public void setSangre(String sangre) {
		this.sangre = sangre;
	}
	public String getTestEmbarazo() {
		return testEmbarazo;
	}
	public void setTestEmbarazo(String testEmbarazo) {
		this.testEmbarazo = testEmbarazo;
	}
	public String getMicroscopico() {
		return microscopico;
	}
	public void setMicroscopico(String microscopico) {
		this.microscopico = microscopico;
	}
	public String getParasitario() {
		return parasitario;
	}
	public void setParasitario(String parasitario) {
		this.parasitario = parasitario;
	}
	public String getSagreOculta() {
		return sagreOculta;
	}
	public void setSagreOculta(String sagreOculta) {
		this.sagreOculta = sagreOculta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

}
