package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.Ruta;

@Repository
public interface RutaRepository extends JpaRepository<Ruta, String>{

}
