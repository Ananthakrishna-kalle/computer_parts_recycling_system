/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels;


/**
 *
 * @author Vennela Bandla
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecoSystem;

    public EcoSystem() {
        super("Recube");
    }
    
    public static EcoSystem getInstance(){
        if(ecoSystem==null){
            ecoSystem=new EcoSystem();
        }
        return ecoSystem;
    }
    

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
    
    
}
