import java.util.Scanner;

public class GreatesOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Two Numbers to Find Greatest Of Two Numbers : ");
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b){
            System.out.println(a+" is greater Than b");

        }else System.out.println(b+" is Greater than a");
    }
}
