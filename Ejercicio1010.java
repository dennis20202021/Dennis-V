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
        
    Locale.setDefault(Locale.US);    
    
    Scanner input = new Scanner(System.in);
    int P, UP, UP1, P1;
    float PP, PP1;
    double T;
    P=input.nextInt();
    UP=input.nextInt();
    PP=input.nextFloat();
    
    P1=input.nextInt();
    UP1=input.nextInt();
    PP1=input.nextFloat();
    
    T=(UP*PP)+(UP1*PP1);
    
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", T);
 
    
    }
 
}