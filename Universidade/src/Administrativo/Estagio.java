package Administrativo;

import Pessoa.Estudante;

public class Estagio {

    private Estudante aluno;
    private String empresa;
    private Boolean obrigatorio;
    private Double salario;


    public Estagio() {
    
    }

    public Estagio(Estudante aluno, String empresa, Boolean obrigatorio, Double salario){
        this.aluno = aluno;
        this.empresa = empresa;
        this.obrigatorio = obrigatorio;
        this.salario = salario;
    }


    public Estudante getAluno() {
        return this.aluno;
    }

    public void setAluno(Estudante aluno) {
        this.aluno = aluno;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Boolean getObrigatorio() {
        return this.obrigatorio;
    }

    public void setObrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return 
            "Nome: " + this.aluno.getNome() +
            " Empresa: " + this.empresa +
            " Obrigatório: " + this.obrigatorio +
            " Salário: " + this.salario;
    }

}