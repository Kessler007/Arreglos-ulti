import java.util.Scanner;

public class Practica3 {

    // Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por
    // un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las
    // notas, la nota media,
    // la nota más alta que ha
    // sacado y la menor.

    int[] notas;
    Scanner scanner;

    public Practica3() {
        notas = new int[5];
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingresa nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        int suma = 0;
        int promedio;
        int mayor, menor;
        mayor = menor = notas[0];

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }

            suma = suma + notas[i];

        }

        promedio = suma / notas.length;
        System.out.println("Promedio: " + promedio);
        System.out.println("El nota maxima es: " + mayor);
        System.out.println("El nota minima es: " + menor);

    }
}
