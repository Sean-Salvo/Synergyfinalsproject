
package synergyfinalsproject;

import java.util.LinkedList;

public class dataBaseV2 {
    
    // NOTE: This class is only experimental.
    
    private LinkedList <String> usernameDB;
    private LinkedList <String> passwordDB;
    
    public dataBaseV2(){
        
        usernameDB = new LinkedList<>();
        passwordDB = new LinkedList<>();
        
    }
    
    public void addUserData(String regUsername, String regPassword){
        
        usernameDB.add(regUsername);
        passwordDB.add(regPassword);
        
    }
    
    public LinkedList<String> getUsernameDB(){
        
        return new LinkedList<>(usernameDB);
        
    }
    
    public LinkedList<String> getPasswordDB(){
        
        return new LinkedList<>(passwordDB);
        
    }
    
}
