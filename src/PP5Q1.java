import java.util.Scanner;

public class PP5Q1 {
    public static void main(String[] args) {
        int h=0;
        int t=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times to Flip Coin = ");
        int count = sc.nextInt();
        for (int i =1; i<=count; i++) {
            int face = (int) (Math.random() * 10) % 2;
            if (face == 0) {
                System.out.println("Head");
                h++;
            } else{
                System.out.println("Tail");
                t++;
            }
        }
        int hpercent = ((h*100)/count);
        int tpercent = ((t*100)/count);
        System.out.println("Percentage of Head = "+hpercent+"% vs Tails = "+tpercent+"%");
    }
}