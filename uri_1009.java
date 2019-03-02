import java.util.Scanner;
public class Uri_1009{
  public static void main( String args[]){
    double salary =0;
  Scanner abesh=new Scanner ( System.in);
  System.out.println ( "employee's first name");
  String name=abesh.next();
   salary=abesh.nextDouble();
  double sales=abesh.nextDouble();
  double total=((sales*15)/100)+salary;
  System.out.printf("TOTAL = R$ %.2f\n ",total);
  
}}
