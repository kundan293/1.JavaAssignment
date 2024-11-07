
  // here this import file alll library included this import file ;
import java.util.*;
import java.lang.Math;

import static java.lang.Math.PI;

  public class AreaAndParameterOfCircle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter  the radios value=");
        double radios = input.nextDouble();

        Parameter(radios);
        Area(radios);

    }
    public static void Parameter(double radios)
    {
        double parameter =2*(Math.PI*radios);
        System.out.println(parameter );
    }
    public static void Area(double radios){

       double Area = (Math.PI)*radios*radios;
        System.out.println(Area);
    }

}
