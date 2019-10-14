package aero.home.agencia.entity;

import java.sql.Time;
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
@Table(name = "pasajes")
public class Pasaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "nro_puesto", length = 60)
	private String NroPuesto;
	
	@Column(name = "tipo_pasaje", length = 60)
	private String TipoPasaje;
	
	@Column(name = "hora_pasaje", length = 60)
	//@Temporal(TemporalType.TIME)
	private Time Hora;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vuelo_id")
	private Vuelo vueloss;

	@OneToMany(mappedBy = "pasajes", fetch = FetchType.LAZY)
	private List<Pasajero> pasajero;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNroPuesto() {
		return NroPuesto;
	}

	public void setNroPuesto(String nroPuesto) {
		NroPuesto = nroPuesto;
	}

	public String getTipoPasaje() {
		return TipoPasaje;
	}

	public void setTipoPasaje(String tipoPasaje) {
		TipoPasaje = tipoPasaje;
	}

	public Time getHora() {
		return Hora;
	}

	public void setHora(Time hora) {
		Hora = hora;
	}

	public Vuelo getVueloss() {
		return vueloss;
	}

	public void setVueloss(Vuelo vueloss) {
		this.vueloss = vueloss;
	}

	public List<Pasajero> getPasajero() {
		return pasajero;
	}

	public void setPasajero(List<Pasajero> pasajero) {
		this.pasajero = pasajero;
	}

	
	
}
