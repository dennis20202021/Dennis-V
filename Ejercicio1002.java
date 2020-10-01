import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
     InputStreamReader in = new InputStreamReader(System.in);
     BufferedReader input = new BufferedReader(in);
     
     double A, n=3.14159;
     double R;
     R=Double.parseDouble(input.readLine());
     
     A=n*(R*R);
     
     System.out.printf("A=%.4f\n", A);
     
    }
 
}