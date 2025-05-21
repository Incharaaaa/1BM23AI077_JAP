
class LessBalanceException extends Exception {
    public LessBalanceException(Double amount) {
        super("withdraw amount ( " + amount + "RS)is not valid");
    }
}

class Account{
        double balance;
        final static int MIN_BALANCE=500;

        public Account(){
            balance=MIN_BALANCE;
        }

        public void deposit(double amount){
            balance+=amount;
            System.out.println("amount "+amount+"is deposited in your account");
        }

        public void Withdraw(double amount) throws Exception{
            if(balance-amount<MIN_BALANCE){
                throw new LessBalanceException(amount);
            }
            balance-=amount;
            System.out.println("amount of rs"+amount+"is withdrawn from your account");

        }
        public double getBalance(){
            return balance;
        }


}


public class TestAccount {
    public static void main(String[] args){
        Account acc1=new Account();
        Account acc2=new Account();

        acc1.deposit(1000);
        acc2.deposit(900);

        acc1.getBalance();
        acc2.getBalance();
        try{
            acc1.Withdraw(1600);
        }catch(Exception e){
            System.out.println("less balance exception"+e.getMessage());
        }
        try{
            acc2.Withdraw(300);
        }catch(Exception e){
            System.out.println("less balance exception"+e.getMessage());
        }
    }
}
