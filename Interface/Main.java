interface Payment {
    void processPayment();
}

interface RefundPayment extends Payment{
    void reFund();
}

class OnlinePayment implements RefundPayment{
    public void processPayment(){
        System.out.println("Online payment is successful");
    }
    public void reFund(){
        System.out.println("Successfully refunded");
    }    
} 

class OfflinePayment implements RefundPayment{
    public void processPayment(){
        System.out.println("Offline payment is successful");
    }
    public void reFund(){
        System.out.println("Refund Failed");
    }
}

public class Main{
    public static void main(String args[]){
        OnlinePayment a = new OnlinePayment();
        a.processPayment();
        a.reFund();
        OfflinePayment b = new OfflinePayment();
        b.processPayment();
        b.reFund();

    }
}


