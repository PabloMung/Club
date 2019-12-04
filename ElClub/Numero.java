
/**
 * Dado un numero "n" determine si es positivo, negativo o 0
 */
import java.util.Scanner;
public class Numero
{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un numero");
        double n=sc.nextDouble();
        if(n>0){
            System.out.println("Es Positivo");
        }else if(n<0){
                System.out.println("Es Negativo");
            }else if(n==0){
                System.out.println("Es 0");
            }
    }
}