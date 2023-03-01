package br.com.petz.Clientepet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class ClientePetApplication {
	
	@GetMapping("teste")
	public String javaHome() {
		return "teste JAVA-HOME";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientePetApplication.class, args);
	}

}
