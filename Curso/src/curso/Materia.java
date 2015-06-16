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
public class Materia {
    private String nombreMateria;
    private List<seccion> secciones;

    public Materia() {
        secciones= new ArrayList<>();
    }

    public Materia(String nombreMateria, List<seccion> secciones) {
        this.nombreMateria = nombreMateria;
        this.secciones = secciones;
    }
    

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public List<seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<seccion> secciones) {
        this.secciones = secciones;
    }
    
    
}
