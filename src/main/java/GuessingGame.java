public class GuessingGame {
    public static void main(String[] args) {
      
      Jar jar = new Jar();
      Prompter prompter = new Prompter(jar);
      
      // get item Name from user
      String itemName = prompter.promptItemType();
      
      // get maximum Number of items from user
      int max = prompter.promptMaxNumber(itemName);

      // get a randomly generated number for user to guess
      int answer = jar.randomNumber(max);
      
      // get user's guesses      
      prompter.userGuess(answer);
      
    }
}
