package com.example.rafikatpsoa;

import com.example.rafikatpsoa.entities.Compte;
import com.example.rafikatpsoa.entities.TypeCompte;
import com.example.rafikatpsoa.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class RafikaTpsoaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RafikaTpsoaApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository cmt_rep){
        return args -> {
            cmt_rep.save(new Compte(null, 30.0, new Date(), TypeCompte.EPARGNE));
            cmt_rep.save(new Compte(null, 70.0, new Date(), TypeCompte.COURANT));
            cmt_rep.save(new Compte(null, 58.0, new Date(), TypeCompte.EPARGNE));
            cmt_rep.findAll().forEach(c ->{
                System.out.println(c.getSolde());
            });
        };
    }


}
