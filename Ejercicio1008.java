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
       
 float S, QH;
 int N, WH;
 
 N=Integer.parseInt(input.readLine());
  WH=Integer.parseInt(input.readLine());
  QH=Float.parseFloat(input.readLine());
  
  S=WH*QH;
  
  System.out.printf("NUMBER = %d\n", N);
  System.out.printf("SALARY = U$ %.2f\n", S);
  
 
 
    }
 
}