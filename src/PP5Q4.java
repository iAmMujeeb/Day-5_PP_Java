import java.util.Scanner;

public class PP5Q4 {
    public static void main(String[] args) {
        float temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n=sc.nextInt();
        float m=n;
        if(n!=0){
        for (int i =1; i<=m; i++) {
            temp = (temp + (1 / m));
            m++;
        }
            System.out.println("Harmonic Value for given N("+n+") = "+temp);
        }else
            System.out.println("Not a valid number");
    }
}
