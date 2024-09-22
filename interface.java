@FunctionalInterface
interface B{
    void EvenorOdd(int a);
}


class A{
    public static  void main(String args[]){
        B obj = (a)->{
            if(a%2==0){
                System.out.println("It is even");
            }else{
                System.out.println("It is odd");
            }
        };
        obj.EvenorOdd(1884);
    }
}
