import java.util.Scanner;
public class SwapNumber {
    public static void main(String[ ] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Eneter the umber =");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();

        int num3;
        num3= num2;
        num2 = num1;
        num1=num3;
        System.out.println("Swap value ");
        System.out.println(num1);
        System.out.println(num2);

    }
}
