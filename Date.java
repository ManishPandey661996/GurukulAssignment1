

import java.util.Scanner;
class Date{
     public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          int date,month,year;
          System.out.println("Enter date ");
          date = sc.nextInt();
          System.out.println("Enter month ");
          month = sc.nextInt();
          System.out.println("Enter year ");
          year = sc.nextInt();
          System.out.println("date in dd/mm/yy : "+ (date/10)+(date%10)+"/"+(month/10)+(month%10)+"/"+(year%100));
     }
}