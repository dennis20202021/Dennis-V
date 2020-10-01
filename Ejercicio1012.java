import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
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
    float A, B, C;
    double art, ac, at, as, ar;
    
    A=input.nextFloat();
    B=input.nextFloat();
    C=input.nextFloat();
    
    art=(A*C)/2;
    ac=3.14159*Math.pow(C, 2);
    at=((A+B)/2)*C;
    as=Math.pow(B, 2);
    ar=A*B;
    
    System.out.printf("TRIANGULO: %.3f\n", art);
    System.out.printf("CIRCULO: %.3f\n", ac);
    System.out.printf("TRAPEZIO: %.3f\n", at);
    System.out.printf("QUADRADO: %.3f\n", as);
    System.out.printf("RETANGULO: %.3f\n", ar);
 
    }
 
}