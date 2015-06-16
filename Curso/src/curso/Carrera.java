package curso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laboratorio
 */
public class Carrera {
    
    private String NombreCarrera;
    private String Pensum;

    public Carrera() {
        
        
    }

    public Carrera(String NombreCarrera, String Pensum) {
        this.NombreCarrera = NombreCarrera;
        this.Pensum = Pensum;
    }

    
    public String getNombreCarrera() {
        return NombreCarrera;
    }

    public void setNombreCarrera(String NombreCarrera) {
        this.NombreCarrera = NombreCarrera;
    }

    public String getPensum() {
        return Pensum;
    }

    public void setPensum(String Pensum) {
        this.Pensum = Pensum;
    }
     
    
    
}
