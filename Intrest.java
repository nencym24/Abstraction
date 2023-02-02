public class Intrest {
 
    public static void main(String[] args) {
        
        Bank b = new Axis();
        b.getRateofintrest(20000);
    }
}

abstract class Bank{

    abstract void getRateofintrest(int amt);
}

class Axis extends Bank{

    void getRateofintrest(int amt){
        float ans = (amt*2*5)/100;
        System.out.println("Ans = "+ans);
    }
}
