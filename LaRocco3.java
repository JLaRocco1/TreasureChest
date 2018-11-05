/*This program will calculate a person's wasit to height ratio. This program will ask the user for their waist measurement (in inches)
and height measurement (in feet and inches). After calcualting, the program will print the persons waist measurement (in inches),
height measurement (in inches) and waist to height ratio (as a percentage, rounded to the nearest whole number) onto the screen. It
will make use of methods will parameters and return values, the Scanner class and String methods. */


import java.util.*;//import the java.util package in order to work with the Scanner class

public class LaRocco3 { //create public class
public static Scanner console = new Scanner (System.in);//object to use scanner console

   public static void main (String[] args) {//start of main method
   
   starMethod();//method to print asterisks onto screen
   
   int waist = waistInMethod();//method to store value of waist measurement in inches
   
   int height = heightInMethod();//method to store value of height measurement in inches
   
   starMethod();//method to print asterisks onto the screen
   
  double ratio = ratioMethod(waist, height);//method to calculate and store value of waist to height ratio
  
  printlnMethod(waist, height, ratio);//method to print stored values onto the screen
   
  }//end of main method
  
   public static void starMethod() { //star Method, begin for loop
       for (int i = 1; i <= 2; i++) {//begin nested loop
          for (int n = 1; n <= 50; n++) {//begin nested loop
            System.out.print("*");//print line statement to print asterisks onto screen
            }//end nested loop
            System.out.println();//println statement to print a blank line onto the screen
       }//end for loop     
    }
    
    public static int waistInMethod()//calling waistIn method to return waist measurement in inches
     { System.out.print("Please enter your waist measurement, in inches: ");//print statement prompting user to enter info
    int waist = console.nextInt();//scanner console statement for user inputted data
    return waist;//return value of waist measurement to waist variable
    }//end of waistIn method

    public static int heightInMethod()//calling heightIn method to return height measurement in inches
    { System.out.println("Please enter your height measurement, in feet and inches");//print statement prompting user to enter info
      System.out.print("(separate feet and inches by a space): ");//print statement prompting user to enter info
      int feet = console.nextInt();//scanner console statement for user inputted data
      int inches = console.nextInt();//scanner console statement for user inputted data
      
     int height = feet * 12 + inches;//converting feet and inches to inches
     return height;//returning value of height measurement to height variable
     }//end heightIn method
     
      public static double ratioMethod(int waist, int height){ //calling ratio method to calculate waist to height ratio
       double ratio = (double)waist / height * 100; //calculates waist to height ratio then converts to a percentage
       return ratio;} //end ratio method
       
       public static void printlnMethod(int waist, int height, double ratio){//calling println method
       System.out.println("Waist = " + waist + " inches");//println statement to print waist measurement onto screen
       System.out.println("Height = " + height + " inches");//println statement to print height measurement onto screen
       System.out.println("Waist to Height Ratio = " + Math.round(ratio) + "%");//println statement to print waist to height ratio percentage rounde to a whole number measurement onto screen
       }//end println method
     
}//end class
      