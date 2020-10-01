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
    
    double A, B;
    double average;
    
    A=Double.parseDouble(input.readLine());
    B=Double.parseDouble(input.readLine());
    average=((A*3.5)+(B*7.5))/11;
    
    System.out.printf("MEDIA = %.5f\n", average);
 
    }
 
}