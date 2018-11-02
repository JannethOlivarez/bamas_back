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
public class Oftamologia {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	private int visionDistanteOjoDer;
	private int corrDerecho;
	private int visionDistanteOjoIzq;
	private int corrIzquierdo;
	private int refraccioOjoDerechoPor;
	private int refraccioOjoDerechoS;
	private int refraccionOjoDerechoCx;
	private int refraccioOjoIzquierdoPor;
	private int refraccionOjoIzquierdoS;
	private int refraccionOjoIzquierdoCx;
	private int visionCercanaOjoDer;
	private int visionCercanaOjoDerechoCorr;
	private int visioCercanaOjoIzq;
	private int visionCeranaOjoIzquierdoCorr;
	private String heteroforiaEn;
	private String heteroforiaEx;
	private String heteroforiaHd;
	private String heteroforiaHi;
	private int acomodacionOD;
	private int acomodacionOI;
	private int campoVisual;
	private int visionCromaticaCalificacion;
	private String visionCromaticoTestUtilizado;
	private int percepProfundidadSinLentes;
	private int percepProfundidadConLentes;
	private int perimetria;
	private String oftalmoscopico;
	private int visionNocturna;
	private int lenteRojo;
	private String tesionOcularDigtOD;
	private String tensionOcularDigtOI;
	private String ton;
	private String tensionOcularOD;
	private String tensionOcularOI;
	@OneToOne
	@JoinColumn(name="idOftamologia")
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
	public int getVisionDistanteOjoDer() {
		return visionDistanteOjoDer;
	}
	public void setVisionDistanteOjoDer(int visionDistanteOjoDer) {
		this.visionDistanteOjoDer = visionDistanteOjoDer;
	}
	public int getCorrDerecho() {
		return corrDerecho;
	}
	public void setCorrDerecho(int corrDerecho) {
		this.corrDerecho = corrDerecho;
	}
	public int getVisionDistanteOjoIzq() {
		return visionDistanteOjoIzq;
	}
	public void setVisionDistanteOjoIzq(int visionDistanteOjoIzq) {
		this.visionDistanteOjoIzq = visionDistanteOjoIzq;
	}
	public int getCorrIzquierdo() {
		return corrIzquierdo;
	}
	public void setCorrIzquierdo(int corrIzquierdo) {
		this.corrIzquierdo = corrIzquierdo;
	}
	public int getRefraccioOjoDerechoPor() {
		return refraccioOjoDerechoPor;
	}
	public void setRefraccioOjoDerechoPor(int refraccioOjoDerechoPor) {
		this.refraccioOjoDerechoPor = refraccioOjoDerechoPor;
	}
	public int getRefraccioOjoDerechoS() {
		return refraccioOjoDerechoS;
	}
	public void setRefraccioOjoDerechoS(int refraccioOjoDerechoS) {
		this.refraccioOjoDerechoS = refraccioOjoDerechoS;
	}
	public int getRefraccionOjoDerechoCx() {
		return refraccionOjoDerechoCx;
	}
	public void setRefraccionOjoDerechoCx(int refraccionOjoDerechoCx) {
		this.refraccionOjoDerechoCx = refraccionOjoDerechoCx;
	}
	public int getRefraccioOjoIzquierdoPor() {
		return refraccioOjoIzquierdoPor;
	}
	public void setRefraccioOjoIzquierdoPor(int refraccioOjoIzquierdoPor) {
		this.refraccioOjoIzquierdoPor = refraccioOjoIzquierdoPor;
	}
	public int getRefraccionOjoIzquierdoS() {
		return refraccionOjoIzquierdoS;
	}
	public void setRefraccionOjoIzquierdoS(int refraccionOjoIzquierdoS) {
		this.refraccionOjoIzquierdoS = refraccionOjoIzquierdoS;
	}
	public int getRefraccionOjoIzquierdoCx() {
		return refraccionOjoIzquierdoCx;
	}
	public void setRefraccionOjoIzquierdoCx(int refraccionOjoIzquierdoCx) {
		this.refraccionOjoIzquierdoCx = refraccionOjoIzquierdoCx;
	}
	public int getVisionCercanaOjoDer() {
		return visionCercanaOjoDer;
	}
	public void setVisionCercanaOjoDer(int visionCercanaOjoDer) {
		this.visionCercanaOjoDer = visionCercanaOjoDer;
	}
	public int getVisionCercanaOjoDerechoCorr() {
		return visionCercanaOjoDerechoCorr;
	}
	public void setVisionCercanaOjoDerechoCorr(int visionCercanaOjoDerechoCorr) {
		this.visionCercanaOjoDerechoCorr = visionCercanaOjoDerechoCorr;
	}
	public int getVisioCercanaOjoIzq() {
		return visioCercanaOjoIzq;
	}
	public void setVisioCercanaOjoIzq(int visioCercanaOjoIzq) {
		this.visioCercanaOjoIzq = visioCercanaOjoIzq;
	}
	public int getVisionCeranaOjoIzquierdoCorr() {
		return visionCeranaOjoIzquierdoCorr;
	}
	public void setVisionCeranaOjoIzquierdoCorr(int visionCeranaOjoIzquierdoCorr) {
		this.visionCeranaOjoIzquierdoCorr = visionCeranaOjoIzquierdoCorr;
	}
	public String getHeteroforiaEn() {
		return heteroforiaEn;
	}
	public void setHeteroforiaEn(String heteroforiaEn) {
		this.heteroforiaEn = heteroforiaEn;
	}
	public String getHeteroforiaEx() {
		return heteroforiaEx;
	}
	public void setHeteroforiaEx(String heteroforiaEx) {
		this.heteroforiaEx = heteroforiaEx;
	}
	public String getHeteroforiaHd() {
		return heteroforiaHd;
	}
	public void setHeteroforiaHd(String heteroforiaHd) {
		this.heteroforiaHd = heteroforiaHd;
	}
	public String getHeteroforiaHi() {
		return heteroforiaHi;
	}
	public void setHeteroforiaHi(String heteroforiaHi) {
		this.heteroforiaHi = heteroforiaHi;
	}
	public int getAcomodacionOD() {
		return acomodacionOD;
	}
	public void setAcomodacionOD(int acomodacionOD) {
		this.acomodacionOD = acomodacionOD;
	}
	public int getAcomodacionOI() {
		return acomodacionOI;
	}
	public void setAcomodacionOI(int acomodacionOI) {
		this.acomodacionOI = acomodacionOI;
	}
	public int getCampoVisual() {
		return campoVisual;
	}
	public void setCampoVisual(int campoVisual) {
		this.campoVisual = campoVisual;
	}
	public int getVisionCromaticaCalificacion() {
		return visionCromaticaCalificacion;
	}
	public void setVisionCromaticaCalificacion(int visionCromaticaCalificacion) {
		this.visionCromaticaCalificacion = visionCromaticaCalificacion;
	}
	public String getVisionCromaticoTestUtilizado() {
		return visionCromaticoTestUtilizado;
	}
	public void setVisionCromaticoTestUtilizado(String visionCromaticoTestUtilizado) {
		this.visionCromaticoTestUtilizado = visionCromaticoTestUtilizado;
	}
	public int getPercepProfundidadSinLentes() {
		return percepProfundidadSinLentes;
	}
	public void setPercepProfundidadSinLentes(int percepProfundidadSinLentes) {
		this.percepProfundidadSinLentes = percepProfundidadSinLentes;
	}
	public int getPercepProfundidadConLentes() {
		return percepProfundidadConLentes;
	}
	public void setPercepProfundidadConLentes(int percepProfundidadConLentes) {
		this.percepProfundidadConLentes = percepProfundidadConLentes;
	}
	public int getPerimetria() {
		return perimetria;
	}
	public void setPerimetria(int perimetria) {
		this.perimetria = perimetria;
	}
	public String getOftalmoscopico() {
		return oftalmoscopico;
	}
	public void setOftalmoscopico(String oftalmoscopico) {
		this.oftalmoscopico = oftalmoscopico;
	}
	public int getVisionNocturna() {
		return visionNocturna;
	}
	public void setVisionNocturna(int visionNocturna) {
		this.visionNocturna = visionNocturna;
	}
	public int getLenteRojo() {
		return lenteRojo;
	}
	public void setLenteRojo(int lenteRojo) {
		this.lenteRojo = lenteRojo;
	}
	public String getTesionOcularDigtOD() {
		return tesionOcularDigtOD;
	}
	public void setTesionOcularDigtOD(String tesionOcularDigtOD) {
		this.tesionOcularDigtOD = tesionOcularDigtOD;
	}
	public String getTensionOcularDigtOI() {
		return tensionOcularDigtOI;
	}
	public void setTensionOcularDigtOI(String tensionOcularDigtOI) {
		this.tensionOcularDigtOI = tensionOcularDigtOI;
	}
	public String getTon() {
		return ton;
	}
	public void setTon(String ton) {
		this.ton = ton;
	}
	public String getTensionOcularOD() {
		return tensionOcularOD;
	}
	public void setTensionOcularOD(String tensionOcularOD) {
		this.tensionOcularOD = tensionOcularOD;
	}
	public String getTensionOcularOI() {
		return tensionOcularOI;
	}
	public void setTensionOcularOI(String tensionOcularOI) {
		this.tensionOcularOI = tensionOcularOI;
	}
	
}
