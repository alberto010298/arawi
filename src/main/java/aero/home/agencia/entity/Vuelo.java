package aero.home.agencia.entity;

import java.security.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vuelos")
public class Vuelo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cood_vuelo")
	private String codigoVuelo;
	
	@Column(name = "nombre_aero", length = 60)
	private String nombreVuelo;
	
	@Column(name = "fecha_vuelo", length = 60)
	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp fecha_hora;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "avion_id")
	private Avion avionest;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estvuelo_id")
	private EstadoVuelo estadovuelo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ruta_id")
	private Ruta rutal;
	
	@OneToMany(mappedBy = "vueloss", fetch = FetchType.LAZY)
	private List<Pasaje> pasajes;
	
	//public Vuelo() {
		//avionest = new ArrayList<>();
	//}
	
	//public void addPaciente(Avion avion) {
		//this.avionest.add(avion);
	//}

	public String getCodigoVuelo() {
		return codigoVuelo;
	}

	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}

	public String getNombreVuelo() {
		return nombreVuelo;
	}

	public void setNombreVuelo(String nombreVuelo) {
		this.nombreVuelo = nombreVuelo;
	}

	public Timestamp getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Timestamp fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public Avion getAvionest() {
		return avionest;
	}

	public void setAvionest(Avion avionest) {
		this.avionest = avionest;
	}

	public EstadoVuelo getEstadovuelo() {
		return estadovuelo;
	}

	public void setEstadovuelo(EstadoVuelo estadovuelo) {
		this.estadovuelo = estadovuelo;
	}

	public Ruta getRutal() {
		return rutal;
	}

	public void setRutal(Ruta rutal) {
		this.rutal = rutal;
	}

	public List<Pasaje> getPasajes() {
		return pasajes;
	}

	public void setPasajes(List<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}



}
