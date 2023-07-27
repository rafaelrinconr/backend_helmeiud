package co.edu.iudigital.helpmeiud.repository;

import co.edu.iudigital.helpmeiud.model.Delito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //Anotación opcional
public interface IDelitoRepository extends JpaRepository<Delito, Long> {

    List<Delito> findByNombre(String nombre);
}
