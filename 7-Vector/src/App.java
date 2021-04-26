import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[5];
        int suma = 0, promedio;

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Ingrese el valor para vector[" + i + "]:");
            vector[i] = scanner.nextInt();
            System.out.println("El valor de vector[" + i + "] es " + vector[i] + "\n");
            
            suma += vector[i];
        }

        promedio = suma/5;
        System.out.println("El total de la suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
