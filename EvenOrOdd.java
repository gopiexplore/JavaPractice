import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number To Check EVEN OR ODD");
        int a=s.nextInt();
        if(a%2==0){
            System.out.println("Number is EVEN");
        }else System.out.println("Number is ODD");

    }
}
