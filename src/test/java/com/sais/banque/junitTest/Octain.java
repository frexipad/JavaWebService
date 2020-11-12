package com.sais.banque.junitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Octain {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contoller1() throws MalformedURLException {
        ResponseEntity<String> responseEntity =restTemplate.getForEntity(new URL("http://localhost:"+port+"/rc/hello").toString(),String.class);
        assertEquals("Hello Controller",responseEntity.getBody());
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);

    }
}
