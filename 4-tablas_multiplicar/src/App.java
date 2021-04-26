import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la tabla que quiere consultar: ");
        int num_tabla = scanner.nextInt();

        for (int i = 0; i <= 10; i++)
        {
            System.out.print(num_tabla + " x " + i + " = ");
            System.out.println(num_tabla * i);
        }
    }
}
