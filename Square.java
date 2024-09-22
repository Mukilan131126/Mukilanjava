@FunctionalInterface
interface Square {
    void Square(int a);
}

class A{
    public static void main(String args[]){
        Square obj = (a)->{
            System.out.println(a*a);
        };
        obj.Square(23);
    }
}
