package com.sais.banque.metier;

import org.springframework.data.rest.core.config.Projection;


//  http://localhost:8081/clients/1?projection=pclient
//  http://localhost:8081/comptes/3?projection=pclient
@Projection(name = "pclient",types = {Client.class,Compte.class})
public interface ClientProjection {
    public String getName();
}
