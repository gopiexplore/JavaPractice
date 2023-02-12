import java.util.Scanner;

public class ReverseOfaNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to find Reverse of a Number ");
        int a=s.nextInt();
        int rev=0;
        while (a>0){
            rev=rev*10+a%10;
            a=a/10;
        }
        System.out.println("Reverse of Number is "+rev);
    }
}
