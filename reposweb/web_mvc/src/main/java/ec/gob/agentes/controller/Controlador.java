/**
 * 
 */
package ec.gob.agentes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ec.gob.agentes.model.Persona;
import ec.gob.agentes.repo.IPersonaRepo;

/**
 * @author PC-LG
 *
 */

@Controller
public class Controlador {
	
	@Autowired
	private IPersonaRepo repo;
	
	 @GetMapping("/greeting")
	    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		 
		 Persona p = new Persona();
		 p.setId_persona(1);
		 p.setNombre("Mitocode");
		 repo.save(p);
		 
		 model.addAttribute("name", name);
	        return "greeting";
	    }
	 
	 @GetMapping("/listar")
	    public String greeting(Model model) {
		 		 	 
		 model.addAttribute("personas", repo.findAll());
	        return "greeting";
	    }
	 
	

}
