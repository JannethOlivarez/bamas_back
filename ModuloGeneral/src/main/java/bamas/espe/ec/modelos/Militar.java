package bamas.espe.ec.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Militar extends Persona {
	
	
	private int servicioMilitar;
	private String reparto;
	private String seccion;  
	private String materialVuelo;
	private int horasVuelo;
	private String accidentesIncidentes;
	private String jmaPrevias;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grado_id", insertable = false, updatable = false)
	private Catalogo grado;
	
	@Column(name="grado_id")
	private Long gradoId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "especialidaVuelo_id", insertable = false, updatable = false)
	private Catalogo especialidadVuelo;
	
	@Column(name="especialidaVuelo_id")
	private Long especialidadVueloId;
	
	public int getServicioMilitar() {
		return servicioMilitar;
	}
	public void setServicioMilitar(int servicioMilitar) {
		this.servicioMilitar = servicioMilitar;
	}
	public String getReparto() {
		return reparto;
	}
	public void setReparto(String reparto) {
		this.reparto = reparto;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;

	}
	public String getMaterialVuelo() {
		return materialVuelo;
	}
	public void setMaterialVuelo(String materialVuelo) {
		this.materialVuelo = materialVuelo;
	}
	public int getHorasVuelo() {
		return horasVuelo;
	}
	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}
	public String getAccidentesIncidentes() {
		return accidentesIncidentes;
	}
	public void setAccidentesIncidentes(String accidentesIncidentes) {
		this.accidentesIncidentes = accidentesIncidentes;
	}
	public String getJmaPrevias() {
		return jmaPrevias;
	}
	public void setJmaPrevias(String jmaPrevias) {
		this.jmaPrevias = jmaPrevias;
	}
	public Catalogo getGrado() {
		return grado;
	}
	public void setGrado(Catalogo grado) {
		this.grado = grado;
	}
	public Long getGradoId() {
		return gradoId;
	}
	public void setGradoId(Long gradoId) {
		this.gradoId = gradoId;
	}
	public Catalogo getEspecialidadVuelo() {
		return especialidadVuelo;
	}
	public void setEspecialidadVuelo(Catalogo especialidadVuelo) {
		this.especialidadVuelo = especialidadVuelo;
	}
	public Long getEspecialidadVueloId() {
		return especialidadVueloId;
	}
	public void setEspecialidadVueloId(Long especialidadVueloId) {
		this.especialidadVueloId = especialidadVueloId;
	}
		
}
