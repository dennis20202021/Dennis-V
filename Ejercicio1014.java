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
        int X;
        float Y;
        double AC;
        X=Integer.parseInt(input.readLine());
        Y=Float.parseFloat(input.readLine());
        AC=(X/Y);
        System.out.printf("%.3f km/l\n", AC);
    }
 
}