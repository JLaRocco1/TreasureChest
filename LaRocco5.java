import java.util.*;//So I can use scanner

public class LaRocco5 {//Naming the class

   //Creating constants to store total number of seats by size
   static int totSize = 0;//Created constant to equal zero until class size is inputed from user
   public static final int TOTS = 25;
   public static final int TOTM = 32;
   public static final int TOTL = 50;
   public static final int TOTX = 70;
   
   
   public static Scanner console = new Scanner (System.in);//set scanner object
   
   public static void main(String[] args){//start of main method
   
   starMethod();//Method one will print 3 sets of 55 asterisks onto screen 
   String coInfo = courInfoMethod();//Method two will ask for the course code and the course name. 
   char coSize = courSizeMethod();//Method three will be used to ask for the size of the course, which will be used to indicate the total number of seats for the course
   switch (coSize){//these switch statements will provide four different options for the user to input, using constants created above
      case 'S':
      totSize = 25;
      break;
      
      case 'M':
      totSize = 32;
      break;
      
      case 'L':
      totSize = 50;
      break;
      
      case 'X':
      totSize = 70;
      break;
      
      default: 
      break;
   }
   String preReq = "";//this string variable will be used in the do while loop to return pre-requisites
   int count = 0;//this int variable will set the pre-requisite count to zero
   String req = "";//this string variable will be used in the do while loop
   while(!req.equals("done")){//method four is a do while loop that will return pre-requisites from user input until done is inputted
   count++;//this will increment the int count after each loop
   req = courPreReqMethod(count);
   if (!req.equals("done")){
      if (count == 1){
         preReq = "Pre-Requisites: " + req;   
      }
      else{
           preReq += ", " + req;
           }
   }
   }
   int stReg = studRegMethod();//method five will ask the user for current number of students registered
   int curAvail = calcAvailMethod(stReg);//method six will calculate number of seats available
   starMethod();//this will print 3 sets of 55 asterisks onto screen again
   printMethod(coInfo, stReg, curAvail, preReq);//method seven uses returned values to print onto screen
   }
   
   //star method
   public static void starMethod(){//start of method one
      for(int i = 1; i <= 3; i++){
         for(int j = 1; j <= 55; j++){
            System.out.print ("*");
         }
      System.out.println();   
      }   
   }//end method one
   
   public static String courInfoMethod(){//start of method two
      System.out.print("Please enter the course code: ");
      String courseCode = console.nextLine();
      System.out.print("Please enter the course name: ");
      String courseName = console.nextLine();
      String courseInfo = courseCode + ": " + courseName; 
      return courseInfo;
   }//end method two   
   
    public static char courSizeMethod(){//start of method three
      System.out.print("Please enter the course size (possible values are: S, M, L, or X): ");
      char courseSize = console.next().charAt(0);
      console.nextLine(); 
      return courseSize;
   }//end method three  
   
   public static String courPreReqMethod(int Num) {//start of method four
      System.out.print("List pre-requisite #" + Num + " (enter done, if finished entering pre-requisites)?");
      String courseSize = console.nextLine(); 
      return courseSize;
   }//end method four 
   
   public static int studRegMethod(){//start of method five
      System.out.print("How many students are currently registered for the course?");
      int sReg = console.nextInt();
      return sReg;
   }//end method five   
   
   public static int calcAvailMethod(int studReg){//start of method six
      int difference = (totSize - studReg);
      return difference;
   }//end method six
   
   public static void printMethod(String coInfo, int stReg, int curAvail, String preReq){//start of method seven 
      System.out.println(coInfo);
      System.out.println(preReq);
      System.out.println("Total number of seats = " + totSize);
      System.out.println("Number of students currently registered = " + stReg);
      System.out.println("Number of seats available = " + curAvail);
       if (curAvail > 5) {
         System.out.println ("There are a number of seats available");
      }else if(curAvail <= 5 && curAvail > 0) {
         System.out.println("Seats are almost gone!");
      }else{
         System.out.println ("No seats remaining.");
       } 
   }//end method seven
}//end program