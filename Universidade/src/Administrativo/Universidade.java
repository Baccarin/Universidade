package Administrativo;

import java.util.ArrayList;

import Pessoa.Funcionario;

public class Universidade {
    
    private String nome;
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Universidade (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursos() {
        return this.cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void addCurso(Curso curso){
        this.cursos.add(curso);
    }

    public void removeCurso(Curso curso){
        this.cursos.remove(curso);
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome +
            " Curso: " + this.cursos.toString();
    }




}