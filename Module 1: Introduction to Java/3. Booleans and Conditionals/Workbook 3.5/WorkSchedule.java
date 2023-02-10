public class WorkSchedule {
  public static void main(String[] args) {

      //See Learn the Part for the complete instructions (link in resources folder of Udemy video).

      int day = 3;   //3rd day of the week...
      boolean holiday = false;

      // In the event of a holiday, Woohoo, no work.
        if (holiday){
          System.out.println("Woohoo, no work!");
      // During the weekends, It's the weekend, no work!
      } else if (day >= 6){
          System.out.println("It's the weekend, no work!");
      // Otherwise, Wake up at 7.00 :(
      } else {
        System.out.println("Wake up at 7.00 :(");
      }

  }

}
