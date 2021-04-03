package br.com.satyan.service;

import javax.enterprise.context.Dependent;

@Dependent
public class TesteService {

    public TesteService(){
        System.out.println("ServiceTest sendo instâciado");
    }

    public String teste(){
        return "vamos entender um pouco mais a injeção de dependencia";
    }
}
