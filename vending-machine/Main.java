import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc =  new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        Item item = new Item("Pepsi",3.99,4);
       
        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };
    
        Machine machine = new Machine(items);
        
    System.out.println(machine);
    while(true){
         System.out.print("pick a row: ");
    int row = Sc.nextInt();
    System.out.print("Pick a spot in the row: ");
    int spot = Sc.nextInt();
     boolean dispended = machine.dispense(row,spot);
    System.out.println("\n"+machine);
    if(dispended == true){
        System.out.println("'\n Enjoy your drink! Press 1 to purchase another: ");
    }else{
        System.out.println("Sorry!.. we were out of item.press 1 to purchase another");
    }
    if(Sc.nextInt()!=1){
        break;
    }
    }
   
    }
}
