class Student
{
    int sno;
    String sname;
    String[] course;
    double fee;
}
public class CollegeExample {

    public static void main(String[] args) {

        Student s1 =new Student();
        s1.sno=101;
        s1.sname="kamal";
        s1.course= new String[]{"core java","advance java","oracle"};
        s1.fee=3700;

        Student s2=new Student();
        s2.sno=102;
        s2.sname="kamlesh";
        s2.course= new String[]{"BEE","CAD"};
        s2.fee=5000;

        {
            System.out.println("\ns1.sno\t:"+s1.sno);
            System.out.println("s1.sname\t:"+s1.sname);
            System.out.println("s1.course\t:"+java.util.Arrays.toString(s1.course));
            System.out.println("s1.fee\t:"+s1.fee);

            System.out.println("\ns2.sno\t:"+s2.sno);
            System.out.println("s2.sname\t:"+s2.sname);
            System.out.println("s2.course\t:"+java.util.Arrays.toString(s2.course));
            System.out.println("s2.fee\t:"+s2.fee);
        }
    }
}
