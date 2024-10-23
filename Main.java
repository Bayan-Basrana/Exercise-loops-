import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
 */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else
                System.out.println(i);
        }
      /*
 2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT
       */
        String text = "The quick brown fox";
        String reverse = "";
        for (int x = text.length() - 1; x >= 0; x--) {
            reverse += text.charAt(x);
        }
        System.out.println(reverse);



      /*
 3.Write a program to find the factorial value of any number entered
through the keyboard.
       */
        System.out.println(" Enter any number to find the factorial value ");
        int number = input.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("factorial of  " + number + " =" + factorial);

/*
4.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java
built-in method)
 */
        System.out.println("Enter base");
        int base = input.nextInt();
        System.out.println("Enter exponent");
        int exponent = input.nextInt();
        int resulte = 1;
        for (int i = 1; i <= exponent; i++) {
            resulte *= base;
        }
        System.out.println(resulte);

        /*
        5.Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.
         */
        int num;
        int sum_odd = 0;
        int sum_even = 0;

        do {
            System.out.println("please enter number or zero to stop");
            number = input.nextInt();
            if (number % 2 == 0)
                sum_even = sum_even + number;
            else
                sum_odd = sum_odd + number;
        } while (number != 0);
        System.out.println("sum of odd numbers" + sum_odd);
        System.out.println("sum of even numbers" + sum_even);

/*
6.Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.
 */
        int pos_Int;
        do {
            System.out.println("Enter positive integer");
            pos_Int = input.nextInt();
            if (pos_Int <= 0) {
                System.out.println("incorrect, please enter positive integer");
            }
        } while
        (pos_Int <= 0);
        boolean isPrime = true;
        if (pos_Int == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= pos_Int / 2; i++) {
                if (pos_Int % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("is prime number ");
        } else {
            System.out.println("is not  prime number ");
        }

        /*
  7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week.
         */
        //weeks loop
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week);
            // days loop
            for (int day = 1; day <= 7; day++)
                System.out.println("Day " + day);

        }
        /*
  8.Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.
         */
        System.out.println("enter word");
        String word = input.nextLine();
boolean isPalindrome= true;
for (int i=0 ; i<word.length()/2 ;i++){
    if (word.charAt(i)!= word.charAt(word.length() -1-i)) {
        isPalindrome = false;
        break;
    }}
if (isPalindrome){
            System.out.println(word + " is Palindrome");
        } else {
            System.out.println(word + " is not Palindrome");
        }

    }
  }
