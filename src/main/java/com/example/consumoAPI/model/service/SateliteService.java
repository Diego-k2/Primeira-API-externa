package com.example.consumoAPI.model.service;

import com.example.consumoAPI.model.service.entity.Satelite;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SateliteService {


    public void buscarSatelite(){
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        RestTemplate restTemplate = new RestTemplate();
        restTemplate = restTemplateBuilder.build();
        final String URL = "https://api.wheretheiss.at/v1/satellites/25544";
        Satelite satelite = restTemplate.getForObject(URL, Satelite.class);

        System.out.println(satelite.getLatitude()  + satelite.getLatitude());

    }

}
