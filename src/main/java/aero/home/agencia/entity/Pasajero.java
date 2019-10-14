package aero.home.agencia.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pasajeros")
public class Pasajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pasaj")
	private Integer id;
	
	@Column(name = "nom_pasajero", length = 30, nullable = false )
	private String nombre;
	
	@Column(name = "apellidos", length = 50)
	private String apellidos;
	
	@Column(name = "sexo", length = 20)
	private String sexo;
	
	@Column(name = "fecha_nac")
	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nacionalidad_id")
	private Nacionalidad nacionalidad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ruta_id")
	private Ruta ruta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pasaje_id")
	private Pasaje pasajes;
	
	@ManyToMany(mappedBy = "pasajerose")
	private List<Avion> avione;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public Pasaje getPasajew() {
		return pasajes;
	}

	public void setPasajew(Pasaje pasajew) {
		this.pasajes = pasajew;
	}

	public List<Avion> getAvione() {
		return avione;
	}

	public void setAvione(List<Avion> avione) {
		this.avione = avione;
	}
		
}
