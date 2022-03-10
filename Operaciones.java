package Act7;

import java.util.Scanner;

public class Operaciones {

    Scanner out = new Scanner(System.in);
    int Numm = 0;
    int numero, fibo1, fibo2, i;


    public void entrada() {
        System.out.println("Introducir 'n' Cantidad de numeros Primos/Fibonacci que quiere ver: ");
        Numm = out.nextInt();
        System.out.println("Números Primos");
    }

    public void primos() {
        int[] primos = new int[Numm];
        primos[0] = 2;
        int vacios = primos.length - 1;
        boolean a;
        double j = 2, k;
        while (vacios != 0) {
            a = true;
            k = 2;
            if (j % k != 0) {// podra ser primo
                k++;
                while (a && (k <= Math.sqrt(j))) {
                    if (j % k == 0) {
                        a = false;//ya no es primo
                    } else {
                        k++;
                    }
                }
                if (a) { //si no cambio es primo se agrega
                    primos[primos.length - vacios] = (int) j;
                }
            }
            j++;
            vacios = 0;
            for (int i = 0; i < primos.length; i++) {
                if (primos[i] == 0) {
                    vacios++;
                }
            }
        }
        /*imprimir el resultado*/
        for (int i = 0; i < primos.length; i++) {
           // System.out.println("Números Primos: \n");
            System.out.printf("%d ", primos[i]);
        }
    }

    public void fibonacci() {
        int[] vecfibbo;
        String fibbonacci = "";
        int esp;

        vecfibbo = new int[Numm];
        esp = vecfibbo.length;
       // System.out.println("\"El vector posee" + esp + " espacios");
        vecfibbo[0] = 0;
        vecfibbo[1] = 1;
        for (int i = 2; i <= esp - 1; i++) {
            vecfibbo[i] = vecfibbo[i - 1] + vecfibbo[i - 2];
            fibbonacci = fibbonacci + " " + vecfibbo[i];
        }
        System.out.println("\nSucessión de Fibonacci:\n" + vecfibbo[0] + " " + vecfibbo[1] + " " + fibbonacci);

    }
    }








