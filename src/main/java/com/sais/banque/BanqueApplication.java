package com.sais.banque;

import com.sais.banque.dao.ClientRepository;
import com.sais.banque.dao.CompteRepository;
import com.sais.banque.metier.Client;
import com.sais.banque.metier.Compte;
import com.sais.banque.metier.TypeCompte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BanqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CompteRepository compteRepository, ClientRepository clientRepository) {
		return args -> {
			Client c1= clientRepository.save(new Client(null,"Souraya",7,new Date(),null));
			compteRepository.save(new Compte(null,"Youness",Math.random()*9000,new Date(), TypeCompte.COURANT,c1));
			compteRepository.save(new Compte(null,"Youness",Math.random()*9000,new Date(), TypeCompte.EPARGNE,c1));
			compteRepository.save(new Compte(null,"Youness",Math.random()*9000,new Date(), TypeCompte.COURANT,c1));
			compteRepository.save(new Compte(null,"Youness",Math.random()*9000,new Date(), TypeCompte.COURANT,c1));
			compteRepository.save(new Compte(null,"Youness",Math.random()*9000,new Date(), TypeCompte.EPARGNE,c1));

		};
	}

}
