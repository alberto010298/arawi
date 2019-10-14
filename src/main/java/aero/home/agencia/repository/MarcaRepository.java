package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.Marca;


@Repository
public interface MarcaRepository extends JpaRepository<Marca, String>{

}
