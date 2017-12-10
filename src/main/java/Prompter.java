import java.util.Scanner;

public class Prompter{
 
  private Jar jar;
  private String itemName;
  private int guess;
  private int max;
  
  public Prompter(Jar jar){
    this.jar = jar;
  }

 // What type of item?
  
  public String promptItemType(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What type of item?");
    return itemName = scanner.nextLine();    
  }
    
  // What is the maximum number of <item>?
  public int promptMaxNumber(String itemName){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the maximum amount of " + itemName + "?");
    return max = scanner.nextInt();    
  }
  
   public boolean userGuess(int answer){
     Scanner scanner = new Scanner(System.in);
     int count = 0;
     
     do{
       System.out.printf("How many " + itemName + " are in the jar? Pick a number between 1 and %d: %n", max);
       guess = scanner.nextInt();
       
        if(guess > max){
          System.out.println("Your guess must be less than the maximum fill amount");
          continue;
        }
          
        if(guess > answer){
          System.out.println("Your guess is too high");
        }
        if(guess < answer){
          System.out.println("Your guess is too low");
        }

        count++;
     }
      while(guess != answer);
    
      System.out.printf("You got it in %d attempts %n", count);
      return true;
  }

}