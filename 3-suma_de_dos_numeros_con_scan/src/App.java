import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int suma = 0, a = 0, b = 0, c = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        a = scanner.nextInt();

        System.out.println("Ingrese un segundo numero: ");
        b = scanner.nextInt();

        System.out.println("Ingrese un tercer numero: ");
        c = scanner.nextInt();

        suma = a + b + c;

        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
