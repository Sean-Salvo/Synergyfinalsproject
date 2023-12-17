package synergyfinalsproject;

import java.util.LinkedList;

public class dataBaseV2 {

    // NOTE: This class is only experimental. Made by ken.
    
    // this is set of linkedlist is for the user's account.
    private static LinkedList <String> usernameDB = new LinkedList<>();
    private static LinkedList <String> passwordDB = new LinkedList<>();
    
    // this set of linkedlist is for the user's personal information.
    private static LinkedList <String> firstNameDB = new LinkedList<>();
    private static LinkedList <String> middleNameDB = new LinkedList<>();
    private static LinkedList <String> surNameDB = new LinkedList<>();
    private static LinkedList <String> monthDB = new LinkedList<>();
    private static LinkedList <String> dayDB = new LinkedList<>();
    private static LinkedList <String> yearDB = new LinkedList<>();
    private static LinkedList <String> emailDB = new LinkedList<>();
    private static LinkedList <String> numberDB = new LinkedList<>();
    private static LinkedList <String> addressDB = new LinkedList<>();
    private static LinkedList <String> genderDB = new LinkedList<>();
    private static LinkedList <String> statusDB = new LinkedList<>();

    public void addAccountData(String regUsername, String regPassword) {

        this.usernameDB.add(regUsername);
        this.passwordDB.add(regPassword);

    }
    
    public void addUserInformation(String regFirstName, String regMiddleName, String regSurname, String regMonth, String regDay, String regYear, String regEmail, String regNumber, String regAddress, String regGender, String regStatus){
        
        this.firstNameDB.add(regFirstName);
        this.middleNameDB.add(regMiddleName);
        this.surNameDB.add(regSurname);
        this.monthDB.add(regMonth);
        this.dayDB.add(regDay);
        this.yearDB.add(regYear);
        this.emailDB.add(regEmail);
        this.numberDB.add(regNumber);
        this.addressDB.add(regAddress);
        this.genderDB.add(regGender);
        this.statusDB.add(regStatus);
        
    }
    
    public LinkedList<String> getUsernameDB(){
        
        return new LinkedList<>(usernameDB);
        
    }
    
    public LinkedList<String> getPasswordDB(){
        
        return new LinkedList<>(passwordDB);
        
    }
    
    public LinkedList<String> getfirstNameDB(){
        
        return new LinkedList<>(firstNameDB);
        
    }
    
    public LinkedList<String> getmiddleNameDB(){
        
        return new LinkedList<>(middleNameDB);
        
    }
    
    public LinkedList<String> getsurNameDB(){
        
        return new LinkedList<>(surNameDB);
        
    }
    
    public LinkedList<String> getmonthDB(){
        
        return new LinkedList<>(monthDB);
        
    }
    
    public LinkedList<String> getdayDB(){
        
        return new LinkedList<>(dayDB);
        
    }
    
    public LinkedList<String> getyearDB(){
        
        return new LinkedList<>(yearDB);
        
    }
    
    public LinkedList<String> getemailDB(){
        
        return new LinkedList<>(emailDB);
        
    }
    
    public LinkedList<String> getnumberDB(){
        
        return new LinkedList<>(numberDB);
        
    }
    
    public LinkedList<String> getaddressDB(){
        
        return new LinkedList<>(addressDB);
        
    }
    
}
