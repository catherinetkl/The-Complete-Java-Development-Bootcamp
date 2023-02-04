// Task 1 -- A points variable starts at 0, update the variable whenever Gryffindor wins or loses points.
// Task 2 -- Print your final result. It should be be 137.

public class Points {
  public static void main(String[] args) {
    int points = 0;
      System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
    //update points here
    points -= 50;
      System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
    //update points here
    points -= 3;
      System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
    //update points here
    points += 30;
      System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
    //update points here
    points += 100;
      System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
    //update points here
    points += 60;
    //print the final result
      System.out.println(points);
  }
}

