/*******************************************************************************
 *  Name: Lucia Chu
 *  NetID: nnc41
 ******************************************************************************/

COS 126 Assignment: Conditionals & Loops

What operating system do you use?
- macOS

Which text editor are you using to edit this file? (We recommend IntelliJ!)
- IntelliJ

Number of hours to complete this assignment: 3 hours

/**********************************************************************
 *  What is the relationship between the number of steps n of the
 *  random walk and the mean squared distance? By relationship, we mean
 *  something like
 *                       mean squared distance = 126 n^9
 *
 *  Briefly justify your answer based on computational experiments.
 *  Describe the experiments and list several data points.
 *********************************************************************/
- As n increases, we expect the random walk to end up farther and
  farther away from the origin.

  Data:
  ~/Desktop/loops> java RandomWalkers 10 1000
  mean squared distance = 9.662
  ~/Desktop/loops> java RandomWalkers 20 1000
  mean squared distance = 19.93
  ~/Desktop/loops> java RandomWalkers 30 1000
  mean squared distance = 29.136
  ~/Desktop/loops> java RandomWalkers 40 1000
  mean squared distance = 40.528
  ~/Desktop/loops> java RandomWalkers 50 1000
  mean squared distance = 49.878
  ~/Desktop/loops> java RandomWalkers 60 1000
  mean squared distance = 62.01

  Mean squared distance as the function of n is approximately
   f(n) =




/**********************************************************************
 *  Did you receive help from classmates, past COS 126 students, or
 *  anyone else? If so, please list their names. ("A Sunday lab TA" or
 *  "Office hours on Thursday" is OK if you don't know their name.)
 **********************************************************************/

Yes or no? no



/**********************************************************************
 *  Did you encounter any serious problems? If so, please describe.
 **********************************************************************/

Yes or no? no


/**********************************************************************
 *  List any other comments here.
 **********************************************************************/

