public class Example7 {
    static int a = 10;
    static void Store(){
        a = 20;
    }
    static void Read(){
        System.out.println(a);
    }
    static void Modify(){
        a = 30;
    }
    public static void main(String[] args) {
        System.out.println(a);
        Store();
        Read();
        Modify();
        System.out.println(a);
    }
}
