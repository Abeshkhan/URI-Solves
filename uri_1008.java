import java.util.Scanner;
public class uri_1008{
  public static void main(String args[]){
    Scanner abesh=new Scanner (System.in);
    int en=abesh.nextInt();
    int hn=abesh.nextInt();
    float s=abesh.nextFloat();
    float salary = hn*s;
    System.out.println("NUMBER = "+en);
    System.out.printf("SALARY = U$ %.2f",salary);
       System.out.println();
  }}