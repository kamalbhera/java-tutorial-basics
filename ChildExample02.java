public class ChildExample02 extends ChildExample {

    private void m8(){
        System.out.println("this is private uses in parent class");
    }
    protected void m9(){
        System.out.println("this is parent class");
    }
    public void m5(){
        System.out.println("this is second derived class");
    }
    public static void main(String args[]){

        ChildExample02 obj =new ChildExample02();
        obj.m1();
        //	obj.m2();
        obj.m3();
        obj.m4();
        obj.m5();
        //	obj.m6();
        obj.m7();
        obj.m8();
        obj.m9();
    }
}
