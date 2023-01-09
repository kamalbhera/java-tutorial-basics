import java.math.BigInteger;

public class Variables {
    public static void main(String[] args){
        // long var variable
        var phoneNum = Long.parseLong("7891916296");
        // String variable
        String name = "kamal bhera";
        // Boolean variable
        Boolean developer = true;
        // Int variable
        int age = 23;
        // float variable
        float floatAge = age;
        // Outputs
        System.out.println(phoneNum);
        System.out.println(name);
        System.out.println(floatAge);
        System.out.println(age);

        byte a=10;
        byte b=10;
        //byte c=a+b;//Compile Time Error: because a+b=20 will be int
        byte c = (byte)(a+b);
        System.out.println(c);

    }
}
