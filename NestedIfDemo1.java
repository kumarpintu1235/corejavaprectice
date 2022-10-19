/*
Program: WAP to print check and donet boold
 @Auther: Pintu kumar
 @date: 19 oct 2022
 */
 
 //import packages
 import java.util.Scanner;
 
 //declaring a class
 class NestedIfDemo1
 {
   //main started
   public static void main(String args[])
   {
     //declaring the object of scanner
	 Scanner sc = new Scanner(System.in);
	 
	 //declaring variables
	 int age;
	 float weight;
	 char gender;
	 
	 //taking input
	 System.out.println("Enter your age:");
	 age= sc.nextInt();
	 
	 //checking age criteria
	 if(age>=18)
	 {
		 //taking input
		 System.out.println("Enter your gender(m/f):");
	     gender= sc.next().charAt(0);
		 System.out.println("Enter your weight:");
	     weight= sc.nextFloat();
		 //checking weight criteria
		 
		 if(((gender=='m')&&(weight>=50))||((gender=='f')&&(weight>=48)))
			 System.out.println("You can donate the blood----");
		 else
			 System.out.println("You can not donate the blood ---Better luck  next time");
      }
	   else
		 System.out.println("You are too young to donate blood --- Please wait!");
       //end of ifelse
     }
//end of class
 }
		 
		