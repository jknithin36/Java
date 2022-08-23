import java.util.Arrays;
import java.util.Scanner;
class Car {
    private String name;
    private double price;
    private int year;
    private String color;
     String[] parts;
    //constructor
    public Car(String name,double price,int year,String color,String[] parts){
        this.name = name;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts,parts.length);
    }
    //copy constructor
    public Car(Car source){
        this.name = source.name;
        this.price = source.price;
        this.year= source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts,source.parts.length);
        
    }
    //getters
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }
    public String[] getParts(){
        return Arrays.copyOf(this.parts,this.parts.length);
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.year = year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setcolor(String color){
        this .color = color;
    }
    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts,parts.length);
    }
    public void drive(){
        System.out.println("you bought the beautiful "+this.year+" "+this.color+" "+this.name+" for "+this.price);
    }
    public String toString(){
    return "name: " + this.name + ".\n" 
    +"price: " + this.price + ".\n"
    +"Year: "+this.year+".\n"
    +"Color: "+this.color+".\n"
    +"Parts: "+Arrays.toString(parts)+".\n";
    }
    
}
// Dealer ship class
 class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public String search(String name, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getName().equals(name) && this.cars[i].getPrice() <= budget) {
                return "\nWe found one in spot " + i + "\n" + this.cars[i].toString() + "\nAre you interested ?";
            }
        }
        return "Sorry, we couldn't find any cars.";
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            if (this.cars[i] == null) {
                temp += "Empty\n";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
    }


}


public class Main{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
       
    Car[] cars = new Car[]{ 
    new Car("Mahindra",140000,2020,"Black",new String[] {"tires","Keys"}),
    new Car("Audi",12345600,2021,"Blue",new String[] {"tires","Keys"}),
    new Car("benz",12345,2002,"Red",new String[] {"tires","Keys"}),
    new Car("Honda",7000,2016,"yellow",new String[] {"tires","Keys"}),
    new Car("swift",3000,2020,"White",new String[] {"tires","Keys"}),
    };
        
      Dealership dealership = new Dealership(cars);
      
    
   System.out.println(dealership);
    Sc.close();
    }
}