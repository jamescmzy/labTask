public class Area{
    double length = 0;
    double breadth = 0;

    //creating Scanner with arguements
    Area(double length, double breadth){
          this.length =length;
           this.breadth =breadth;
    }

    //method returning area
    public double returnArea(){
        return length* breadth;
    }
}