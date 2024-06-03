/******************************************************************************
 *  Name:    Lucia Chu
 *  NetID:   nnc41
 *  Precept: P00
 *
 *  Description:  This program generates an n-by-n checkerboard pattern using
 *                asterisks and spaces. It takes an integer command-line argument
 *                n, and prints a checkerboard pattern where each row has 2n
 *                characters (alternating between asterisks and spaces). The
 *                pattern alternates starting character each row.
 *
 **************************************************************************** */

 public class Checkerboard {

  /**
   * The main method that processes the command-line argument to determine the size
   * of the checkerboard and prints the checkerboard pattern.
   * Each row alternates between starting with an asterisk and starting with a space.
   *
   * @param args command-line arguments, expects a single integer that defines the
   *             size of the checkerboard
   */
  public static void main(String[] args) {
      // Parse the size of the checkerboard from the command-line argument
      int n = Integer.parseInt(args[0]);

      // Iterate over each row of the checkerboard
      for (int i = 1; i <= n; i++) {
          // Iterate over each column of the checkerboard
          for (int j = 1; j <= n; j++) {
              // Check the row number to determine the starting character
              if (i % 2 == 0) {
                  // For even rows: start with a space
                  System.out.print(" *");
              } else {
                  // For odd rows: start with an asterisk
                  System.out.print("* ");
              }
          }
          // Move to the next line after printing all columns in the current row
          System.out.println();
      }
  }
}
