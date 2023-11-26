package com.example.rafikatpsoa.web;

import com.example.rafikatpsoa.entities.Compte;
import com.example.rafikatpsoa.repositories.CompteRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
        @Path("/banque")
public class RestJaxrs {
    @Autowired
    private CompteRepository cmt_rep;
    @GET
    @Path("/comptes")
    @Transactional
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> compteList(){return  cmt_rep.findAll();}
}
