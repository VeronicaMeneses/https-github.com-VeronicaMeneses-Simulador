/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;
import simulador.Proceso;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.*;

/**
 *
 * @author JuanDiego
 */
public class RAM {
    
    private int tamano;
    private ArrayList<Proceso> listaProceso;
    private int porcentaje;
    
    
    
    public RAM(int tamano){
        listaProceso = new ArrayList<Proceso>();
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
    
    public Proceso BuscarProceso(int id){
        int largoLista = this.listaProceso.size();
        for(int i=0;i<largoLista;i++){
            Proceso proceso = listaProceso.get(i);
            if(proceso.getId()==id){
                return proceso;
            }
        }
        System.out.println("Proceso no encontrado...");
        return null;
    }
    
    public void agregarProceso(Proceso proceso){
        listaProceso.add(proceso);
        System.out.println("Proceso ha sido agregado");
    }
    
    public void sacarProceso(int id){
        int largo = listaProceso.size();
        for(int i =0; i<largo;i++){
            Proceso proceso = listaProceso.get(i);
            if (proceso.getId()==id){
                listaProceso.remove(id);
                return;
            }
        }
        System.out.println("Proceso no encontrado...");
    }
    
    public ArrayList<Proceso> getLista(){
        return listaProceso;
    }
    
    public void setLista(ArrayList<Proceso> lista){
        this.listaProceso = lista;
    }
    
}
