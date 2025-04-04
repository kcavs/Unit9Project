public class Senior extends HighSchool{
    private int parking;
    public Senior(){
        super();
        parking=0;
    }
    public Senior(String n,int g, int i, double m, int l, int p){
    super(n,g,i,m,l);
    parking=p;
    }
    public int getParking() {
        return parking;
    }
    public void setParking(int parking) {
        this.parking = parking;
    }
    public int getGrade(){
        return 12;
    }
    public String getGradeName(){
        return "senior";
    }
    public String toString(){
        return super.toString()+" and parking lot space is "+parking;
    }
}