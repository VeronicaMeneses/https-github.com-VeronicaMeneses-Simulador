/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;

public class RAM {
    
    int tamano;
    LinkedList<Proceso> listaProceso;
    int porcentaje;
     
    public RAM(int tamano){
        listaProceso = new LinkedList<Proceso>();
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
            if (proceso.id==id){
                listaProceso.remove(id);
                return;
            }
        }
        System.out.println("Proceso no encontrado...");
    }
     
    public LinkedList<Proceso> getLista(){
        return listaProceso;
    }   
}
