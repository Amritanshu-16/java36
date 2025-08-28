package Banking_system;

public class MyBank {
    public static void main(String[] args) {
        bank b=new bank();
        try{
            b.withdraw(10001);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
