import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args) {
        //Q1
        smallestAmongThree();


    }
//    1 - Write a Java method to find the smallest number among three
//    numbers.

    public static void smallestAmongThree(){
        int num1;
        int num2;
        int num3;

        int smallest;
        Scanner input = new Scanner(System.in);

        System.out.println("Finding smallest among 3 numbers:");
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();

        if (num1 < num2){
            smallest = num1;
        } else {
            smallest = num2;
        }
        System.out.println("Enter the third number: ");
        num3 = input.nextInt();

        if (num3 < smallest){
            smallest = num3;
        }

        System.out.println("The smallest number is: "+smallest);
    }
}
