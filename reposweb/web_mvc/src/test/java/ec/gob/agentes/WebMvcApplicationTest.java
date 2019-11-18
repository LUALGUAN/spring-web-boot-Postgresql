package ec.gob.agentes;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import ec.gob.agentes.model.Usuario;
import ec.gob.agentes.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebMvcApplicationTest {

	@Autowired
	private IUsuarioRepo repo;

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId_usuario(3);
		us.setNombre("mito");
		us.setClave(encoder.encode("123"));
		Usuario retorno = repo.save(us);

		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
