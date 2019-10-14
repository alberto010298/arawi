package aero.home.agencia.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marcas")
public class Marca {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod")
	private String idMarca;
	
	@Column(name = "nomb_marca", length = 60)
	private String nombreMarca;
	
	@OneToMany(mappedBy = "marcasw")
	private List<Avion> avion;

	public String getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(String idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public List<Avion> getAvion() {
		return avion;
	}

	public void setAvion(List<Avion> avion) {
		this.avion = avion;
	}
	
}
