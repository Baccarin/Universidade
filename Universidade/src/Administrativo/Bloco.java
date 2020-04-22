package Administrativo;

public enum Bloco {

    A(1),B(2),C(3),D(4);
    
    public int valorBloco;
    Bloco(int valor) {
        valorBloco = valor;
    }

    public int getValor(){
        return valorBloco;
    }

} 