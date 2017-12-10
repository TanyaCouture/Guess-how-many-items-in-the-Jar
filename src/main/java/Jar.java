import java.util.Random;

public class Jar{

  private String itemName;
  private int maxNumber;
  
  public Jar(){
  }

  public Jar(String itemName, int maxNumber){
    this.itemName = itemName;
    this.maxNumber = maxNumber;
  }

  public int randomNumber(int maxNumber){
    int randNum;
    Random random = new Random();
    randNum = random.nextInt(maxNumber);
    return randNum + 1;
  }
  
}