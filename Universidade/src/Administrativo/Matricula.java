package Administrativo;

import java.util.ArrayList;

import Pessoa.Estudante;

public class Matricula {

    private Estudante aluno;
    private Disciplina disciplina;
    private boolean aprovado = true;
    private ArrayList<Prova> provas;

    public Matricula() {
    }

    public Matricula(Estudante aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
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

    
    public boolean isAprovado() {
        Double notaFinal = 0.00;
        for (Prova prova : provas) {
            notaFinal = notaFinal + prova.getNota();
        }
        if (notaFinal / provas.size() > 6){
            return true;
        }
        return false;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public ArrayList<Prova> getProvas() {
        return this.provas;
    }

    public void setProvas(ArrayList<Prova> provas) {
        this.provas = provas;
    }

    @Override
    public String toString() {
        return " Aluno: " + getAluno().getNome() +
            " Disciplina: " + getDisciplina().getNome() +
            " Aprovado: " + isAprovado() +
            " Provas: " + getProvas() ;
    }



}