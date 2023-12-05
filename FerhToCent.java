

import java.util.Scanner;
class FerhToCent {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            double fahrenheit, centigrade  ;
            System.out.println(" enter the temperature in fahrenheit ");
            fahrenheit = sc.nextDouble();
            System.out.println("  temperature in fahrenheit : "+fahrenheit );
            centigrade =((fahrenheit - 32)/9)*5 ;
            System.out.println("  temperature in centigrade : "+ centigrade);
      }
}