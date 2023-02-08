import java.util.Scanner;

public class SignUp {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Welcome to JavaGram! Let's sign you up.");

  System.out.println("\nWhat is your first name?");
  // Pick up their first name.
  String firstName = scanner.nextLine();

  System.out.println("\nWhat is your last name?");
  // Pick up their last name.
  String lastName = scanner.nextLine();

  System.out.println("\nHow old are you?");
  // Pick up their age.
  int age = scanner.nextInt();

  // Create one scanner.nextLine before the real one
  String nickname = scanner.nextLine();

  System.out.println("\nMake a username");
  // Pick up their username.
  String username = scanner.nextLine();

  System.out.println("\nWhat city do you live in?");
  // Pick up their city.
  String city = scanner.nextLine();

  System.out.println("\nWhat country is that?");
  // Pick up their country.
  String country = scanner.nextLine();

  System.out.println("Thank you for joining JavaGram!");
  System.out.println("\nHere is the information you entered:");
  System.out.println("\tFirst Name: " + firstName);
  System.out.println("\tLast Name: " + lastName);
  System.out.println("\tAge: " + age);
  System.out.println("\tUsername: " + username);
  System.out.println("\tCity: " + city);
  System.out.println("\tCountry: " + country);

  //close scanner. It's good practice :D !
  scanner.close();
  }
}

