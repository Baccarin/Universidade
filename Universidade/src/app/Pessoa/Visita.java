package app.Pessoa;

public class Visita extends Pessoa{

    private String motivoVisita;
    private Boolean urgente;

    public Visita(){

    }

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

    @Override
    public String toString(){
        return super.toString() + " Motivo: " + this.motivoVisita + "Urgencia: " + this.urgente;
    }

}