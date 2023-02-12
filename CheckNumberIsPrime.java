public class CheckNumberIsPrime {
    public static void main(String[] args) {
        int num=7;
        for (int i = 2; i <num-1; i++) {
            if(num%i==0){
                System.out.println("Not a Prime");
                break;
            }
            else System.out.println("Prime");

        }
    }
}
