
import java.util.Scanner;
public class Numprimo
{
    private Numprimo(){
    
    }
    
    public static void main(String[] argsa){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Numprimo.primo(n));
    }
    
    public static String primo(int numero){
        int x=2;
        boolean prim=true;
        while(x<numero){
            if(numero%x==0){
                prim=false;
                break;
            }
            x++;
        }
        
        if(prim) return "es primo";
        else return "no es primo";
    }
}