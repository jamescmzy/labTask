import java.util.Scanner;
public class rectangleAreaDemo{
    public static void main(String[]args){

        //creating Scanner object
         Scanner input = new Scanner(System.in);

         //prompt the user to enter value of m and k
        System.out.print("enter values of m and k ");
        double m = input.nextDouble();
        double k  = input.nextDouble();
        Area r = new Area(m, k);
        //printing area
        System.out.println("The area of the rectangle  is " + r.returnArea());
       

    }
}
