import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number natural number: ");
        int num1 = input.nextInt();
        System.out.println("enter the second natural number: ");
        int num2 = input.nextInt();
        int num3 = 0;

        //condition to make sure it is a natural number
        if (num1<0 | num2<0){
            System.out.println("You have entered a non natural number.");
        }else {
            while ( num1<=num2){
                num3+=num1;
                num1++;
            }
            System.out.println(num3);
        }
    }
}
