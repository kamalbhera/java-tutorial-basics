public class Example01 {
    static int a=10;
    static String s1="a";
    static void m1(){
        double d1= 40.2;
        System.out.println(a);
        System.out.println(s1);
        System.out.println(d1);
    }
    static void m2(){
        char ch ='n';
        System.out.println(a);
        System.out.println(s1);
        System.out.println(ch);
    }
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(a);
        System.out.println(s1);
        // System.out.println(ch);
        m1();
        m2();
    }
}
