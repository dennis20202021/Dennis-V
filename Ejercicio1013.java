import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
     
     Locale.setDefault(Locale.US);
     Scanner scan = new Scanner(System.in);
     
     int a, b, c, d, e;
     
     a=scan.nextInt();
     b=scan.nextInt();
     c=scan.nextInt();
     d=(a+b+Math.abs(a-b))/2;
     e=(d+c+Math.abs(d-c))/2;
     
     System.out.printf("%d eh o maior\n", e);  
 
    }
 
}