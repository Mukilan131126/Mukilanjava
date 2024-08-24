

class Mobile {
    String MobileName;
    int MobileYear;
    String MobileModel;


    public Mobile(String name,int year,String model){
        MobileName = name;
        MobileYear = year;
        MobileModel = model;
    }
   public static void main(String[] args) {
       Mobile obj = new Mobile("Honour",2024,"ALX1NH");
       Mobile obj1 = new Mobile("Oppo",2002,"Max");
       Mobile obj2 = new Mobile("Vivo",2004,"ProMax");
       Mobile obj3 = new Mobile("Samsung",1988,"Xn4");
       System.out.println(obj.MobileName);
       System.out.println(obj.MobileYear);
       System.out.println(obj.MobileModel);
System.out.println();
       System.out.println(obj1.MobileName);
       System.out.println(obj1.MobileYear);
       System.out.println(obj1.MobileModel);
System.out.println();
       System.out.println(obj2.MobileName);
       System.out.println(obj2.MobileYear);
       System.out.println(obj2.MobileModel);
System.out.println();
       System.out.println(obj3.MobileName);
       System.out.println(obj3.MobileYear);
       System.out.println(obj3.MobileModel);
   } 
}
