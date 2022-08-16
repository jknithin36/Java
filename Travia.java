import java.util.Scanner;
public class Travia{
  public static void main(String[]args){
    Scanner Sc = new Scanner(System.in);
    System.out.println("Welcome to the Quiz\n");
    System.out.println("1.Number of primitative data types in java are ?");
    System.out.println("\ta)4\n \tb)5\n \tc)7\n \td)8");
    String answer1 = Sc.nextLine();
    //
    System.out.println("\n2. Automatic type conversion is possible in which of the possible cases?");
    System.out.println("\ta)int to byte\n \tb)int to long\n \tc)long to byte\n \td)byte to short\n ");
    String answer2 = Sc.nextLine();
    //
    System.out.println("\n3. When an array is passed to a method, what does the method receive?");
    System.out.println("\ta)The reference of the array\n \tb)A copy of the array\n \tc)length of the array\n \td)copy of frist element\n ");
    String answer3 = Sc.nextLine();
    //
    System.out.println("\n4. Arrays in java are-");
    System.out.println("\ta)Object reference\n \tb)Objects\n \tc)primitative data type\n \td)None\n ");
    String answer4 = Sc.nextLine();

  
  int score =0;
  if(answer1.equals("d")){
  score+=5;
  }
  if(answer2.equals("b")){
    score+=5;
  }
  if (answer3.equals("a")){
    score+=5;
  }
  if (answer4.equals("b")){
    score+=5;
  }
  System.out.println("Your final Score is "+ score+"/20");
  
  if(score>=15){
  System.out.println("Good");
  }else if(score>=10){
  System.out.println("ok");
  }else{
  System.out.println("Better luck next time");
    Sc.close();
    }
    }
    }

  


