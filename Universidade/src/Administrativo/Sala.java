package Administrativo;

public class Sala {

    private Bloco bloco;
    private String numero;
    private Boolean ocupada = false;

    public Sala(Bloco bloco, String numero){
        this.bloco = bloco;
        this.numero = numero;
    }


    public Bloco getBloco() {
        return this.bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getOcupada() {
        return this.ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }

}