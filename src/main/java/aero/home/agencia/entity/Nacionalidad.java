package aero.home.agencia.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nacionalidades")
public class Nacionalidad {

	@Id
	@Column(name = "id_nacionalidad", length = 10)
	private String codigoNacionalidad;
	
	@Column(name = "nom_nacionali", length = 60)
	private String nombreNacionalidad;
	
	@OneToMany(mappedBy = "nacionalidad",fetch = FetchType.LAZY)
	private List<Pasajero> pasajeros;

	public String getCodigoNacionalidad() {
		return codigoNacionalidad;
	}

	public void setCodigoNacionalidad(String codigoNacionalidad) {
		this.codigoNacionalidad = codigoNacionalidad;
	}

	public String getNombreNacionalidad() {
		return nombreNacionalidad;
	}

	public void setNombreNacionalidad(String nombreNacionalidad) {
		this.nombreNacionalidad = nombreNacionalidad;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}


	
}
