/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.ArrayList;

/**
 *
 * @author emers
 */
public class DB {
    private static ArrayList<banda> bandas;

    public static ArrayList<banda> getBandas() {
        if(bandas == null){
            bandas = new ArrayList<>();
            bandas.add(new banda("Nickelback","Rock",0));
            bandas.add(new banda("Link Park","Rock",0));
            bandas.add(new banda("AcDc","Rock",0));
        }
        return bandas;
        
    }

    public static void addBanda(banda banda){
        bandas.add(banda);
    }
    
    public static void updateBanda(int index,banda banda){
        bandas.set(index,banda);
    }
    
    public static void remove(int index){
        bandas.remove(index);
    }
    
    
    
}
