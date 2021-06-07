import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("WORLD HELLO");
    System.out.println("-----------");
    presentGuess();
  }

  public static void presentGuess() {

    System.out.print("\nWhat language is this?  ");

    String lang = randomLang();

    System.out.println(hello(lang));

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your guess: ");
    String guess = input.nextLine();

    if(lang.toUpperCase().equals(guess.toUpperCase())) {
      System.out.println("🗸 Correct!");
    }
    else {
      System.out.println("✕ The correct answer was " + lang + "!");
      System.out.println("In " + guess + ", \"hello\" is \"" + hello(guess) + "\"!");
    }

    presentGuess();
  }

  public static String randomLang() {
    int num = (int)(Math.random()*Language.languages.length);
    return Language.languages[num].getName();
  }

  public static String hello(String language) {
    for(Language lang : Language.languages) {
      if(lang.getName().toUpperCase().equals(language.toUpperCase())) {
        return lang.getHello();
      }
    }
    return "";
  }

}


