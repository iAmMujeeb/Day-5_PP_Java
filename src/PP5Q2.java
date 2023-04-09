import java.util.Scanner;

public class PP5Q2 {
    public static void main(String[] args) {
        int temp = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        temp=year;
        while (temp != 0) {
            // num = num/10
            temp /= 10;
            ++count;
        }
        if(count==4) {
            if ((year % 4 == 0) || (year % 400 == 0))
                System.out.println("Leap Year");
            else
                System.out.println("Not A Leap Year");
        }else
            System.out.println("Not a 4 digit number");
    }
}