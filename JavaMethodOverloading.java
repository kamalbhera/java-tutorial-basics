public class JavaMethodOverloading {
    public static void main(String[] args) {
        String result = myMethod("Kamal");
        int resultNum = myMethod(78);
        System.out.println(resultNum + " " +result);
    }
    public static String myMethod(String name){
        return name;
    }
    // Other method
    public static int myMethod(int number){
        return number;
    }
}
