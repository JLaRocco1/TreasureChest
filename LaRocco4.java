/*This program will evaluate a person's health. Program will ask the user for their waist measurement (in inches), height measurement (in feet and inches),
gender, and number of minutes of exercise they get in a typical week. After evaluating, the program will print the user's waist measurement (in inches),
height measurement (in inches), gender, wasist to height ratio (as a percentage, rounded to 2 decimal places), a ratio message and the total
number of minutes of exercise they get in a typical week onto the screen.*/

import java.util.*;//import the java.util package in order to work with the Scanner class

public class LaRocco4 { //create public class
public static Scanner console = new Scanner (System.in);//object to use scanner console

   public static void main (String[] args) {//start of main method
   Scanner console = new Scanner (System.in);
   int exercise;
   
   starMethod();//method to print asterisks onto screen
   
   int waist = waistInMethod();//method to store value of waist measurement in inches
   
   int height = heightInMethod();//method to store value of height measurement in inches
   
   String gender = genMethod();//method to store value of user's gender
   
   //Scanner console = new Scanner (System.in);
   exercise = exerMethod(console);//method to store total number of minutes of exercise user gets in a typical week
   
   
   }
   
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
     
     public static String genMethod()//calling genMethod to return user's gender
      { System.out.print("Please enter your gender, F for female or M for male: ");
         String gender = console.next();//scanner console statement for user inputted data
         return gender;//return value of gender
      }//end gen Method
      
     public static int exerMethod(Scanner console)
     { int sum = 0;
      for (int i = 1; i <= 7; i++)
         { System.out.println ("Please enter the typical number of minutes of exercise you get on day" + i + "of each week: ");
         sum = sum + console.nextInt();
         //int exercise = console.nextInt();
         }
         
         return exercise;
         
      }
   
 }
     
     

