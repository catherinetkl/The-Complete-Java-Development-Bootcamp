// 1. Identify the data type that can store text in memory
// String

// 2. Name the variable in lowerCamelCase
// String announcement

// 3. Set the variable equal to a string value
// String announcement = "I'm hungry!"

// Task 1. Create a method to display the announcement of the winner of the world cup for the year 2022.
public class JoiningStrings {
  public static void main(String[] args) {
    int year = 2022;
    String winner = "Argentina";

    String announcement = "The winner of the " + year + " FIFA World Cup is " + winner + "!";
    System.out.println(announcement);
  }
}
