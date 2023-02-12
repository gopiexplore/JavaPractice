import java.util.Scanner;

public class PrimeNumberIngivenRange {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Range to find all prime numbers in given range");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
           if (i==2) System.out.println(i);
           else{
               int flag=0;
               for(int j=2;j<i;j++){
                   if(i%j==0){
                       flag=1;
                   }
               }
               if(flag==0){
                   System.out.println(i);
               }
           }
        }

    }
}
