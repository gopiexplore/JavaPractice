import java.util.Scanner;

public class SumOfNumbersGiveRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers to find sum in a give range");
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=0;
        for (int i = a; i <=b; i++) {
            sum=sum+i;

        }
        System.out.println("The sum in a Give Range is : "+sum);
    }
}
