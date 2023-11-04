import java.util.Scanner;
public class Atminterface{
    public static void main(String[] args) {
        int balance=15000,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
        while(true){
            
            System.out.println("ATM machine interface:");
            System.out.println("choose 1 for withdraw:");
            System.out.println("choose 2 for deposit:");
            System.out.println("choose 3 for check balance:");
            System.out.println("choose 4 for exit:");
            System.out.print("choose the operation perform:");
            int choice=sc.nextInt();

            switch(choice){

                case 1:
                System.out.println("enter the money to be withdraw:");
                withdraw=sc.nextInt();

                if(balance>=withdraw){
                    balance=balance-withdraw;
                    System.out.println("please collect your money:");
                }
                else{
                    System.out.println("insufficient balance");
                }
                break;

                case 2:
                System.out.println("enter the money to be deposit:");
                deposit=sc.nextInt();
                balance=balance + deposit;
                System.out.println("your money is successfully deposit!!");
                break;

                case 3:
                System.out.println("available balance in your accout:");
                System.out.println(balance);
                break;

                case 4:
                System.out.println("thanks for visited!!");
                System.exit(0);

            }
            
            
        }

    }

}
