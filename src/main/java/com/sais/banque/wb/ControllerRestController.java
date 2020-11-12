package com.sais.banque.wb;

import com.sais.banque.dao.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/rc")
public class ControllerRestController {

    @Autowired
    CompteRepository compteRepository;


    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello Yousra";
    }
}
