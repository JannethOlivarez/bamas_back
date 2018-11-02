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
public class Audiometria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	private int audicionOidoDer;
	private int audicionOidoIzq;
	private int vozOidoDer;
	private int vozOidoIzq;
	private int audioOidoDer250;
	private int audioOidoDer500;
	private int audioOidoDer1000;
	private int audioOidoDer2000;
	private int audioOidoDer3000;
	private int audioOidoDer4000;
	private int audioOidoDer5000;
	private int audioOidoDer8000;
	private int audioOidoIzq250;
	private int audioOidoIzq500;
	private int audioOidoIzq1000;
	private int audioOidoIzq2000;
	private int audioOidoIzq3000;
	private int audioOidoIzq4000;
	private int audioOidoIzq5000;
	private int audioOidoIzq8000;
	@OneToOne
	@JoinColumn(name="idAudiometria")
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
	public int getAudicionOidoDer() {
		return audicionOidoDer;
	}
	public void setAudicionOidoDer(int audicionOidoDer) {
		this.audicionOidoDer = audicionOidoDer;
	}
	public int getAudicionOidoIzq() {
		return audicionOidoIzq;
	}
	public void setAudicionOidoIzq(int audicionOidoIzq) {
		this.audicionOidoIzq = audicionOidoIzq;
	}
	public int getVozOidoDer() {
		return vozOidoDer;
	}
	public void setVozOidoDer(int vozOidoDer) {
		this.vozOidoDer = vozOidoDer;
	}
	public int getVozOidoIzq() {
		return vozOidoIzq;
	}
	public void setVozOidoIzq(int vozOidoIzq) {
		this.vozOidoIzq = vozOidoIzq;
	}
	public int getAudioOidoDer250() {
		return audioOidoDer250;
	}
	public void setAudioOidoDer250(int audioOidoDer250) {
		this.audioOidoDer250 = audioOidoDer250;
	}
	public int getAudioOidoDer500() {
		return audioOidoDer500;
	}
	public void setAudioOidoDer500(int audioOidoDer500) {
		this.audioOidoDer500 = audioOidoDer500;
	}
	public int getAudioOidoDer1000() {
		return audioOidoDer1000;
	}
	public void setAudioOidoDer1000(int audioOidoDer1000) {
		this.audioOidoDer1000 = audioOidoDer1000;
	}
	public int getAudioOidoDer2000() {
		return audioOidoDer2000;
	}
	public void setAudioOidoDer2000(int audioOidoDer2000) {
		this.audioOidoDer2000 = audioOidoDer2000;
	}
	public int getAudioOidoDer3000() {
		return audioOidoDer3000;
	}
	public void setAudioOidoDer3000(int audioOidoDer3000) {
		this.audioOidoDer3000 = audioOidoDer3000;
	}
	public int getAudioOidoDer4000() {
		return audioOidoDer4000;
	}
	public void setAudioOidoDer4000(int audioOidoDer4000) {
		this.audioOidoDer4000 = audioOidoDer4000;
	}
	public int getAudioOidoDer5000() {
		return audioOidoDer5000;
	}
	public void setAudioOidoDer5000(int audioOidoDer5000) {
		this.audioOidoDer5000 = audioOidoDer5000;
	}
	public int getAudioOidoDer8000() {
		return audioOidoDer8000;
	}
	public void setAudioOidoDer8000(int audioOidoDer8000) {
		this.audioOidoDer8000 = audioOidoDer8000;
	}
	public int getAudioOidoIzq250() {
		return audioOidoIzq250;
	}
	public void setAudioOidoIzq250(int audioOidoIzq250) {
		this.audioOidoIzq250 = audioOidoIzq250;
	}
	public int getAudioOidoIzq500() {
		return audioOidoIzq500;
	}
	public void setAudioOidoIzq500(int audioOidoIzq500) {
		this.audioOidoIzq500 = audioOidoIzq500;
	}
	public int getAudioOidoIzq1000() {
		return audioOidoIzq1000;
	}
	public void setAudioOidoIzq1000(int audioOidoIzq1000) {
		this.audioOidoIzq1000 = audioOidoIzq1000;
	}
	public int getAudioOidoIzq2000() {
		return audioOidoIzq2000;
	}
	public void setAudioOidoIzq2000(int audioOidoIzq2000) {
		this.audioOidoIzq2000 = audioOidoIzq2000;
	}
	public int getAudioOidoIzq3000() {
		return audioOidoIzq3000;
	}
	public void setAudioOidoIzq3000(int audioOidoIzq3000) {
		this.audioOidoIzq3000 = audioOidoIzq3000;
	}
	public int getAudioOidoIzq4000() {
		return audioOidoIzq4000;
	}
	public void setAudioOidoIzq4000(int audioOidoIzq4000) {
		this.audioOidoIzq4000 = audioOidoIzq4000;
	}
	public int getAudioOidoIzq5000() {
		return audioOidoIzq5000;
	}
	public void setAudioOidoIzq5000(int audioOidoIzq5000) {
		this.audioOidoIzq5000 = audioOidoIzq5000;
	}
	public int getAudioOidoIzq8000() {
		return audioOidoIzq8000;
	}
	public void setAudioOidoIzq8000(int audioOidoIzq8000) {
		this.audioOidoIzq8000 = audioOidoIzq8000;
	}
	

}
