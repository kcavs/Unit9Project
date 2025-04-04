public class HighSchool extends School{
    private int lockerNum;
    private String gradeName;
    public HighSchool(){
        super();
        lockerNum=0;
    }
    public HighSchool(String n,int g, int i, double m, int l){
        super(n,g,i,m);
        lockerNum=l;
    }
    public int getLockerNum(){
        return lockerNum;
    }
    public void moveLocker(int i){
        lockerNum=i;
    }
    public String getGradeName(){
        if(super.getGrade()<9){
            gradeName= "not in highschool, get out";
        }
        if (super.getGrade()==9){
            gradeName= "freshmen";
        }
        if (super.getGrade()==10){
            gradeName= "sophmore";
        }
        if(super.getGrade()==11){
            gradeName="junior";
        }
        if(super.getGrade()==12){
            gradeName="senior";
        }
       return gradeName;
    }
    public String toString(){
        return super.toString()+" and their locker number is: "+lockerNum;
    }
}
