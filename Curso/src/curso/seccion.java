/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class seccion {
    private int numeroSeccion;
    private ProfesorClase ProfesorAsignado;
    private List<EstudianteClase> estudiantes;

    public seccion(int numeroSeccion, ProfesorClase ProfesorAsignado, List<EstudianteClase> estudiantes) {
        this.numeroSeccion = numeroSeccion;
        this.ProfesorAsignado = ProfesorAsignado;
        this.estudiantes = estudiantes;
    }

    public seccion() {
        estudiantes= new ArrayList<>();
        
    }
    

    public int getNumeroSeccion() {
        return numeroSeccion;
    }

    public void setNumeroSeccion(int numeroSeccion) {
        this.numeroSeccion = numeroSeccion;
    }

    public ProfesorClase getProfesorAsignado() {
        return ProfesorAsignado;
    }

    public void setProfesorAsignado(ProfesorClase ProfesorAsignado) {
        this.ProfesorAsignado = ProfesorAsignado;
    }

    public List<EstudianteClase> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<EstudianteClase> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
