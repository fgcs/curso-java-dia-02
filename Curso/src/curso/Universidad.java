package curso;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laboratorio
 */
public class Universidad {

    public static final String nombre ="UNEG";
    public static final String ubicacion ="Atlantico";
    
    private List<Carrera>Carreras;

    public Universidad() {
        Carreras = new ArrayList<>();
        //Carreras.add(new Carrera());
    }

    public Universidad(List<Carrera> Carreras) {
        this.Carreras = Carreras;
    }

    public List<Carrera> getCarreras() {
        return Carreras;
    }

    public void setCarreras(List<Carrera> Carreras) {
        this.Carreras = Carreras;
    }
    
}
