package Administrativo;

import java.text.SimpleDateFormat;
import java.util.Date;
import Pessoa.Estudante;

public class Prova {

    private Estudante aluno;
    private Disciplina disciplina;
    private Double nota;
    private Date dataAplicada ; 

    public Prova(Estudante aluno, Disciplina disciplina , Double nota){
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
        this.dataAplicada = new Date();
    }

    public Estudante getAluno() {
        return this.aluno;
    }

    public void setAluno(Estudante aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Double getNota() {
        return this.nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }



    @Override
    public String toString(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        return 
        "Aluno: " + 
        this.aluno.getNome() +
        " Disciplina: " +
        this.disciplina.getNome() +
        " Nota: " +
        this.nota +
        " Data de aplicação: " + formato.format(this.dataAplicada);
    }


}