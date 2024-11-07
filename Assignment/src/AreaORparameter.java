import java.util.Scanner;

public class AreaORparameter {
    public static void main(String [] args){
        Scanner numInput = new Scanner(System.in);
        System.out.print("Welcome to find the are of rectangle= ");
        float width = numInput.nextInt();
        System.out.print("please enter the width of rectangle= ");
        float height = numInput.nextInt();

        float  area = (width *height);
        float parameter= 2* (width +height);
        System.out.println("the area of rectangle is="+area);
        System.out.println("The parameter of rectangle is="+parameter);



    }
}
