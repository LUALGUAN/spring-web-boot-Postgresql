package ec.gob.agentes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.gob.agentes.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona,Integer>{
	
	

}
