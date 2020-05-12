package Pessoa;

import java.util.ArrayList;

import Administrativo.Disciplina;

public class Professor extends Funcionario{

    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, String cpf, String sexo,Double salario){
        super(nome,cpf,sexo,"Professor",salario); 
    }

    public Professor(String nome, String cpf, String sexo,Double salario, ArrayList<Disciplina> disciplinas){
        super(nome,cpf,sexo,"Professor",salario);
        this.disciplinas = disciplinas;
        
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



}