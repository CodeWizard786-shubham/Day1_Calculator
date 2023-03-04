package javasamples;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.println("Enter value for b: ");
        double b = sc.nextDouble();
        //double a=4.56,b=2.00;
        System.out.println("Enter choice \n 1)Addition \n 2)subtraction \n 3)Multiplication \n 4)Division \n 5)Remainder");
        int choice=sc.nextInt();
        if(choice==1){
            double sum=a+b;
            System.out.println("Addition: "+sum);
        } else if (choice ==2) {
            double sub=a-b;
            System.out.println("Subtraction: "+sub);
        }
        else if (choice == 3) {
            double mul=a*b;
            System.out.println("Multiplication: "+mul);
        }
        else if (choice == 4) {
            double div=a/b;  //print quotient
            System.out.println("Division: "+div);
        }
        else if (choice == 5) {
            double mod=a%b;  //print remainder
            System.out.println("Modulus(Remainder): "+mod);
        }
        else{
            System.out.println("Select choice from 1-5");
        }
    }
}
