public class Championship {
  public static void main(String[] args) {

      //See Learn the Part for the complete instructions (link in resources folder of Udemy video).

      int gryffindor = 450;    //gryffindor points
      int ravenclaw = 500;    //ravenclaw points

      // int margin = amount of points by which gryffindor scored over ravenclaw;
      int margin = (gryffindor - ravenclaw);
      if (margin >= 300) {
      // If gryffindor wins by a margin of 300 points or more, print:
        System.out.println("Gryffindor takes the house cup!");
      } else if (margin >= 0) {
      // If gryffindor wins by a margin of any points or ties, print:
          System.out.println("In second place, Gryffindor!");
      // If gryffindor loses within 100 points, print:
      } else if (margin >= -100) {
          System.out.println("In third place, Gryffindor!");
      } else {
        System.out.println("In fourth place, Gryffindor!");
      }


  }
}
