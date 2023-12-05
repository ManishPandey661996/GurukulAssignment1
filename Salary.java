

import java.util.Scanner;
class Salary{
      public static void main(String[] args ){
           Scanner sc = new Scanner(System.in);
           Double salary,bonus;
           System.out.println("Enter the salary of the employee ");
           salary = sc.nextDouble();
           bonus = (0.17)*salary;
           System.out.println(" salary of the employee : "+ salary);
           System.out.println(" bonus of the employee : "+ bonus);
      }
}