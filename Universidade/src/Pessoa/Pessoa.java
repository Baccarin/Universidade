package Pessoa;

public class Pessoa {

    private String nome;
    private String cpf;
    private String sexo;

    public Pessoa(String nome, String cpf, String sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString (){
        return "Nome: " +
         this.nome + 
        " CPF: " + 
         this.cpf.toUpperCase() + 
         " Sexo: " +
          this.sexo.toUpperCase();
    }   


}