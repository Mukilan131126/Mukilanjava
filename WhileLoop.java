import java.util.Scanner;
public class WhileLoop{
public static void main(String args[]){
Scanner scn = new Scanner(System.in);
System.out.print("Enter a table:");
int num = scn.nextInt();

int i=1;
while (i<=20){
System.out.println(num +"x"+i+"="+(num*i));
i++;
}
scn.close();
}
}






