package curso;

public class Curso {

    public static void main(String[] args) {
        
     PersonaClase per1= new PersonaClase("Jose",22,'m');
     EstudianteClase e1= new EstudianteClase("25696668","Ing. Informatico",per1.getNombre(),per1.getEdad(),per1.getSexo());
     ProfesorClase pro1=new ProfesorClase ("ingeniero",14,per1.getNombre(),per1.getEdad(),per1.getSexo());
     
     
        
    }
}
