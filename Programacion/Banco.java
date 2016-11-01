
package ejerciciopromedio;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String titulo = "";
        String aux = "";
        double saldo = 0;
        double saldototal=0;
        double sumadep=0;
        double sumaret=0;
        int numero;
        int contador = 1;
        double deposito = 0;
        double retiro = 0;
        double promedio;
        double saldoinicial;
        int movimiento;
        int num;
        boolean a = true;

        System.out.println("Ingrese el nombre del propietario de la cuenta: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el saldo de su cuenta: ");
        saldo = entrada.nextDouble();
        saldoinicial = saldo;
        while (a == true) {
            System.out.println("Que desea realizar 1(Deposito) 2(Retiro) ");
            numero = entrada.nextInt();
            if (numero == 1) {
                System.out.println("Ingrese la cantidad a depositar: ");
                deposito = entrada.nextInt();
                saldo = saldo + deposito;
                titulo = String.format("%d\t\t%.2f\t\t\t%.2f\n", contador, deposito, saldo);

            }
            if (numero == 2) {
                System.out.println("Ingrese la cantidad a retirar: ");
                retiro = entrada.nextInt();
                saldo = saldo - retiro;
                titulo = String.format("%d\t\t\t%.2f\t\t%.2f\n", contador, retiro, saldo);

            }
            aux = aux + titulo;
            System.out.println("Desea realizar otro movimiento 1(si) 2(no):  ");
            movimiento = entrada.nextInt();
            deposito=deposito;
            retiro=retiro;
            sumadep=deposito;
            sumaret=retiro;
            saldototal=saldoinicial+sumadep-sumaret;
            if (movimiento == 1) {
                a = true;
                contador = contador + 1;

            } else {
                a = false;

            }

        }
        System.out.println("Movimiento" + "   " + "Deposito" + "  " + "Retiro" + "          " + "Saldo");
        System.out.println(aux);
        System.out.println("Total:             " + sumadep + "      " + sumaret + "          " + saldototal);

    }
}

 
