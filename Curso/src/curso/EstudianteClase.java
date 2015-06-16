package curso;

public class EstudianteClase extends PersonaClase {

    public EstudianteClase(String FichaAcademica, String Carrera, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.FichaAcademica = FichaAcademica;
        this.Carrera = Carrera;
    }

    public EstudianteClase(String FichaAcademica, String Carrera) {
        super();
        this.FichaAcademica = FichaAcademica;
        this.Carrera = Carrera;
    }

    public EstudianteClase() {
        super();
    }
    private String FichaAcademica;
    private String Carrera;

    public String getFichaAcademica() {
        return FichaAcademica;
    }

    public void setFichaAcademica(String FichaAcademica) {
        this.FichaAcademica = FichaAcademica;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nFichaAcademica"+FichaAcademica+"\nCarrera"+Carrera;
    }
}
