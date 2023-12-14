/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synergyfinalsproject;

import java.util.LinkedList;


public class DataBase {
 
    
    
    private LinkedList<String> names;
    private LinkedList<String> birthday;
    private LinkedList<String> gender;
    private LinkedList<String> IdNum;
    
    public DataBase () { 
        
        this.names = new LinkedList<>();
        this.birthday = new LinkedList<>();
        this.gender = new LinkedList<>();
        this.IdNum = new LinkedList<>();
}
    
    public void addData(String name, String Birthday, String Gender, String idNum) {
        names.add(name);
        birthday.add(Birthday);
        gender.add(Gender);
        IdNum.add(idNum);
    }

     public LinkedList<String> getAllNames() {
        return new LinkedList<>(names);
    }
    
      public LinkedList<String> getAllBirthday() {
        return new LinkedList<>(birthday);
    }
 
        public LinkedList<String> getAllGender() {
        return new LinkedList<>(gender);
    }
    
          public LinkedList<String> getAllIdNum() {
        return new LinkedList<>(IdNum);
    }
}
