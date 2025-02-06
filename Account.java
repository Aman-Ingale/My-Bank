import java.util.Random;
import java.util.Scanner;

class Account {
    private long accno;
    private String name;
    private int mpin;
    private int balance=0;
    Scanner sc= new Scanner(System.in);
    Random rand = new Random();
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMpin() {
        return mpin;
    }
    public void setMpin(int mpin) {
        this.mpin = mpin;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public long getAccno() {
        return accno;
    }
    
    public void setAccno() {
        accno = Math.absExact(rand.nextLong()%10000000000L);
    }
    public void withdrawl(int wamt){
        if(wamt<=balance){
            balance = balance-wamt;
            System.out.println("Withdrawl succesfull");
            menu();
        }
        else{
            System.out.println("Insufficient balance!");
            menu();
        }
    }
    public void deposit(int damt){
        balance = balance+damt;
    }
    public void transfer(){
        
    }  
    public void menu(){
        while(true){
            System.out.println("How can we help u : \nEnter ]\n1:Checking Balance 2:Deposit \n3:Withdrawl Money \n4:Trasfer money 5:Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Balance is : "+getBalance()+"Rs");
                    break;
                case 2:
                    System.out.println("Enter amount to Deposit : ");
                    int damt = sc.nextInt();
                    deposit(damt);
                    break;
                case 3:
                    System.out.println("Enter amount to withdrawl : ");
                    int wamt = sc.nextInt();
                    withdrawl(wamt);
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.exit(0); 
                    break;                           
                default:
                    System.out.println("Invalid input");
                    break;
            }    
        }    
    }
}
