import java.util.*;
public class Tester {
    public static void main(String[]args){
        ArrayList<School> students=new ArrayList<School>();
        School s1=new School();
        School s2= new School("tosia",10,19875,40.0);
        School s3=new HighSchool();
        School s4=new HighSchool("delia",10,14732,30.0,13);
        School s5=new Senior("luca",12,98765,50.0,15,2);
        School s6=new Senior();
        HighSchool s7=new Senior();
        HighSchool s8=new HighSchool();
        Senior s9=new Senior();
        Senior s10=s9;
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
    }
}
