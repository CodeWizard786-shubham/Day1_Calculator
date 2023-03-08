package javasamples;
import java.util.Scanner;

public class HelloWorld {
    public static void addition(double a,double b){
        double sum = a + b;
        System.out.println("Addition: " + sum);
    }
    public static void subtraction(double a,double b){
        double sub = a - b;
        System.out.println("Subtraction: " + sub);
    }
    public static void multiplication(double a,double b){
        double mul = a * b;
        System.out.println("Multiplication: " + mul);
    }
    public static void division(double a,double b){
        double div = a/b;
        System.out.println("Division: " + div);
    }
    public static void remainder(double a,double b){
        double mod = a%b;
        System.out.println("remainder: " +mod);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        do{
        System.out.println("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.println("Enter value for b: ");
        double b = sc.nextDouble();
        //System.out.println("Enter value for c: ");
        //char f = sc.next().charAt(0);
        //double a=4.56,b=2.00;
        System.out.println("Enter choice \n 1)Addition \n 2)subtraction \n 3)Multiplication \n 4)Division \n 5)Remainder");
        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addition(a,b);
                    break;
                case 2:
                    subtraction(a,b);
                    break;
                case 3:
                    multiplication(a,b);
                    break;
                case 4:
                    division(a,b);
                    break;
                case 5:
                    remainder(a,b);
                    break;
                default:
                    System.out.println("Select choice from 1-5");
            }
            System.out.println("Enter 1 to continue");
            cont=sc.nextInt();

        } while (cont == 1);
          sc.close();
    }
}
