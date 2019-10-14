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
@Table(name = "estados_de_vuelos")
public class EstadoVuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estadovuelos", length = 10)
	private Integer id;
	
	@Column(name = "descrp_estadovuelos", length = 60)
	private String descripcion;
	
	@OneToMany(mappedBy = "estadovuelo",fetch = FetchType.LAZY)
	private List<Vuelo> vuelo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Vuelo> getVuelo() {
		return vuelo;
	}

	public void setVuelo(List<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}


	
}
