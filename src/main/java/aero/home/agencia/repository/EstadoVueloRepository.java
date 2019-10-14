package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.EstadoVuelo;


@Repository
public interface EstadoVueloRepository extends JpaRepository<EstadoVuelo, Integer>{

	
}
