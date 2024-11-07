import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner numInput = new Scanner(System.in);
        System.out.println("enter the number:=");
        int num= numInput.nextInt();
        System.out.println("NNow the Multiplication table is below");
        int k = Table(num);
        System.out.println(k);

    }
    public static  int Table(int num){
        int result ;
        int ref=0 ;

        for(int i = 1; i<=10; i++){
            result= num*i;
            ref=result;

           // System.out.println(num*i);

        }
        //System.out.println();


        return ref;
    }


}
