package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, String>{

}
