public class ArrayJava {
    public static void main(String[] args) {
        String[] myArray = {"Joy", "Luis", "Kamal", "Bhera"};
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
//        System.out.println("Kamlesh");
//        System.out.println(cars.length);

        for(int i =0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
        for (int item : myNum){
            System.out.println(item);
        }
    }
}
