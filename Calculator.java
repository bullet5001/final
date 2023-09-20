import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("Press 1 for addition" +
                "press 2 for subtraction" +
                "press 3 for multiplication" +
                "press 4 for division");
        int input;
        Scanner scan = new Scanner(System.in);
        input =scan.nextInt();
        double x,y;
        System.out.println("enter the first number");
        x= scan.nextInt();
        System.out.println("enter the next number ");
        y = scan.nextInt();
        if(input==1){

            double sum=x+y;
            System.out.println("sum = "+ sum);
        } else if (input == 2) {

            double subtraction = x-y;
            System.out.println("subtraction = " + subtraction);

        } else if (input == 3) {

            double mult =x*y;
            System.out.println("Multiplication = " + mult);
        } else if (input == 4) {

            double div=x/y;
            System.out.println("division = "+ div);

        }else {
            System.out.println("Enter a valid input");
    }
}}
