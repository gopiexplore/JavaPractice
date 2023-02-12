import java.util.Scanner;

public class GreatestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three Numbers To Find Greatest Number " );
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b && a>c){
            System.out.println(a+"is Greater Number");
        }
        else if (b>a && b>c) {
            System.out.println(b+" is Greater Number");
        }
        else {
            System.out.println(c+" is Greater Number");
    }
}}
