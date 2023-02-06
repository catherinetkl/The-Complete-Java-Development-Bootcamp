// Task 1 -- Decrease your number of apples based on the printed messages.
// Task 2 -- Increase your number of customers based on the printed messages.

public class AppleStore {
  public static void main(String[] args) {
    int numOfApples = 0;
    int numOfCustomers = 0;
    double profit = 0;

    System.out.println("You picked 500 apples from an apple orchard!");
    // Update number of apples
    numOfApples += 500;

    System.out.println("Time for business! You're selling each apple for 40 cents");
    // Task 3 -- Make a price variable and set it equal to 0.40.
    double priceOfApple = 0.40;

    System.out.println("One customer walked in. He bought 4 apples!");
    // Update number of apples
    numOfApples -= 4;
    // Update number of customers
    numOfCustomers ++;
    // Update profit
    profit += priceOfApple * 4;

    System.out.println("Another customer walked in. He bought 20 apples!");
    // Update number of apples
    numOfApples -= 20;
    // Update number of customers
    numOfCustomers ++;
    // Update profit
    profit += priceOfApple * 20;

    System.out.println("Another customer walked in. She bought 200 apples!");
    // Update number of apples
    numOfApples -= 200;
    // Update number of customers
    numOfCustomers ++;
    // Update profit
    profit += priceOfApple * 200;

    // Task 4 -- Replace each placeholder with a variable
    System.out.println("Wow! So far, you made: $" + profit);

    System.out.println(numOfCustomers + " customers love your apples.");

    System.out.println("You have " + numOfApples + " apples left. We'll sell more tomorrow!");

  }
}
