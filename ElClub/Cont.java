
import java.util.Scanner;

public class Cont
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int con,in;
        con=1234;
        for(int i=1;i<=3;i++){
            System.out.println("ingrese la contraseña \n numero de intentos restantes: "+(4-i));
            in=sc.nextInt();
            if(in==con){
                System.out.println("La contraseña es correcta");
                break;
            }
            else{
                System.out.println("contraseña incorrecta");
            }
        }
    }
}
