package com.sda.PartyGenerator.service;


import com.sda.PartyGenerator.model.Impreza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PartyService {
    private final Map<Integer, Impreza> data= new HashMap<>();

 public Impreza findByAdres(Integer adres){
  return data.get(adres);
 }
@Value("${moj.komentarz}")
    private String message;
    public void printMessage() {
        System.out.println(message);

    }
}
