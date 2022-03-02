package teststudent;

import java.util.Scanner;

/**
 *
 * @author Ian Peter
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student std1, std2,std3;

        Date d1= new Date(12, "October", 1989);
        Date d2= new Date(13,"October",1987);

        std1= new Student("Smith ","John", "0791234",d1,true,30,"smith@gamil.com");
        std2= new Student("Brown ", "Jane", "0820829", d2,false,50,"brownjane@gmail.com");
        System.out.println(std1.name() + " is aged " + std1.age() + " ,email" + std1.emailAddress());
        System.out.println(std2.name() + " is aged " + std2.age() + " ,email" + std2.emailAddress());

        Scanner reader = new Scanner(System.in);

System.out.println("Enter your first name");
String firstName = reader.next();
System.out.println("Enter your second name");
String givenName = reader.next();
System.out.println("Enter your Student number");
String number= reader.next();
System.out.println("Enter your Date of Birth, date");
int date= reader.nextInt();
System.out.println("Enter your Date of Birth, month");
String month=reader.next();
System.out.println("Enter your Date of Birth, year");
int year=reader.nextInt();
Date d3= new Date(date,month,year);
System.out.println("Are you Male(Reply with Y or N)");
String gender=reader.next();
boolean male= true;
male =  "Y".equals(gender);
System.out.println("Input your age");
int age=reader.nextInt();
System.out.println("Input your email address");
String email=reader.next();
std3= new Student(firstName,givenName,number,d3,male,age,email);
System.out.println(std3.name() + " is aged " + std3.age() + " ,email: " + std3.emailAddress());
reader.close();
            }
        }


    }

}
