package exercise2;

import java.util.Scanner;

public class cochetest {
    public static void main(String[] args) {

        coche vehiculo = new coche();
        vehiculo.automovil("oroch", "renault", 2009, 200000000);
        Scanner scanner =new Scanner(System.in);

        System.out.println("ingrese el año actual");

        int año_actual= scanner.nextInt();

        float valor_inicial=vehiculo.getPrecio();

        int años_pasados= año_actual-vehiculo.getAño();

        double valor_actual=valor_inicial*(1-(0.1*años_pasados));

        int convert=(int)valor_actual;

        System.out.println("la marca de su vehiculo es: " + vehiculo.getMarca());
        System.out.println("el modelo de su vehiculo es: " + vehiculo.getModelo());
        System.out.println("el año de su vehiculo es: " + vehiculo.getAño());
        System.out.println("el precio es: " + vehiculo.getPrecio());
        if (convert>=1){
            System.out.println("la depreciación anual del vehiculo es del 10% anual, entonces el valor actual de su vehiculo es de: " + convert);
        } else {
            System.out.println("la depreciacion anual del vehiculo es del 10% anual, entonces el valor actual de su vehiculo es de: 0");
        }
    }
}
