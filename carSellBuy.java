import java.util.Scanner;
public class carSellBuy{
  public static void main(String[]args){
  Scanner Sc = new Scanner(System.in);
  System.out.println("Welcome to the java dealerShip");
  System.out.println(" . Select option 'a' to buy a car");
  System.out.println(" . Select option 'b' to sell a car");
 String option =  Sc.nextLine();
switch(option){
  case "a":System.out.println("What is your budget ? "); 
  int budget = Sc.nextInt();
  if(budget>=10000){
    System.out.println("Great! A Nissan Altima is avialable");
    System.out.println("\nDo You have Insurance? Write 'yes' or 'no'");
    Sc.nextLine();
    String insurance = Sc.nextLine();
    System.out.println("\nDo you have a llicense? Write 'yes' or 'no");
    String license = Sc.nextLine();
    System.out.println("What is your credit score ?");
    int creditScore= Sc.nextInt();
    if (insurance.equals("yes")&& license.equals("yes")&&creditScore>60){
      System.out.println("Sold! Pleasure doing bussiness with you");
    }else{
      System.out.println("we're sorry.you are not elgible");
    }
  }else{
    System.out.println("No cars available");
  }
  break;
  case "b":System.out.println("What is your car valued at ?");
  int value = Sc.nextInt();
  System.out.println("what is your selling price ?");
  int price = Sc.nextInt();
  if (value>price&&price <30000){
    System.out.println("\n we will but the car");
  }else{
    System.out.println("sorry");
  }
  break;
  default:System.out.println("Invalid Option");
}
Sc.close();
  }
}