package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.Avion;

@Repository
public interface AvionRepository extends JpaRepository<Avion, Integer>{

}
