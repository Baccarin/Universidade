package app;

import java.util.Scanner;

import Administrativo.Curso;
import Administrativo.Disciplina;
import Administrativo.Universidade;
import Pessoa.Funcionario;
import Pessoa.Professor;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual o nome da universidade?");
        Universidade universidade = new Universidade(sc.nextLine());

        Boolean continua = true;
        Boolean continuaDisciplina = true;
        boolean cursoPresencial;

        while (continua) {

            System.out.println("Operação 1: adicionar um curso");
            System.out.println("Operação 2: adicionar um funcionário");

            switch (sc.nextInt()) {

                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do curso.");
                    String nome = sc.nextLine();
                    System.out.println("Digite a duração do curso.");
                    int duracao = sc.nextInt();
                    System.out.println("O curso é presencial?");
                    if (sc.next().equals("S")) {
                        cursoPresencial = true;
                    } else {
                        cursoPresencial = false;
                    }
                    Curso curso = new Curso(nome, duracao, cursoPresencial);
                    universidade.addCurso(curso);
                    System.out.println(curso.toString());

                    System.out.printf("Deseja adicionar disciplinas nesse curso (S/N)? ");
                    while (continuaDisciplina) {
                        if (sc.next().equals("S")) {
                            sc.nextLine();
                            System.out.println("Digite o nome da disciplina.");
                            String nomeDisciplna = sc.nextLine();
                            System.out.println("Digite a duração da disciplina.");
                            int duracaoDisciplina = sc.nextInt();
                            Disciplina disciplina = new Disciplina(nomeDisciplna, duracaoDisciplina);
                            curso.addDisciplina(disciplina);
                            System.out.println(curso.toString());
                            System.out.printf("Deseja adicionar mais disciplinas nesse curso (S/N)? ");
                            if (sc.next().equals("S")) {
                                continuaDisciplina = true;
                            } else {
                                continuaDisciplina = false;
                            }
                        }
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.printf("O funcionário é um professor(a)?");
                    if (sc.next().equals("S")) {
                        sc.nextLine();
                        System.out.println("Digite o nome do professor(a).");
                        String nomeProfessor = sc.nextLine();
                        System.out.println("Digite o cpf do professor(a).");
                        String cpfProfessor = sc.nextLine();
                        System.out.println("Digite o sexo do professor(a).");
                        String sexoProfessor = sc.nextLine();
                        System.out.printf("Digite o salário do professor(a).");
                        Double salarioProfessor = sc.nextDouble();
                        Professor professor = new Professor(nomeProfessor, cpfProfessor, sexoProfessor,
                                salarioProfessor);
                        universidade.addFuncionario(professor);        
                        System.out.println("Esse professor ministra alguma disciplina (S/N)?");
                        if (sc.next().equals("S")) {
                            sc.nextLine();
                            System.out.println("Digite o nome da disciplina.");
                            String nomeDisciplna = sc.nextLine();

                            if (universidade.getCursos().isEmpty()) {
                                System.out.println("Não existe nenhum curso nessa universidade. ");
                                System.out.println("Caso queira adicionar um curso, realize a operação 1. \n");
                            } else {
                                for (Curso cursoDisc : universidade.getCursos()) { // ajustar add disciplina para professor, tirar else de dentro do for
                                    for (Disciplina disc : cursoDisc.getDisciplinas()) {
                                        if (nomeDisciplna.equals(cursoDisc.getNome())) {
                                            professor.addDisciplina(disc);
                                        } else {
                                            System.out.println("Essa disciplina não existe. Deseja adicioná-la (S/N)? \n");
                                            if (sc.next().equals("S")) {
                                                System.out.println("Digite o nome da disciplina.");
                                                nomeDisciplna = sc.nextLine();
                                                System.out.println("Digite a duração da disciplina.");
                                                int duracaoDisciplina = sc.nextInt();
                                                Disciplina disciplina = new Disciplina(nomeDisciplna,
                                                        duracaoDisciplina);
                                                cursoDisc.addDisciplina(disciplina);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        sc.nextLine();
                        System.out.println("Digite o nome do funcionário(a).");
                        String nomeFuncionario = sc.nextLine();
                        System.out.println("Digite o cpf do funcionário(a).");
                        String cpfFuncionario = sc.nextLine();
                        System.out.println("Digite o sexo do funcionário(a).");
                        String sexoFuncionario = sc.nextLine();
                        System.out.println("Digite o cargo do funcionário(a).");
                        String cargoFuncionario = sc.nextLine();
                        System.out.println("Digite o salário do funcionário(a).");
                        Double salarioFuncionario = sc.nextDouble();
                        Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, sexoFuncionario,
                                cargoFuncionario, salarioFuncionario);
                        universidade.addFuncionario(funcionario);
                    }

            }

        }

        sc.close();
    }
}