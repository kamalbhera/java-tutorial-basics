public class ArrOfObj {
    public static void main(String args[]){
        StudenArrObjExample[] arr;
        arr =new StudenArrObjExample[5];
        arr[0]=new StudenArrObjExample(1,"NEERAJ");
        arr[1]= new StudenArrObjExample(2,"ABhishek");
        arr[2]=new StudenArrObjExample(3,"AASHISH");
        arr[3]=new StudenArrObjExample(4,"CHETAN");
        arr[4]=new StudenArrObjExample(5,"ANKIT");
        for (int i=0;i<arr.length;i++ ) {
            System.out.println("arrAt"+ i +":"+ arr[i].rollNo +"  "+arr[i].Name);
        }
    }
}
