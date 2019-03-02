import java.util.Scanner;
public class uri_1010{
  public static void main (String args[]){
    Scanner abesh=new Scanner (System.in);
    int a=abesh.nextInt();
    int b= abesh.nextInt();
    double c=abesh.nextDouble();
    double value= b*c;
    a =abesh.nextInt();
     b =abesh.nextInt();
     c=abesh.nextDouble();
    value= value+(b*c);
    System.out.printf("VALOR A PAGAR: R$ %.2f \n " , value );
  }}