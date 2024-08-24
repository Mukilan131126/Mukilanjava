public class Scope{
    static int StaticVarible1;
    static int StaticVarible2;

    public static int initializeStaticVar() {
        int x = StaticVarible1 * StaticVarible1;
        return x;
    }

    public static void main(String args[]){
        System.out.println("Hello World");
    }

    static {
        StaticVarible1 = 9;
        StaticVarible2 = initializeStaticVar();
        System.out.println(StaticVarible1);
        System.out.println(StaticVarible2);

    }
}






    


    
    

    
    

