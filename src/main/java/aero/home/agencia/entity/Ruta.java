package aero.home.agencia.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rutas")
public class Ruta {

	@Id
	@Column(name = "codigo_ruta", length = 10)
	private String codigoRuta;
	
	@Column(name = "descrp_ruta", length = 40)
	private String descripcion;
	
	@OneToMany(mappedBy = "ruta", fetch = FetchType.LAZY)
	private List<Pasajero> pasajero;
	
	@OneToMany(mappedBy = "rutal", fetch = FetchType.LAZY)
	private List<Vuelo> vuelo;

	public String getCodigoRuta() {
		return codigoRuta;
	}

	public void setCodigoRuta(String codigoRuta) {
		this.codigoRuta = codigoRuta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Pasajero> getPasajero() {
		return pasajero;
	}

	public void setPasajero(List<Pasajero> pasajero) {
		this.pasajero = pasajero;
	}

	public List<Vuelo> getVuelo() {
		return vuelo;
	}

	public void setVuelo(List<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}


	
}
