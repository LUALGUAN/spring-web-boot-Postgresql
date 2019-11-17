package ec.gob.agentes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.gob.agentes.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario,Integer>{
	
	Usuario findByNombre(String nombre);

}
