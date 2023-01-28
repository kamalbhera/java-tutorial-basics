public class BikeExample02 extends VechileExample02  {
    public void start(){
        System.out.println("this is start using kick also");
    }
    public static void main(String args[]){
        BikeExample02 obj = new BikeExample02();
        obj.start();
        obj.m1();
    }
}
class VechileExample02{
    public void m1(){
        System.out.println("parent class m1");
    }
    public void start(){
        System.out.println("all Vechile Start in the same way");
    }
}