public class contador_y_suma 
{
    public static void main(String[] args) throws Exception 
    {
        int suma = 0;

        for(int i=0; i < 10; i++)
        {
            System.out.println("Numero " + i);
 
            suma += i;
        }
        System.out.println("La suma total es: " + suma);
    }
}
