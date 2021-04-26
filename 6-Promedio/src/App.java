import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        float suma, promedio;

        System.out.println("A continuacion debera ingresar 4 valores par aobtener su promedio.\nIngrese el primer valor:");
        a = scanner.nextInt();

        System.out.println("Ingrese el segundo valor:");
        b = scanner.nextInt();

        System.out.println("Ingrese el tercer valor:");
        c = scanner.nextInt();

        System.out.println("Ingrese el cuarto valor:");
        d = scanner.nextInt();

        suma = a + b + c + d;
        promedio = (float)(suma/4);

        System.out.println("El promedio resultante es: " + promedio);

    }
}
