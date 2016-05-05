/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;
import progra.Proceso;
import java.util.LinkedList;
import java.util.Arrays;

/**
 *
 * @author JuanDiego
 */
public class RAM {
    
    int tamano;
    LinkedList<Proceso> listaProceso;
    int porcentaje;
    
    
    
    public RAM(int tamano){
        listaProceso = new LinkedList<Proceso>();
        this.tamano=tamano;
        this.porcentaje=100;
    }
    
    public Arrays devolverPorcentaje(){
        int Arraylist lista = new Arraylist(2);
    }
    
    public Proceso BuscarProceso(int id){
        int largoLista = this.listaProceso.size();
        
    }
    
}
