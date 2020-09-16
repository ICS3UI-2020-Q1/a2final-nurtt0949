import java.util.Scanner;

/**
 *this program tells users their total for ordering a pizza
 * @authorTolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user for pizza size
    System.out.println("What size would you like you pizza in cm?");
    // get integer from user
    double size = input.nextDouble();

    // calculate the order
    if (size < 20) {

      System.out.println("We are going to make you a cute little pizza");

      double labour = size * 0.75;

      double oven = size * 0.99;

      double ingredients = size * 0.50;

      double subtotal = labour + oven + ingredients;

      double tax = subtotal * 0.13;

      double total = labour + oven + ingredients + tax;

      // tell user their order

      System.out.println("Your subtotal is " + subtotal);

      System.out.println("Your tax was " + tax);

      System.out.println("The price of your pizza is " + total);

    }

    // calculate the order
    else if (size < 40) {

      double labour = size * 0.75;

      double oven = size * 0.99;

      double ingredients = size * 0.50;

      double subtotal = labour + oven + ingredients;

      double tax = subtotal * 0.13;

      double total = labour + oven + ingredients + tax;

      // tell user their order

      System.out.println("Your subtotal is " + subtotal);

      System.out.println("Your tax was " + tax);

      System.out.println("The price of your pizza is " + total);

      System.out.println("This will be delicious");

    }

    // calculate the order
    else if (size > 40) {

      double labour = size * 0.75;

      double oven = size * 0.99;

      double ingredients = size * 0.50;

      double subtotal = labour + oven + ingredients;

      double tax = subtotal * 0.13;

      double total = labour + oven + ingredients + tax;

      // tell user their order

      System.out.println("Your subtotal is " + subtotal);

      System.out.println("Your tax was " + tax);

      System.out.println("The price of your pizza is " + total);

      System.out.println("Whoa big pizza! You might need a truck to get this home!");

    }

  }
}
