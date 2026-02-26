import java.util.*;

public class AgeCalculator {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome To The Age Calculator ---\n");

        System.out.print("please enter your age: ");
        int age = input.nextInt();

        if ( age <= 13 ){
            System.out.println("You are a Child.");
        } else if ( age <=20 ) {
            System.out.println("You are a Teen.");
        } else if ( age <= 60 ) {
            System.out.println("You are an Adult,");
        } else {
            System.out.println("You are Senior.");
        }

    }
}
