/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Mina {
    public int aceroXsegundo;
    public int tiempo;
    
    Mina(int aceroXsegundo,int tiempo){
        this.aceroXsegundo = aceroXsegundo;
        this.tiempo = tiempo;
    }
    
    public void configCantidad(){
        boolean flag = true;
        int tiempoNuevo = 0;
        int acero = 0;
        while(flag){
            String aceroInput = JOptionPane.showInputDialog("Ingrese la cantidad de acero por segundo");
            acero = Integer.parseInt(aceroInput);
            if(acero >= 1){
                flag = false;
            }
            else{
                JOptionPane.showMessageDialog(null,"Ingrese una cantidad de acero valida");
            }
        }
        flag = true;
        while(flag){
            String tiempoInput = JOptionPane.showInputDialog("Ingrese el tiempo de mineria de la mina");
            tiempoNuevo = Integer.parseInt(tiempoInput);
            if(tiempoNuevo >= 1){
                flag = false;
            }
            else{
                JOptionPane.showMessageDialog(null,"Ingrese un teimpo valido");
            }
        }
        aceroXsegundo = acero;
        tiempo = tiempoNuevo;
    }
}
