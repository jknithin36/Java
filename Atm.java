import java .util.Scanner;
public class Atm {
  public static void main(String[]args){
    Scanner Sc = new Scanner(System.in);
    int balance = 10000;
    int pin = 3000;
    System.out.println("Welcome to Bank ! ");
    System.out.println("\nPlease enter your pin ");
    int pinEntered = Sc.nextInt();
    if(pinEntered==pin){
    System.out.println(" choose '1' to withdraw ");
    System.out.println("choose '2' to deposit ");
    System.out.println("choose '3' to check balance ");
    int option = Sc.nextInt();
    switch(option){
      case 1:System.out.println("Enter money to be withdrawn");
      int money = Sc.nextInt();
      
      if (money<=balance){
        balance-=money;
        System.out.println("money Withdrawn");

      }else{
        System.out.println("Sorry Insufficient balance");
      }
      
      break;
      case 2 :System.out.println("enter how much amount you want to deposit");
      int cash = Sc.nextInt();
      balance+=cash;
      System.out.println("Money Deposited");
      
      break;
      /////
      case 3 : System.out.println("Reamining balance : " + balance);
      break;
      default:
      System.out.println("inSufficient balance");

    }
  }else{
    System.exit(0);
  }
    Sc.close();
  }
}
