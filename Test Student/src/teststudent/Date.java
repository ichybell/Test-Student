package teststudent;

/**
 *
 * @author Ian Peter
 */

public class Date {
    private int day;
    private String month;
    private int year;

    public Date(int d, String m, int y){
        day=d;
        month=m;
        year=y;
    }

    public Date(){
        day=1;
        month= "January";
        year=2019;
    }

    public Date(Date d){
        this.day=d.day;
        this.month=d.month;
        this.year=d.year;
    }

    public int getDay(){
        return day;
    }

}
