package aero.home.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aero.home.agencia.entity.Aeromoza;

@Repository
public interface AeromozaRepository extends JpaRepository<Aeromoza, String>{

}
