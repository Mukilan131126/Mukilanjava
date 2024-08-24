class Phone{
    public  void call(){
        System.out.println("Phone is calling");
    }
}
class PhoneV2 extends Phone{
    public void message(){
        System.out.println("Phone is messaging");
    }
}
class PhoneV3 extends PhoneV2{
    public void alarm(){
        System.out.println("Phone is alarmingly");
    }
}
class Main{
public static void main(String args[]){
    Phone obj1 = new Phone();
    obj1.call();
    PhoneV2 obj2 = new PhoneV2();
    obj2.message();
    obj2.call();
    PhoneV3 obj3 = new PhoneV3();
    obj3.alarm();
    obj3.call();
    obj3.message();

}
}
