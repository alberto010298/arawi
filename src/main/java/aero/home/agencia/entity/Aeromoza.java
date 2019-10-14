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
@Table(name = "aeromozas")
public class Aeromoza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "nombre_aero", length = 60)
	private String nombre;
	
	@OneToMany(mappedBy = "aeromoza",fetch = FetchType.LAZY)
	private List<Avion> avion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
