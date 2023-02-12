import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a Number to find sum of digits ");
        int a=s.nextInt();
        int sum=0;
        while (a>0){
            sum=sum+a%10;
            a=a/10;
        }
        System.out.println("The sum of digits of a Number "+sum);
    }
}
