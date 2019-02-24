import java.util.Scanner;

public class URI_1005 {

    public static void main(String[] args){

            float A, B;
            Scanner abesh = new Scanner(System.in);
            A = abesh.nextFloat();
            B = abesh.nextFloat();
            double yo = (((A * 3.5) + (B * 7.5)) / (3.5 + 7.5));
            
            System.out.printf("MEDIA = %.5f",yo);
            System.out.println();

    }

}
