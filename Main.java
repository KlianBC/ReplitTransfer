/**
 * This class contains a main method with exercises     
 * demonstrating different Java concepts.
 * 1/24/2024
 * @author Klian Combs
 */
public class Main {
public static void main(String[] args) {
  
// print the sum of two int variables
int x = 2;
int y = 3;
  System.out.println("The sum of both numbers is: " + (x +   y));
  
// add a double variable to the previous exercise
double z = 20.13;
  System.out.println("The sum of both numbers is: " + String.format("%.2f", (x + y + z)));
  
// a simple boolean
boolean isJavaFun = true;
boolean isFishTasty = false;
  System.out.println(isJavaFun);
  System.out.println(isFishTasty);
  
// print 3 characters based on ascii values
  char myVar1 = 65, myVar2 = 66, myVar3 = 67;
  System.out.println("" + myVar1 + myVar2 + myVar3);
  
// extremely high level algorithm to prove that 2 is greater than 1
int high = 2;
int low = 1;
  if (high > low) {
    System.out.println("true");
  }
  
// concatenate two strings
String firstName = "Klian";
String lastName = "Combs";
  System.out.println(firstName + " " + lastName);
  
// print an int and string together (as one string)
String x2 = "2005";
int y2 = 18;
String z2 = x2 + y2;
  System.out.println(z2);
  
// simple print statement with escape characters
System.out.println("We are the so-called \"Vikings\" from the north.");
  
// if statement to determine the greater integer variable
int x3 = 20;
int y3 = 1;
  if (x3 > y3) {
    System.out.println("x is greater than y.");
  }
}
}