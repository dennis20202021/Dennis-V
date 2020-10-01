import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
       Scanner input = new Scanner(System.in);
       Locale.setDefault(Locale.US);
        
        double x1, y1, x2, y2;
        double td;
        x1=input.nextDouble();
        y1=input.nextDouble();
        
        x2=input.nextDouble();
        y2=input.nextDouble();
        
        td=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        System.out.printf("%.4f\n", td);
    }
 
}