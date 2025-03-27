public class School{
    private String name;
    private int grade;
    private int id;
    private double lunchMoney;
    public School(String n,int g, int i, double l){
        name=n;
        grade=g;
        id=i;
        lunchMoney=l;
    }
    public void skipGrade(){
        if(grade<12){
            grade+=1;
        }
        else{
            System.out.println("congrats, you graduated!");
        }
    }
    public void buyLunch(){
        lunchMoney-=7.50;
    }
    public double getLunchMoney(){
        return lunchMoney;
    }
    public void addLunchMoney(double m){
        lunchMoney+=m;
    }
    public int getId(){
        return id;
    }
    public int getGrade(){
        return grade;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name+" is in "+grade+" grade with a student id of: "+id+" and $"+lunchMoney+" in their account";
    }
}
