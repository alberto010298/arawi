package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.Pasajero;


@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, Integer>{

}
