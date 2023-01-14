public class JavaRecursion {
    public static void main(String[] args) {
        int result = sumRecursionFib(6);
        System.out.println(result);
    }

    public static int sumRecursionFib(int num){
        if (num <=2) return 1;
        return sumRecursionFib(num-1) + sumRecursionFib(num-2);
    }
}
