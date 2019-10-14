package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.Pasaje;

@Repository
public interface PasajeRepository extends JpaRepository<Pasaje, String>{

}
