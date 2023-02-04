// In this workbook, you will fill in a biography of yourself.
// >> My name is <name>. I'm <age> years old, and I'm from <country>.
// >> My favorite sport is <sport>. I play for <hours> hour(s) a day
// >> When I'm tired, I like to play <game>.
// >> In school, my favourite subject was <subject>. I scored a <grade>.

// Task 1 -- Inside main(), replace each comment with a variable.
// Task 2 -- Replace every placeholder with a variable.

public class Biography {
  public static void main(String[] args) {
    String name = "Serena";
    int age = 21;
    String country = "Canada";
    String sport = "Tennis";
    int hours = 5;
    String game = "Roblox";
    String subject = "Biology";
    char grade = 'B';

    System.out.println("My name is " + name + ". I'm " + age + " years old, and I'm from " + country + ".");
    System.out.println("My favorite sport is " + sport + ". I play for " + hours + " hours a day.");
    System.out.println("When I'm tired, I like to play " + game + ".");
    System.out.println("In school, my favorite subject was " + subject + ". I scored a " + grade + ".");
  }
}
