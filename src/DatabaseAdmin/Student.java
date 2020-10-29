package DatabaseAdmin;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradYear;
    private int costofCourse;
    private int UniqueId;

    public  Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student's first Name: ");
        this.firstName= sc.nextLine();
        System.out.println("Enter the Student's Last Name: ");
        this.lastName= sc.nextLine();
        System.out.println("Enter the gradyear - 1 for freshman\n2 for mid year \n3 for final years");
        this.gradYear = sc.nextInt();
        System.out.println(firstName +" "+lastName+" "+gradYear);


    }

    public void setStudents()
    {


    }

    public void setUniqueId()
    {

    }



}
