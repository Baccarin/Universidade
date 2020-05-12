package Administrativo;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private Integer duracao;
    private Boolean presencial = true;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Curso(String nome, Integer duracao, Boolean presencial){
        this.nome = nome;
        this.duracao = duracao;
        this.presencial = presencial;
    }

    public Curso(String nome, Integer duracao, Boolean presencial, ArrayList<Disciplina> disciplinas){
        this.nome = nome;
        this.duracao = duracao;
        this.presencial = presencial;
        this.disciplinas = disciplinas;
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

    public Boolean getPresencial() {
        return this.presencial;
    }

    public void setPresencial(Boolean presencial) {
        this.presencial = presencial;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }

    @Override
    public String toString(){
        return "Nome: " + 
        this.nome +
        " Duração: " +
        this.duracao +
        " Presencial: " + 
        this.presencial +
        " Disciplinas: " +
        this.disciplinas;
    }



}