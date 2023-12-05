

import java.util.Scanner;
class Reverse{
     public static void main(String[] args){
          int digit,sum, originalNo,a ,b ,c;
          String reverse;
          Scanner sc = new Scanner(System.in);
          System.out.println(" Enter a 3-digit number ");
          digit = sc.nextInt();
          originalNo = digit;
          a=digit%10;
          sum =a;
          digit = digit/10;
          reverse="" +a;
          b=digit%10;
          sum = sum+b;
          digit = digit/10;
          reverse =reverse+b;
          c=digit%10;
          sum= sum+c;
          digit= digit/10;
          reverse= reverse+c;
          System.out.println(" 3-digit number : "+ originalNo);
          System.out.println(" Reverse :  "+ reverse);
          System.out.println(" sum : "+sum);
    }
}
          
          
          
          
          