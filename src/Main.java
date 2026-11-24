import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

// Q1
        System.out.print("Enter your role:\n" +
                "1. Admin role\n" +
                "2. Superuser role\n" +
                "3. User role\n");
        int entr = in.nextInt();

        if (entr == 1){

            System.out.println("Welcome Admin role");

        }
        else if (entr == 2) {

            System.out.println("Welcome Superuser role");

        }
        else {
            System.out.println("Welcome user role");
        }

        System.out.println("----------------------------------------------");

//Q2

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the scound number: ");
        int num2 = in.nextInt();

        System.out.print("Enter the therd number: ");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3){

            System.out.println("The greatest: " + num1);
        }

        else if ( num2 > num1 && num2 > num3){

            System.out.println("The greatest: " + num2);

        }

        else {
            System.out.println("The greatest: " + num3);
        }

        System.out.println("----------------------------------------------");

// Q3

        System.out.print("Enter the number from 1 - 7 of a day: ");
        int day = in.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Enter only from 1-7");
        }

        System.out.println("----------------------------------------------");

// Q4


        System.out.print("Enter your numeric score: ");
        int ns = in.nextInt();

        System.out.println ("Numeric score: "+ ns);

        if (ns >= 90 && ns <= 100){

            System.out.println("Letter Grade A");

        }
        else if (ns >= 80 && ns <= 89) {

            System.out.println("Letter Grade B");

        }
        else if (ns >= 70 && ns <= 79) {

            System.out.println("Letter Grade C");
        }
        else if (ns >= 60 && ns <= 69) {

            System.out.println("Letter Grade D");
        }
        else if (ns >= 0 && ns <= 59) {

            System.out.println("Letter Grade F");
        }

        else {
            System.out.println("invlied score");
        }

        System.out.println("----------------------------------------------");

// Q5

        System.out.print("Enter your age: ");
        int age = in.nextInt();


        if(age > 0 && age < 13){

            System.out.println("You are Child");
        }

        else if (age >= 13 && age <= 19){

            System.out.println("You are Teenager");
        }
        else {
            System.out.println("You are an Adult");
        }

    }
}