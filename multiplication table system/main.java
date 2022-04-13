import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the the number for the multiplication table: ");
        int num = input.nextInt();

        //INITIALIZER
        int multiplier = 1;

        //LOOP TO RUN TABLE
        if (num<0){
            System.out.println("Enter only positive numbers");
        }else {
            while (multiplier<=12){
                int ans = multiplier*num;
                System.out.println(multiplier + " x " + num + " = "+ ans);
                multiplier++;
            }
        }
    }
}
