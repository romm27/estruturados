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
    
    public boolean empilhar(int valor){
        if(cheia()){
            System.out.println("Tamanho da fila insuficiente!");
            return false; //<---- lidar com caso de tamanho insuficiente externamente
        }
        else{
            dados[topo] = valor;
            topo += 1;
            return true;
        }
    }
    
    public int desempilhar(){
        if(vazia()){
            System.out.println("A pilha está vazia!");
            return 0;
        }
        else{
            topo -= 1;
            return dados[topo];
        }
    }
}
