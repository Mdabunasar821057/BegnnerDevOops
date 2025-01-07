package basicClaculator;

import java.util.*;

public class calculator {

	public static void main(String[] args) {
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		//entry code 
		
		System.out.println("Enter First Number");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter Sceond Number");
		double num2 = sc.nextDouble();
		
		System.out.println("Choose Operating (+, -, *, /, %): ");
       char operation = sc. next().charAt(0);
       
       double result;
       
       //switch case use
       
       switch(operation) {
       
       case '+':
    	   result = num1 + num2;
    	   System.out.println("Result: " + result);
    	   break;
    	   
       case '-':
    	   result = num1 - num2;
    	   System.out.println("Result: " + result);
    	   break; 
    	   
       case '*':
    	   result = num1 * num2;
    	   System.out.println("Result: " + result);
    	   break; 
    	   
       case '/':
    	   if(num2 != 0) {
    	   result = num1 / num2;
    	   System.out.println("Result: " + result);
    	   }else {
    		   System.out.println("Error:Division by zero is not allowed");
    		   
    	   }
    	   break; 
    	   default:
    		   System.out.println("Error invalid Operation");
    		   break;
            
    	   case '%':
    	  	   if(num2 != 0) {
    	  	   result = num1 % num2;
    	  	   System.out.println("Result: " + result);
    	  	   }else {
    	  		   System.out.println("Error:Moduls By Zero is Not Allowed");
    	  		   break;
    	  		   
    	  	   }
	 
	        }
           
	     }

       }
