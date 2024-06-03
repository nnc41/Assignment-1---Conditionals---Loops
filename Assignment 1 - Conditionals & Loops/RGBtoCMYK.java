/******************************************************************************
 *  Name:    Lucia Chu
 *  NetID:   nnc41
 *  Precept: P00
 *
 *  Description:  This program converts RGB color values to CMYK color values.
 *                It takes three integer command-line arguments (red, green, and blue),
 *                each representing the color intensity in RGB format, and converts
 *                these to their CMYK format equivalents using mathematical formulas.
 *                The output includes both the original RGB values and the resulting
 *                CMYK values.
 **************************************************************************** */

 public class RGBtoCMYK {

  /**
   * Entry point for the program. Takes RGB values as input and calculates
   * the corresponding CMYK values. This method handles parsing input values,
   * calculating maximum color intensity, and printing both RGB and CMYK values.
   *
   * @param args command-line arguments contain three integers: red, green, blue
   */
  public static void main(String[] args) {
      // Constant for maximum color intensity in RGB
      final double COLOR_MAX = 255.0;

      int red = Integer.parseInt(args[0]);
      int green = Integer.parseInt(args[1]);
      int blue = Integer.parseInt(args[2]);

      // Calculate the white reference point
      double white = Math.max(red / COLOR_MAX,
                              Math.max(green / COLOR_MAX, blue / COLOR_MAX));

      // Initialize CMYK values
      double cyan, magenta, yellow, black;

      // Convert RGB values to CMYK values
      if (white == 0) {
          cyan = 0;
          magenta = 0;
          yellow = 0;
      } else {
          cyan = (white - red / COLOR_MAX) / white;
          magenta = (white - green / COLOR_MAX) / white;
          yellow = (white - blue / COLOR_MAX) / white;
      }

      // Calculate the black color component
      black = 1.0 - white;

      // Output the RGB values
      System.out.println("RGB values:");
      System.out.println("red = " + red);
      System.out.println("green = " + green);
      System.out.println("blue = " + blue);

      // Output the converted CMYK values
      System.out.println("CMYK values:");
      System.out.println("cyan = " + cyan);
      System.out.println("magenta = " + magenta);
      System.out.println("yellow = " + yellow);
      System.out.println("black = " + black);
  }
}
