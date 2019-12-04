
/**en esta clase no ingrese asi que no estoy seguro de como funcionan
 * 
 * me parece que mi compa quiso hacer la inversion usando otro arreglo 
 * donde almacenaria los datos del primer arreglo pero al reves
 * 
 * y ya el que nos da el club(Adrian) uso un metodo ya existente para invertirlo
 * 
 * todo esto es solo de lo que eh entendido despues de haber leido ambos codigos.
*/

/**
 * Codigo de Adrain
 * 
 * public static void main(String [] args){
        InvertirArre arr=new InvertirArre();
        Scanner sc=new Scanner(System.in);
        System.out.println("T del arreglo");
        int t=sc.nextInt();
        String [] text=new String [t];
        System.out.println(t);
        for(int i=0;i<t;i++){
            System.out.println("poc:"+i);
            text[i]=sc.nextLine();}
            System.out.println("no invertido");
        for(int i=0;i<t;i++)
            System.out.println(text[i]);
        text=arr.invertir(text);
        System.out.println("invertido");
        for(int i=0;i<t;i++)
            System.out.println(text[i]);
    }*/

/*
 * codigo de un compa
 * import java.util.Scanner;
public class InvertirArre
{
    
    public String [] invertir(String arre []){
        int x=arre.length-1;
        for(int i=0;(i<arre.length&&i<x);i++){
            String aux=arre[i];
            arre[i]=arre[x];
            arre[x]=aux;
            x--;
        }
        return arre;
    }
}
*/