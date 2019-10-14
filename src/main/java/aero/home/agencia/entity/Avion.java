package aero.home.agencia.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aviones")
public class Avion {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_avion")
	private Integer codAvion;
	
	@Column(name = "descrip_avion", length = 60)
	private String descripcion;
	
	@Column(name = "marca_avion", length = 60)
	private String marca;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aeromoza_id")
	private Aeromoza aeromoza;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "piloto_id")
	private Piloto piloto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cod")
	private Marca marcasw;

	@OneToMany(mappedBy = "avionest", fetch = FetchType.LAZY)
	private List<Vuelo> vuelo;
	
	@ManyToMany
	@JoinTable(name = "avion_pasajero", 
		joinColumns = @JoinColumn(columnDefinition = "aviones_cod_avion"),
		inverseJoinColumns = @JoinColumn(columnDefinition = "pasajero_id"))
	private List<Pasajero> pasajerose;
	
	public Avion() {
		pasajerose = new ArrayList<>();
		vuelo = new ArrayList<>();
	}
	//-----------------
	public void addPasajero(Pasajero pasajero) {
		this.pasajerose.add(pasajero);
	}
	public void addVuelo(Vuelo vuelo) {
		this.vuelo.add(vuelo);
	}
	
	public Integer getCodAvion() {
		return codAvion;
	}
	public void setCodAvion(Integer codAvion) {
		this.codAvion = codAvion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Aeromoza getAeromoza() {
		return aeromoza;
	}
	public void setAeromoza(Aeromoza aeromoza) {
		this.aeromoza = aeromoza;
	}
	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public Marca getMarcasw() {
		return marcasw;
	}
	public void setMarcasw(Marca marcasw) {
		this.marcasw = marcasw;
	}
	
	public List<Vuelo> getVuelo() {
		return vuelo;
	}
	public void setVuelo(List<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}
	public List<Pasajero> getPasajerose() {
		return pasajerose;
	}
	public void setPasajerose(List<Pasajero> pasajerose) {
		this.pasajerose = pasajerose;
	}
	
	
	
	
}
