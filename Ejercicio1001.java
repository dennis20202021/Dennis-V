import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
      int A=0;
      int B=0;
      int X=0;
      
      A=Integer.parseInt(input.readLine());
      B=Integer.parseInt(input.readLine());
      
      X=A+B;
      
      System.out.printf("X = %d\n", X);
 
    }
 
}