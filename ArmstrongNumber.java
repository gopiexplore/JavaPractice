import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int b=a;
        int c=a;
        int count=0;
        while (a>0){
            a=a/10;
            count=count+1;

        }
        System.out.println("count"+count);
        int msum=0;
        while (b>0){
            b=b%10;
            int indsum=1;
            while (count>0){
                indsum=indsum*b;
                count=count-1;
            }
            msum=msum+indsum;
        }
        if(msum==c){
            System.out.println("This is armstrong number");
        }
        else System.out.println("This is not a armstrong number");
    }
}
