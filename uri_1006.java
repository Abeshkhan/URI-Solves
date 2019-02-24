import java.util.Scanner;
public class uri_1006{
  public static void main ( String args[]){
  Scanner abesh= new Scanner (System.in);
  float A =abesh.nextFloat();
  float B=abesh.nextFloat();
  float C=abesh.nextFloat();
  double yo = (((A*2)+(B*3)+(C*5))) / (2+3+5);
  System.out.printf("MEDIA = %.1f" , yo);
  System.out.println();
}}