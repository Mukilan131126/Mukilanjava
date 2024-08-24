import java.util.Scanner;
public class Switchcase{
    public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    System.out.println("Enter a number(1-3):");
    int Expression = scn.nextInt();
    System.out.println("Enter a number:");
    int num1 = scn.nextInt();
    System.out.println("Enter a number:");
    int num2 = scn.nextInt();
    System.out.println("Enter a number:");

    switch (Expression){
        case 1:
        System.out.println("addition" + (num1+num2));
        break;

        case 2:
        System.out.println("subtraction" + (num1-num2));
        break;

        case 3:
        System.out.println ("multiplication" + (num1*num2));
        break;

        case 4:
        System.out.println("division" + (num1%num2));
        break;

        default:
        System.out.println("Invalid");
    }



    }


    

    }
