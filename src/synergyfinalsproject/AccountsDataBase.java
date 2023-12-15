        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synergyfinalsproject;

import java.util.LinkedList;

public class AccountsDataBase {

    private LinkedList<String> FirstName;
    private LinkedList<String> MiddleName;
    private LinkedList<String> SurName;
    private LinkedList<String> Gender;
    private LinkedList<String> BirthDate;
    private LinkedList<String> Status;
    private LinkedList<String> Email;
    private LinkedList<String> ContactNum;
    private LinkedList<String> Addresses;

    public AccountsDataBase() {
        this.FirstName = new LinkedList<>();
        this.MiddleName = new LinkedList<>();
        this.SurName = new LinkedList<>();
        this.Gender = new LinkedList<>();
        this.BirthDate = new LinkedList<>();
        this.Status = new LinkedList<>();
        this.Email = new LinkedList<>();
        this.ContactNum = new LinkedList<>();
        this.Addresses = new LinkedList<>();

    }

    public void addData(String firstName, String middleName, String surName, String gender, String birthDate, String status, String email, String contactNum, String addresses) {
        FirstName.add(firstName);
        MiddleName.add(middleName);
        SurName.add(surName);
        Gender.add(gender);
        BirthDate.add(birthDate);
        Status.add(status);
        Email.add(email);
        ContactNum.add(contactNum);
        Addresses.add(addresses);

    }

    public LinkedList<String> getAllFirstName() {
        return new LinkedList<>(FirstName);
    }

    public LinkedList<String> getAllMiddleName() {
        return new LinkedList<>(MiddleName);
    }

    public LinkedList<String> getAllSurName() {
        return new LinkedList<>(SurName);
    }

    public LinkedList<String> getAllGender() {
        return new LinkedList<>(Gender);
    }

    public LinkedList<String> getAllBirthDate() {
        return new LinkedList<>(BirthDate);
    }

    public LinkedList<String> getAllStatus() {
        return new LinkedList<>(Status);
    }

    public LinkedList<String> getAllEmail() {
        return new LinkedList<>(Email);
    }

    public LinkedList<String> getAllContactNum() {
        return new LinkedList<>(ContactNum);
    }

    public LinkedList<String> getAllAddresses() {
        return new LinkedList<>(Addresses);
    }

}
