package userlogin;

public class Customer {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private int accountNumber;

    public Customer() {
    }

    public Customer(String userName, String password,String firstName, String lastName, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.password = password;
    }
    
    
    public String getCustomer(){
        return "\nKundenname: "+firstName+" "+lastName+"\nUsername: "+userName.hashCode()+"\nPasswort: "+password.hashCode();
        
    }    

    public void setLogin(String userName, String password) {  
        int hash = 0;
        int hUserName= userName.hashCode();
        int hPassWord= password.hashCode();
        
        hash = (17*hUserName)*(23*hPassWord);
        
        
    }
    
    public String getLogin(){
        return "\nUsername: "+userName+"\nPasswort: "+password;

       
    }
    

    @Override
    public String toString() {
        return "\n" + "Kundennummer: " + accountNumber + "\nKundenname " + firstName + " " + lastName + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Customer)) {
            return false;
        }
        if (!this.userName.equals(((Customer) obj).userName)) {
            return false;
        }
        if (!this.password.equals(((Customer) obj).password)) {
            return false;
        }
        return true;
    }

}
