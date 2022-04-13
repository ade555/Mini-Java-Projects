import java.util.Scanner;

public class major {
    public static void main(String[] args) {
        //TAKE INPUT FOR NUMBERS
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        //initialization for answers
        int result1 = 0;
        int result2 = 0;

        //condition to check if number is even or not
        while (num1 <= num2) {
            if (num1 % 2 == 0) {
                //adding the initial number onto the result
                result1+= num1;
            }else if (num1%2>0){
                //adding the initial number onto the result
                result2+=num1;
            } else {
                continue;
            }
            //increamenting the initial number
            num1++;
        }
            System.out.println(result1 + " is the sum of even numbers");
            System.out.println(result2 + " is the sum of odd numbers");
        }
    }
