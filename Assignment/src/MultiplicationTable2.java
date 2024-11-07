import java.util.Scanner;
public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the multiplication table");
        System.out.println("please enter the number=");
        int num = input.nextInt();
        for(int i= 0; i<=10; i++){
            System.out.println(num+"*"+i+"="+num*i);

        }
    }
}
