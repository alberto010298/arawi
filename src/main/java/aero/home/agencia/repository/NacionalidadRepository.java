package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.Nacionalidad;

@Repository
public interface NacionalidadRepository extends JpaRepository<Nacionalidad, String>{

}
