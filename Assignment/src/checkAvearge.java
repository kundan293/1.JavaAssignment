import java.util.*;
public class checkAvearge {
public static void main(String[] args){
    Scanner TakeNum = new Scanner(System.in);
    System.out.print("enter three  number for checking average=");
    int num1 = TakeNum.nextInt();
    int num2 = TakeNum.nextInt();
    int num3= TakeNum.nextInt();
    int Average =(num1+num2+num3)/2 ;

    System.out.println("The Average number is="+Average);


}
}
