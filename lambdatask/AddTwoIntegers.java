@FunctionalInterface
interface AddTwoIntegers{
    void AddTwoIntegers(int a, int b);
}

class A{
    public static void main(String[] args) {
        AddTwoIntegers obj =(a,b)->{
            System.out.println(a+b);
        };
        obj.AddTwoIntegers(34, 67);

    }
}

