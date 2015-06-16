package curso;

public class ProfesorClase extends PersonaClase {

    private String profesion;
    private int AniosXp;

    public ProfesorClase(String profesion, int AniosXp, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.profesion = profesion;
        this.AniosXp = AniosXp;
    }

    public ProfesorClase(String profesion, int AniosXp) {
        super();
        this.profesion = profesion;
        this.AniosXp = AniosXp;

    }

    public ProfesorClase() {
        super();
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAniosXp() {
        return AniosXp;
    }

    public void setAniosXp(int AniosXp) {
        this.AniosXp = AniosXp;
    }

    @Override
    public String toString() {
        return super.toString() 
        +"\nProfesion: "+profesion+"\nAños de Experiencia: "+AniosXp;
    }
}
