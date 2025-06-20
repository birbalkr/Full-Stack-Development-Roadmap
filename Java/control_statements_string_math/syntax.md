1. Ternary Operator
   1. Syntax: condition ? expression1 : expression2
   2. Condition: Boolean expression, evaluates to true or false.
   3. Expressions: Both expressions must return compatible types.
   4. Use Case: Suitable for simple conditional assignments.
2. Switch
   1. Multiple Cases: Handles multiple values for an
      expression efficiently.
   2. Supported Types: Accepts byte, short, char, int, String,
      enums, and from Java 14, long, float, double.
   3. Case Labels: Each case ends with a colon (:) and is
      followed by code.
   4. Break Statement: Typically used to prevent fall-through
      between cases.
3. CHALLENGE
   1. Create a program to find the minimum of two numbers.
   2. Create a program to find if the given number is even or odd.
   3. Create a program to calculate the absolute value of a given integer.
   4. Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator
      (e.g., High for scores > 80, Moderate for 50-80, Low for < 50).
   5. Create a program to print the month of the year based on a number (1-12) input by the user.
   6. Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction, multiplication, and division.
4. 1. Do While Loop

      1. Executes block first, then checks condition.
      2. Guaranteed to run at least one iteration.
      3. Unlike while, first iteration is unconditional.
      4. Don't forget to update condition to avoid infinite loops.

   2. For Loop

      for(int j=1; j<=100; j++){
      System.out.print(j+" ");
      }

   3. For each
      1. A method for array iteration, often preferred for readability.
      2. Parameters: One for item, optional second for index.
      3. Using return is similar to continue in traditional loops.
      4. Not straightforward to break out of a forEach loop.
      5. When you need to perform an action on each array element
         . and don't need to break early.

5. Recursion

   1. Self-Calling Function: Recursion is when a function calls itself.
   2. Base Case: Essential to stop recursion and prevent infinite loops.
   3. Recursive Case: The part where the function makes a recursive call.
   4. Stack Overflow Risk: Excessive recursion can cause stack overflow errors.
   5. Problem Solving: Ideal for problems divisible into similar, smaller
      problems.

6. CHALLENGE
   1. Create a program using do-while to find password checker until a valid password is entered.
   2. Create a program using do-while to implement a number guessing game.
   3. Create a program using for loop multiplication table for a number.
   4. Create a program using for to display if a number is prime or not.
   5. Create a program using for-each to find the maximum value in an integer array.
   6. Create a program using for-each to the occurrences of a specific element in an array.
   7. Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.
   8. Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers.
   9. Create a program using continue to print only even numbers using continue for odd numbers.
   10. Create a program using recursion to display the Fibonacci series upto a certain number.
   11. Create a program using recursion to check if a string is a palindrome using recursion.
