/******************************************************************************
 *  Name:    Lucia Chu
 *  NetID:   nnc41
 *  Precept: P00
 *
 *  Description: This program simulates multiple independent experiments of a
 *               random walk of n steps each, and computes the mean squared distance
 *               from the origin across all trials. This simulation represents a
 *               discrete model of Brownian motion, illustrating phenomena such as
 *               dispersion and polymer chain formation.
 *
 **************************************************************************** */

 public class RandomWalkers {

  /**
   * Main method that processes command-line arguments and conducts several trials
   * of a random walk, each consisting of a specified number of steps. It calculates
   * and prints the mean squared distance from the origin after all trials.
   *
   * @param args command-line arguments, expects two integers: n (steps per walk)
   *             and trials (number of experiments)
   */
  public static void main(String[] args) {
      final int NORTH = 1;
      final int EAST = 2;
      final int SOUTH = 3;
      final int WEST = 4;

      // Parse the number of steps and trials from command-line arguments
      int n = Integer.parseInt(args[0]);
      int trials = Integer.parseInt(args[1]);

      // Initialize the total sum of squared distances
      int totalSquaredDistance = 0;

      // Conduct each trial of the random walk
      for (int i = 0; i < trials; i++) {
          int x = 0; // X-coordinate of the walker
          int y = 0; // Y-coordinate of the walker

          for (int j = 0; j < n; j++) {
              int direction = (int) (Math.random() * 4) + 1;

              // Update the walker's position based on the random direction
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
          }

          // Compute squared distance from the origin for this trial
          int squaredDistance = x * x + y * y;

          // Accumulate squared distances
          totalSquaredDistance += squaredDistance;
      }

      // Calculate the mean squared distance
      double meanSquaredDistance = (double) totalSquaredDistance / trials;

      // Print the mean squared distance
      System.out.println("Mean squared distance = " + meanSquaredDistance);
  }
}
