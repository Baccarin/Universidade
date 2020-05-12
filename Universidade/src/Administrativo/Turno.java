package Administrativo;

public enum Turno {
    
    Manha("Manhã"), Tarde("Tarde") , Noite("Noite");
    
    private final String nomeTurno;

    private Turno(String turno) {
        nomeTurno = turno;
    }

    public String getNomeTurno() {
        return nomeTurno;
    }

}