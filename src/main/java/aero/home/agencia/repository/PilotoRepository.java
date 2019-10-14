package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.Piloto;


@Repository
public interface PilotoRepository extends JpaRepository<Piloto, String>{

}
