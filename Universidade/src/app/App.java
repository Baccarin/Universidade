package app;

import java.util.ArrayList;
import Administrativo.Curso;
import Administrativo.Disciplina;
import Pessoa.Estudante;
import Pessoa.Funcionario;
import Pessoa.Pessoa;
import Pessoa.Professor;
import Pessoa.Visita;

public class App {
    public static void main(
    String[] args) throws Exception {
       
    Professor professor = new Professor("Guilherme","000-000-000-00","masculino",10000.00);
        
    Estudante estudante = new Estudante("Guilherme", "000-","m", "eng comput", 5, "Noite");
        
    Visita visita = new Visita("Gui", "000", "sexo", "motivo", true);
        
    Disciplina disciplina = new Disciplina("nome", 10);
    Disciplina disciplina1 = new Disciplina("nome", 20);  
    Disciplina disciplina2 = new Disciplina("nome", 30);
  
    Curso curso = new Curso("nome", 50 , true ,new ArrayList<Disciplina>());

    ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    disciplinas.add(disciplina);
    disciplinas.add(disciplina1);
    disciplinas.add(disciplina2); 
    curso.setDisciplinas(disciplinas);
    
    Funcionario funcionario = new Funcionario("nome", "cpf", "sexo", "cargo", 10.00);

    Pessoa pessoa = new Pessoa("nome", "cpf", "sexo");

    System.out.println(curso);
    System.out.println(disciplina);

    System.out.println(estudante);
    System.out.println(funcionario);
    System.out.println(pessoa);
    System.out.println(professor);
    System.out.println(visita);
    
    }
}