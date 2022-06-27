package com.example.consumoAPI.controller;

import com.example.consumoAPI.model.service.SateliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/teste")
public class SateliteController {

    @Autowired
    SateliteService sateliteService;

    @GetMapping(value = "/maps")
    public String index(){

        sateliteService.buscarSatelite();

        return "index";
    }


}
