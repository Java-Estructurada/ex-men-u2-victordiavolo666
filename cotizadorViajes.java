import java.util.Scanner;
public class cotizadorViajes{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int adu=0, kid=0, dias=0;
        double cVuelo=0, cHos=0, desKid=0;
        System.out.print("Ingrese el número de adultos que irán al viaje:");
        adu = sc.nextInt();
        System.out.print("Ingrese el número de niños que irán al viaje:");
        kid= sc.nextInt();
        System.out.print("Ingrese la cantidad de días que van a hospedarse:");
        dias=sc.nextInt();
        System.out.print("Ingrese el precio del vuelo:");
        cVuelo=sc.nextDouble();
        System.out.print("Ingrese el precio del hotel (por noche):");
        cHos=sc.nextDouble();
        desKid = cVuelo * 0.50; //el descuento del 50% para niños en el vuelo 

 
    }
}
