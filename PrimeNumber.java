import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number To Check Prime or Not : ");
        int a=s.nextInt();
        int flag=0;
        for (int i = 2; i <a; i++) {
            if(a%i==0){
                System.out.println("Not a Prime Number");
                flag=1;
                break;
            }

        }if(flag==0) System.out.println("is a Prime Number");
    }
}
