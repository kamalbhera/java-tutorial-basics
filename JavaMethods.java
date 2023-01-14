public class JavaMethods {
    public static void main(String[] args) {
        // Without Parameter
        myMthod();
        // with parameter
        myMethodWithParameter("Called by Kamal");
    }

    public static void myMthod(){
        System.out.println("Called mymethod function");
    }
    public static void myMethodWithParameter(String name){
        System.out.println("Called mymethod function "+ name);
    }
}
