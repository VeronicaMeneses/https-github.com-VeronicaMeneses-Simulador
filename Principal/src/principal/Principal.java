/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Dictionary;
import java.util.Hashtable;
import principal.Proceso;
import principal.Disco;
import principal.RAM;

public class Principal {
    
    List<String> listaRecursos;
    List<Proceso> listaReady;
    List<String> listaBlocked;
    Dictionary paginacion;
    String ready;
    RAM ram;
    Disco disco;
    
    public Principal(){
        listaRecursos = new ArrayList<String>();
        listaReady = new LinkedList<Proceso>();
        listaBlocked = new LinkedList<String>();
        paginacion = new Hashtable();
        ram = new RAM(8000);
        disco = new Disco(10000);
    }
    
    public void verificarRAM_HD(Proceso proceso){
        
        if(ram.getTamano() != 0 && proceso.getMemoria() < ram.getTamano()){
            ram.agregarProceso(proceso);
        }
        else if(disco.getTamano()!= 0 && Proceso.memoria < disco.getTamano()){
            disco.agregarProceso(proceso);
        }
        else{
            System.out.println("Error en espacio de memoria y disco duro");
        }
    }
    
    public void crearProceso(){
        
    }
    
    public void RAM_HD(){
        
        LinkedList<Proceso> lista = ram.getLista();
        int largo = lista.size();
        
        for(int pos = 0, lista.largo > 0, pos++){
            
        }
    }

    public void HD_RAM(){
        
    }
    
    public List<Proceso> getLista(){
        return this.listaReady;
    }
    
    public void setLista(List lista){
        this.listaReady = lista;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
