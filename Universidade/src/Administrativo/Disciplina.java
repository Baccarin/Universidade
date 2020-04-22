package Administrativo;

import java.util.ArrayList;

import Pessoa.Estudante;

public class Disciplina {

  
    private String nome;
    private Integer duracao;
    private ArrayList<Estudante> alunos;

    public Disciplina (String nome, Integer duracao){  
        this.nome = nome;
        this.duracao = duracao;
    }

    public Disciplina (String nome, Integer duracao, ArrayList<Estudante> alunos){  
        this.nome = nome;
        this.duracao = duracao;
        this.alunos = alunos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return this.duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Estudante> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Estudante> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString(){
        return 
        "Nome: " + 
        this.nome +
        " Duração: " +
        this.duracao +
        " Alunos: " +
        this.alunos;
    }



}