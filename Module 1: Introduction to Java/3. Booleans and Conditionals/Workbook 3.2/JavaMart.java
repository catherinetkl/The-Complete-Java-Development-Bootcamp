public class JavaMart {
  public static void main(String[] args) {
      double wallet = 100;

      //See Learn the Part for the complete instructions (link in resources folder of Udemy video).


      double toyCar = 5.99;
      System.out.println("Can I get this car?");
      //if you have enough money
      if (wallet >= toyCar) {
          //       print: Sure!
          System.out.println("Sure!");
          //       pay for the toy car
      } else {
        //else:  Sorry, I only have <wallet> left.
        System.out.println("Sorry, I only have $ " + (wallet - toyCar) + " left.");
      }


      double nike = 95.99;
      System.out.println("Can I get these nike shoes?");
      if ((wallet - toyCar) >= nike) {
      //if you have enough money
          //       print: Sure!
          System.out.println("Sure!");
          //       pay for the nike shoes
        } else {
          //else: Sorry, I only have <wallet> left.
          System.out.println("Sorry, I only have $" + (wallet - toyCar) + " left.");
        }
  }
}
