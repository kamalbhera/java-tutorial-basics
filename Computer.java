
class Brand {
    int ram;
    int rom;
    String[] processor;
    String company;
}
public class Computer {
    public static void main(String[] args) {
        Brand b1 = new Brand();

        b1.ram= 8;
        b1.rom=1;
        b1.processor=new String[]{"i3","i5","i7"};
        b1.company="HP";

        Brand b2= new Brand();

        b2.ram= 4;
        b2.rom=500;
        b2.processor=new String[]{"i7","i9"};
        b2.company="DELL";

        {
            System.out.println("\nb1.ram\t:"+b1.ram+"gb");
            System.out.println("\b1.rom\t:"+b1.rom+"tb");
            System.out.println("\b1.processor\t:"+java.util.Arrays.toString(b1.processor));
            System.out.println("\b1.company\t:"+b1.company);

            System.out.println("\nb1.ram\t:"+b2.ram+"gb");
            System.out.println("\b22rom\t:"+b2.rom+"tb");
            System.out.println("\b2.processor\t:"+java.util.Arrays.toString(b2.processor));
            System.out.println("\b2.company\t:"+b2.company);
        }
    }
}
