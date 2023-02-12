import java.util.Scanner;

public class SumoFirstNNNaturalness {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number to find sum of Natural numbers");
        int a=s.nextInt();
        int sum=0;
        for (int i = 1; i <=a; i++) {
            sum=sum+i;
        }
        System.out.println("Sum of First N Natural numbers is "+sum);
        //Method Two
        int sum1=(a*(a+1)/2);
        System.out.println("Sum of First N Natural NUmbers is "+sum1);
    }
}
