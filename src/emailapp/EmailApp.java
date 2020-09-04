package emailapp;

import java.util.Scanner;

public class EmailApp {
    private String firstName;
    private String lastName;
    private String password;
    private int PasswordLength =10;
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmailaddress;
    //Constructor to recieve First Name and Last Name
    public EmailApp(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created for :" +this.firstName +" "+ this.lastName);
        this.department =  setDepartment();
        System.out.println("Department: " +this.department);
        this.password = randamPassword(PasswordLength);
        System.out.println("Password: " +this.password);

        System.out.println("Email address is :" +firstName +"."+lastName+"@"+"companyName"+"."+"com");

    }


    private String setDepartment() {
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

    private String randamPassword(int length)
    {
        String PasswordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$%";
        char[] password = new char[length];
        for(int i=0;i<length;i++)
        {
            int rand = (int)(Math.random()*PasswordSet.length());
            password[i]= PasswordSet.charAt(rand);
        }

        return new String(password);
    }
    public int getMailboxCapacity(int mailboxCapacity)
    {
        return  this.mailboxCapacity = mailboxCapacity;
    }
    public String getAlternateEmailaddress(String alternateEmailaddress)
    {
        return this.alternateEmailaddress = alternateEmailaddress;
    }
    public String getPassword(String password)
    {
        return this.password = password;
    }


}
