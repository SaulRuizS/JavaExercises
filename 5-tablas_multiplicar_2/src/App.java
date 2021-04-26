import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception
     {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese hasta que tabla quiere consultar: ");
        int num_tabla = scanner.nextInt();

        for(int i = 1; i <= num_tabla; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("");
        }
    }
}
