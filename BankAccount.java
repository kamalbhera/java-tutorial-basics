public class BankAccount {
    static String bankName;
    static String ifscCode;
    static String branchName;

    long AcNo;
    String AcName;
    double Bal;

    static void setBankName(String BankName){
        BankAccount.bankName = BankName;
    }
    static void setBranch(String Branch){
        BankAccount.branchName = Branch;
    }
    static void setIfsc(String Ifsc){
        BankAccount.ifscCode = Ifsc;
    }
    void Display() {
        System.out.println("BankName:" + bankName);
        System.out.println("Branch:" + branchName);
        System.out.println("Ifsc:" + ifscCode);
        System.out.println("AcNo:" + AcNo);
        System.out.println("AcName:" + AcName);
        System.out.println("Bal:" + Bal);
    }
}
