import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z=0;
        System.out.println("Enter any two numbers");
        x = sc.nextInt();
        y = sc.nextInt();
        try{
            z=x/y;   //exception aa sakti hai 12/0=infinite
        }

        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        catch (Exception e){     //brahmos
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println(z);
        }
    }
}