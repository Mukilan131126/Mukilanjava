/*public class Task{
public static void main(String args[]){
for (int i=1;i<=5;i++){
for (int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
}
}*/


/*class ReverseRightHalfPyramid{
public static void main(String args[]){
int a=5;
for (int i=1;i<=a;i++){
for (int j=a;j>=i;j--){
System.out.print("*");
}
System.out.println();
}
}
}*/

/*class NumberIncreasingPyramid{
public static void main(String args[]){
int n=5;
for (int i=1;i<=n;i++){
for ( int j=1;j<=i;j++){
System.out.print(j+" ");
}
System.out.println();
}
}
}*/


 class RhombusPattern {
    public static void main(String[] args) {
        int n = 5;  // number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}











 



