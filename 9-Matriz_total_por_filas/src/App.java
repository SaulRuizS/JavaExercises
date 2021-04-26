import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        int [][] matriz = new int[4][4];
        int suma = 0;

        for (int i = 0; i < 4; i++)
        {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("\nA continuacion debera ingresar valores para la fila "+ i +" de la matriz bidimensional\n");
            for(int j = 0; j < 4; j++)
            {
                System.out.print("Ingrese el valor para matriz["+ i +"]["+ j +"]: ");
                matriz[i][j] = scanner.nextInt();
                suma = suma + matriz[i][j];
            }
            System.out.println("\nLos valores de la fila "+ i + " son: [" + matriz[i][0] + ", " + matriz[i][1] + ", " + matriz[i][2] + ", " + matriz[i][3] + "]");
            System.out.print("\nLa suma de los valores de esta fila es: ");
            System.out.println(suma);
            suma = 0;
        }

        System.out.println("\n----------------------------------------------------------------------------------------");
        System.out.println("La matriz tiene la siguiente estructura: \n");
        System.out.println("[" + matriz[0][0] + ", " + matriz[0][1] + ", " + matriz[0][2] + ", " + matriz[0][3] + "]");
        System.out.println("[" + matriz[1][0] + ", " + matriz[1][1] + ", " + matriz[1][2] + ", " + matriz[1][3] + "]");
        System.out.println("[" + matriz[2][0] + ", " + matriz[2][1] + ", " + matriz[2][2] + ", " + matriz[2][3] + "]");
        System.out.println("[" + matriz[3][0] + ", " + matriz[3][1] + ", " + matriz[3][2] + ", " + matriz[3][3] + "]");
        System.out.println("----------------------------------------------------------------------------------------"); 

    }
}
