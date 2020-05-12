package Pessoa;

import java.util.Date;

public class Visita extends Pessoa {

    private String motivoVisita;
    private Boolean urgente;
    private Date dataVisita = new Date();


    public Visita(String nome,String cpf, String sexo, String motivo, Boolean urgente){
        super(nome, cpf, sexo);
        this.motivoVisita = motivo;
        this.urgente = urgente;
    }

    public String getMotivoVisita() {
        return this.motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public Boolean getUrgente() {
        return this.urgente;
    }

    public void setUrgente(Boolean urgente) {
        this.urgente = urgente;
    }

    public Date getDataVisita() {
        return this.dataVisita;
    }

    @Override
    public String toString(){
        return super.toString() + 
        " Motivo: " +
        this.motivoVisita + 
        " Urgencia: " + 
        this.urgente;
    }

}