

import java.util.Scanner;

public class FormulaGeneral
{

    public static double FGeneral(double a, double b, double c){
        double disc=(b*b)+(4*a*c);
        double num=(-1*b)+Math.sqrt(disc);
        double den=(2*a);
        double resul=num/den;
         return resul;
        }

    public static double Fgen(double a, double b, double c){
            double disc=(b*b)-(4*a*c);
	   double num=(-1*b)+Math.sqrt(disc);
	   double den=(2*a);
	   double resul=num/den;
	   return resul;
        }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b,c,x1,x2;
        System.out.println("Ingrese el valor de a:");
        a=sc.nextDouble();
        System.out.println("Ingrese el valor de b:");
        b=sc.nextDouble();
        System.out.println("Ingrese el valor de c:");
        c=sc.nextDouble();
        x1=FormulaGeneral.FGeneral(a,b,c);
        System.out.println("x1="+x1);
        x2=FormulaGeneral.Fgen(a,b,c);
        System.out.println("x2="+x2);
        

    }

}
