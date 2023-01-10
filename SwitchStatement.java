public class SwitchStatement {
    public static void main(String[] args) {
        String name = "luis";
        String result = "";
        switch (name) {
            case "kamal":
                result = "User is : kamal";
                break;
            case "joe":
                result = "User is : joe";
                break;
            case "luis":
                result = "User is : luis";
                break;
            default:
                return;
        }
        System.out.println(result);
    }
}
