import java.util.Scanner;
class Login{
    Scanner sc = new Scanner(System.in);
    Account acc = new Account();
    public void signUp(){
        System.out.println("Enter name : ");
        String accName = sc.nextLine();
        acc.setName(accName);
        System.out.println("Enter m-pin : ");
        int accMpin = sc.nextInt();
        acc.setMpin(accMpin);
        acc.setAccno();
        System.out.println("Your account number is : " + acc.getAccno());
    }
    public void signIn(){
        System.out.println("Enter account no : "); 
        long accno = sc.nextLong();       
        System.out.println("Enter M-Pin : ");
        int mpin = sc.nextInt();
        if (verifyUser(mpin, accno)) {
            acc.menu();
        } 
        else {
            System.out.println("Invalid credential");
        }
        
        
    }    
    public boolean verifyUser(int mpin,long accno){
        if ((mpin==acc.getMpin())&&(accno==acc.getAccno())) {
            return true;
        } else {
            return false;
        }
    }
}