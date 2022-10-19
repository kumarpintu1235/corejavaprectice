/*
Program: WAP to print check and donet boold
 @Auther: Pintu kumar
 @date: 19 oct 2022
 */
 
 //import packages
 import java.util.Scanner;
 
 //declaring a class
 class NestedIf1
 {
   //main started
   public static void main(String args[])
   {
     //declaring the object of scanner
	 Scanner sc = new Scanner(System.in);
	 
	 //declaring variables
	 int age;
	 float weight;
	 
	 //taking input
	 System.out.println("Enter your age:");
	 age= sc.nextInt();
	 
	 //checking age criteria
	 if(age>=18)
		 {
		 //taking input
		  System.out.println("Enter your weight:");
	     weight= sc.nextFloat();
		 //checking weight criteria
		 if(weight>=51)
			 System.out.println("You can donate the blood-----welcome");
		 else
			 System.out.println("You are under weight -----Please take healthy foods");
		  //end of nested ifelse
		 }
	  else
		  System.out.println("You are too young to donate blood.....Please wait!");
   //end of outer ifelse
   }
//end of main
 }
 //end of class 