import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number to Check Positive or Negative or ZERO");
        a=s.nextInt();
        if(a==0){
            System.out.println("The Number is ZERO");
        } else if (a>0) {
            System.out.println("The number  is Positive");
        }
        else {
            System.out.println("The number is Negative");
        }
    }
}
