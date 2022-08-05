package br.com.mvc.voxy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.mvc.voxy.controller.ExitController;
import br.com.mvc.voxy.controller.FormController;

@SpringBootTest
class VoxyApplicationTests {
	
	@Autowired
	private ExitController exitController;
	
	@Autowired
	private FormController formController;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(exitController).isNotNull();
		assertThat(formController).isNotNull();
	}
	
}
