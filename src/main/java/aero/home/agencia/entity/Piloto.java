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
@Table(name = "pilotos")
public class Piloto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idPiloto;
	
	@Column(name = "nomb_piloto", length = 60)
	private String nombre;
	
	@OneToMany(mappedBy = "piloto", fetch = FetchType.LAZY)
	private List<Avion> avion;

	public String getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(String idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Avion> getAvion() {
		return avion;
	}

	public void setAvion(List<Avion> avion) {
		this.avion = avion;
	}

	
	
	
}
