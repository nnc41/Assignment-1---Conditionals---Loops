/******************************************************************************
 *  Name:    Lucia
 *  NetID:   Chu
 *  Precept: P00
 *
 *  Description:  This program simulates the motion of a random walk for a given
 *                number of steps, starting from the origin (0, 0). Each step moves
 *                in one of four directions (north, east, south, or west) with equal
 *                probability. The program prints the coordinates after each step
 *                and computes the squared distance from the origin at the end of
 *                the walk.
 **************************************************************************** */

 public class RandomWalker {

  /**
   * Entry point of the program. It simulates a random walk, prints each step's
   * coordinates, and the squared distance from the origin after all steps are taken.
   *
   * @param args command-line arguments, expects a single int: the number of steps
   */
  public static void main(String[] args) {
      final int NORTH = 1;
      final int EAST = 2;
      final int SOUTH = 3;
      final int WEST = 4;

      // Number of steps in the random walk
      int n = Integer.parseInt(args[0]);

      // Initial position at the origin
      int x = 0;
      int y = 0;

      // Output the starting position
      System.out.println("Starting position: (" + x + ", " + y + ")");

      // Perform the random walk for n steps
      for (int i = 1; i <= n; i++) {
          int direction = (int) (Math.random() * 4) + 1;

          // Update position based on the random direction
          switch (direction) {
              case NORTH:
                  y++;  // Move north
                  break;
              case EAST:
                  x++;  // Move east
                  break;
              case SOUTH:
                  y--;  // Move south
                  break;
              case WEST:
                  x--;  // Move west
                  break;
          }

          // Output the current position
          System.out.println("Step " + i + ": (" + x + ", " + y + ")");
      }

      // Calculate squared distance from the origin
      int squaredDistance = x * x + y * y;

      // Print the squared distance from the origin
      System.out.println("Squared distance from origin = " + squaredDistance);
  }
}
