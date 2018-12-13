package multibracketvalidation;

import StacksAndQueues.Stack;

public class MultiBracketValidation {

  //Instance Variables
  public static int lengthOfInput;
  public static boolean isSymmetricallyBalenced = false;
  public static Stack openers;
  public static Stack closers;

  //Constructors
  /*****N/A****/

  //Methods

      /*
     * Steps to do:
     * 1. find the length and store it in a variable
     * 2. iterate through the String's length doing some more logic
     *
     * 3. if the idx is an opener: {([, then add it (technically .push()) to an "opener-Stack"
     * 4. when we get to push an opener, make sure to push it's pair as well to a "closer-stack"
     *
     * 5. when we get to a closer: ])}, end one cycle of constructing the opener stack as well as the pairings in the closer-stack
     * 6. validate that the pairings are correct using peek
     * 7. if they are not return false and stop iterating.
     *  7.5 if they are correct, pop them off each stack to continue down the list
     * 8. if they are in the correct symmetrical sequence then continue until the stack is complete with its comparison
     *
     *
     * 9. move to the next idx and repeat until the end of the string
     * 10. if we made it this far -> return True
     * */


    public static boolean multiBracketValidation(String stringToVal){
      lengthOfInput = stringToVal.length();

    return false;
  }


}



















