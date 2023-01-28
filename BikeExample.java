class VechileExample{
    public void Break(){
        System.out.println("all vechiles have break");
    }
}
class CarsExample extends VechileExample{
    public void m1(){
        System.out.println("m1 fro, first child");
    }
}

public class BikeExample extends VechileExample {
    public void m2(){
        System.out.println("m2 from second ");
    }
}


class MainExaple{
    public static void main(String [] args){
        BikeExample b1= new BikeExample();
        b1.Break();
        b1.m2();
        CarsExample c1= new CarsExample();
        c1.Break();
        c1.m1();
    }
}
