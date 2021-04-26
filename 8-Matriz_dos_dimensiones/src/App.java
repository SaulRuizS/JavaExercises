
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        for (int i = 0; i < 3; i++)
        {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("\nA continuacion debera ingresar valores para la fila "+ i +" de la matriz bidimensional\n");
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Ingrese el valor para matriz["+ i +"]["+ j +"]: ");
                matriz[i][j] = scanner.nextInt();
                System.out.println("");
            }
            System.out.println("Los valores de la fila "+ i + " son: [" + matriz[i][0] + ", " + matriz[i][1] + ", " + matriz[i][2] + "]");
        }

        System.out.println("\n----------------------------------------------------------------------------------------");
        System.out.println("La matriz tiene la siguiente estructura: \n");
        System.out.println("[" + matriz[0][0] + ", " + matriz[0][1] + ", " + matriz[0][2] + "]");
        System.out.println("[" + matriz[1][0] + ", " + matriz[1][1] + ", " + matriz[1][2] + "]");
        System.out.println("[" + matriz[2][0] + ", " + matriz[2][1] + ", " + matriz[2][2] + "]");
        System.out.println("----------------------------------------------------------------------------------------");    
    }
}
