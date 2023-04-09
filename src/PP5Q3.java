import java.util.Scanner;

public class PP5Q3 {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N = ");
        int n = sc.nextInt();
        if((n>=0)&&(n<=30)){
        for(int i = 0; i<=n; i++) {
            temp=(int) Math.pow(2,i);
            System.out.println("2^"+n+" = "+temp);}
        }else
            System.out.println("Wrong number entered");
        }
    }