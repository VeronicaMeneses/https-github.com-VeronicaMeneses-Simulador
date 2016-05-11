/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;
import java.util.LinkedList;
import simulador.Proceso;

/**
 *
 * @author JuanDiego
 */
public class HDD {
    private int tamano;
    private LinkedList<Proceso> listaHDD;
    private int porcentaje;
    
    public HDD(int tamano){
        listaHDD = new LinkedList<Proceso>();
        this.tamano=tamano;
        this.porcentaje=100;
    }
    
    public int getTamano(){
        return this.tamano;
    }
    
    public int getPorcentaje(){
        return this.porcentaje;
    }
    
    public void setPorcentaje(int porcentaje){
        this.porcentaje+=porcentaje;
    }
    
        
        
    }
