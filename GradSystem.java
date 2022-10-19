/*
Program: WAP to print the grade according to the percentage
 @Auther: Pintu kumar
 @date: 19 oct 2022
 */
 
 //import packages
 import java.util.Scanner;
 
 //declaring a class
 class GradSystem
 {
   //main started
   public static void main(String args[])
   {
     //declaring the object of scanner
	 Scanner sc = new Scanner(System.in);
	 //declaring variable
	 float percentage ;
	 char grade;
	 //taking input
	 System.out.println("Enter the percentage:");
	 percentage = sc.nextFloat();
	 //checking percentage to call grade
	 if(percentage>=90)
		 grade='A';
	     else if(percentage>=80)
		           grade='A';
	         else if (percentage>=60)
		          grade='B';
	             else if(percentage>=40)
		               grade='C';
	 //assigning
	     else 
		 grade='F';
	 //end of ifelse
		 if(grade=='f')//comparing
	       System.out.println("Sorry! You have failed----very work hard next time");
		   else
			   System.out.println("You have cleared the exam with grade:"+grade);
   }
   //end of main
 }
 //end of class
	