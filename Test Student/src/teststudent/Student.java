package teststudent;

/**
 *
 * @author Ian Peter
 */

public class Student {
    private String familyName,givenName;
    private String studentNumber;
    private Date birthDate;
    private boolean male;
    private int age;
    private String emailAddress;


    public Student(String f, String g, String s, Date b, boolean m, int a,String e){
        familyName=f;
        givenName=g;
        studentNumber=s;
        birthDate=b;
        male=m;
        age=a;
        emailAddress=e;

    }
    public int age(){
        return age;
    }
    public String emailAddress(){
        return emailAddress;
    }
    public String name(){
        return familyName+givenName;}
}
