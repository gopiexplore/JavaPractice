import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to find Reverse of a Number ");
        int a=s.nextInt();
        int x=a;
        int rev=0;
        while (a>0){
            rev=rev*10+a%10;
            a=a/10;
        }
        if(x==rev) System.out.println("The Number is a Palindrome");
        else System.out.println("The Number is not a Palindrome");
    }
}
