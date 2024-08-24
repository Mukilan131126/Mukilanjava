/*public class MultiDimensional {
    public static void main(String[] args) { 
        int[][] a = {{1,2,3,4,5},{1,2,3,45,5},{2,3,46,5},{3,4,5,78,89}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }


        
    }
    
}*/
import java.util.Scanner;
class MultiDimensional{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number(i): ");
        int a= scn.nextInt();
        System.out.print("Enter a number(j): ");
        int b=scn.nextInt();
int[][] num ={{1,2,3,4,6,7,8,9,5},{1,2,3,4656,7,8,9,5},{1,22,33,44,55,66,5},{1,23,3,43,465,5}};
// for (int i=0;i<num.length;i++){
//     for(int j=0;j<num[i].length;j++){
//         System.out.println(num[a][b]);
//     }
System.out.println(num[a][b]);


}        

    }



