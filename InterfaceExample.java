interface A{
    void m1();
}

interface C {
    void m1();
}
public class InterfaceExample implements A, C{

    public static void main(String[] args) {
        InterfaceExample obj =new InterfaceExample();
        obj.m1();
    }

    @Override
    public void m1() {
        System.out.println("M1");
    }
}
