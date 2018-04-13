package userlogin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kundenerstellung
        Customer k1 = new Customer("Madmax", "password1", "Max", "Mustermann", 1);
        Customer k2 = new Customer("Jack", "password1", "Hans", "Bohne", 2);
        Customer k3 = new Customer("Jack", "password1", "Peter", "Pan", 3);

        if (k2.equals(k3)) {
            System.out.println("Gleich ");

        } else {
            System.out.println("Verschieden ");
        }

        System.out.println("Eingabe Username: ");
        String userName = input.nextLine();

        System.out.println("Eingabe Passwort: ");
        String password = input.nextLine();

        System.out.println("Username? "+userName.hashCode());
        System.out.println("Passwort? "+password.hashCode());

        System.out.println("Passwort k1: "+k1.getCustomer());

        
        
        

        //Ausgabe Kundenliste einzeln
        //Kundenliste über HashMap
        /*     Map<String, Customer> accountList = new HashMap<>();
        accountList.put("ID 1 ", new Customer("Madmax", "password1", "Max", "Mustermann", 1));
        accountList.put("ID 2 ", new Customer("Jack", "password1", "Hans", "Bohne", 2));

        for (Customer test : accountList.values()) {
            System.out.println("Login Kunden: " + test.getLogin());
            System.out.println("Kundenname: " + test.getCustomer());

        }
        /*       boolean checkLogin1 = 
                = //    boolean checkLogin1 = accountList.equals(userName);
                   boolean checkLogin1 = ;
  
       if (checkLogin1) {
    
   return;
        } else {
            System.out.println("Du bist kein Kunde. Bitte neu registrieren");
        }
        
                boolean checkLogin = input.equals(k1);
        if (checkLogin) {
            System.out.println("Herzlich Willkommen");
        } else {
            System.out.println("Du bist leider kein Kunde");
        }
        
                boolean checkLogin = userName.equals(k3);
        if (checkLogin) {
            System.out.println("Herzlich Willkommen");
        } else {
            System.out.println("Du bist leider kein Kunde");
        }
        
         */
    }

}
