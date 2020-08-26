package emailapp;

import java.util.Scanner;

public class EmailApp {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmailaddress;
    //Constructor to recieve First Name and Last Name
    public EmailApp(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created for :" +this.firstName +"."+ this.lastName);

        //Method for asking department name

        this.department =  setDepartment();

    }
    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmailaddress() {
        return alternateEmailaddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String setDepartment() {
        System.out.println("Enter the  department Details /n 1  /n 2 /n 3");
        Scanner sc = new Scanner(System.in);
        int deptChoice = sc.nextInt();
        if(deptChoice == 0) { return "there is no such department";}
        else if (deptChoice ==1 ){ return "Sales";}
        else if (deptChoice == 2){return "Development" ;}
        else if (deptChoice == 3){return "Accounting";}

       return this.department = department;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmailaddress(String alternateEmailaddress) {
        this.alternateEmailaddress = alternateEmailaddress;
    }

    public String generatePassword()
    {
        return password;
    }
}
