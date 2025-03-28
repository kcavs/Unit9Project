public class Tester {
    public static void main(String[]args){
        HighSchool student=new HighSchool("tosia",10,12345,700.75,133);
        System.out.println(student.getName());
        System.out.println(student.getLunchMoney());
        student.buyLunch();
        System.out.println(student.getLunchMoney());
        student.addLunchMoney(20.0);
        System.out.println(student.getLunchMoney());
        System.out.println(student.getGrade());
        student.skipGrade();
        System.out.println(student.getGrade());
        System.out.println(student.getGradeName());
    }
}
