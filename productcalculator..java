import java.util.Scanner;

public class RecursiveCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] numbers = new double[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter number " + (i+1) + ": ");
      numbers[i] = scanner.nextDouble();
    }

    double product = calculateProduct(numbers, 0);
    System.out.println("The product of five numbers is: " + product);
 }

  public static double calculateProduct(double[] numbers, int index) {
    if (index == 4) {
      return numbers[index];
     } else {
      return numbers[index] * calculateProduct(numbers, index +1);
    }
  }
}
