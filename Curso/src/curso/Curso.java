package curso;

public class Curso {
    Universidad univ=new Universidad();
    Carrera car= new Carrera ();
     car.setNombreCarrera("ingenieria");
     univ.getCarreras().add(car);
     
     
             
    ProfesorClase prof = new ProfesorClase("ingeniero",14,"jean",37,'M');
     
    Materia materia= new Materia();
    materia.setnombreMateria("programacion");
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            seccion Seccion = new seccion();
            Seccion.setNumeroSeccion(i+1);
            Seccion.setProfesorAsignado(prof);
            
            for (int j = 0; j < 10; j++) {
                EstudianteClase e = new EstudianteClase("1135",car.getNombreCarrera(),"estudiante",+j,20,'m');
                
                seccion.getEstudiantes().add(e);
                
            }
            materia.getsecciones().add(seccion);
        }
       pensum pensum = new pensum();
    }
}
