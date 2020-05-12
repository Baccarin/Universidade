package Pessoa;

import Administrativo.Curso;
import Administrativo.Turno;

public class Estudante extends Pessoa {
    
    private Curso curso;
    private Integer periodo;
    private Turno turno;

    public Estudante(String nome, String cpf, String sexo){
        super(nome,cpf,sexo);
    }

    public Estudante(String nome, String cpf, String sexo , Curso curso , Integer periodo, Turno turno){
        super(nome,cpf,sexo);
        this.curso = curso;
        this.periodo = periodo;
        this.turno = turno;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Integer getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public String getTurno() {
        return this.turno.name();
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString(){
        
        return super.toString() +
            " Curso: " + this.curso +
            " Periodo: " + this.periodo +
            " Turno: " + this.turno ;
    }


}