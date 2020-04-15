package Pessoa;

public class Funcionario extends Pessoa {

    private String cargo;
    private Double salario;

    public Funcionario (){
        super();
    }

    public Funcionario(String nome, String cpf, String sexo ,String cargo, Double salario){
        super(nome,cpf,sexo);
        this.cargo = cargo;
        this.salario = salario;
    }


    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return super.toString() + 
        " Cargo: " +
         this.cargo + 
         " Salário: " + 
         this.salario;
    }


}