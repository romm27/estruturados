package com.example.estruturados;

public class Pilha {
    private int topo;
    private int dados[];
    
    public boolean vazia(){
        return topo <= -1;
    }
    
    public boolean cheia(){
        return topo == dados.length -1;
    }
}
