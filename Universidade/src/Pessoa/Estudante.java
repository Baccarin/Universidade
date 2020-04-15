package Pessoa;

public class Estudante extends Pessoa {
    
    private String curso;
    private Integer periodo;
    private String turno;

    public Estudante(){
        super();
    }

    public Estudante(String nome, String cpf, String sexo , String curso , Integer periodo, String turno){
        super(nome,cpf,sexo);
        this.curso = curso;
        this.periodo = periodo;
        this.turno = turno;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString(){
        return super.toString() +
            " Curso: " + this.curso +
            " Periodo: " + this.periodo +
            " Turno: " + this.turno;
    }


}