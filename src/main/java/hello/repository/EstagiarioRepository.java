package hello.repository;

import hello.model.Estagiario;
import org.springframework.data.repository.CrudRepository;

public interface EstagiarioRepository extends CrudRepository<Estagiario, Integer> {    
}