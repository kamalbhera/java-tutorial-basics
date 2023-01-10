import java.sql.SQLOutput;

public class IfElseStatement {
    public static void main(String[] args) {
//        int number = 7;
//        if (number % 2 == 0) {
//            System.out.println("number is even number");
//        } else {
//            System.out.println("Number is odd");
//        }
//
//        String str = "";
//        if (str != "") {
//            System.out.println("Name is "+ str);
//        } else {
//            System.out.println("Name is Empty");
//        }
        int mark = 65;
        if (mark < 50) {
            System.out.println("Failed");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("D grade");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("C grade");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("B grade");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("A grade");
        } else if (mark >= 90 && mark < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid");
        }
    }
}
