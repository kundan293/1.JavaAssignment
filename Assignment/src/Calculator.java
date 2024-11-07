import java.util.Scanner;
class Result {
    static  int num=3;
    public int  sum(int num1 , int num2){
        return num1+num2+num;

    }


    public void sum() {
    }
}
public class Calculator {
    public static void main(String[] a){
        Result r = new Result();
        System.out.println( r.sum(5,7));
    }

}
