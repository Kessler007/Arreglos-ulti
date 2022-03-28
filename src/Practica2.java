import java.util.Scanner;

public class Practica2 {
    //Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el
    //teclado. Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la
    //pantalla.

    //definimos losvectores

        String[] original;
        String[] inverso;

        Scanner scanner;

        //Metodo constructor
        public  Practica2() {
            original = new String[5];
            inverso = new String[5];

            scanner=new Scanner(System.in);
        }

        //Metodo ejecutor
        public void ejecutar(){
            //Llevamos el vector original concadenas
            for (int i=0;i< original.length;i++){
                System.out.println("Original [ "+i+" ]:");
                String cadena = scanner.nextLine();

                original[i]=cadena;
            }
            int indiceOriginal = 0;
            int indiceInverso = 4;
            while (indiceOriginal < original.length){
                inverso[indiceInverso]=original[indiceOriginal];
                indiceOriginal++;
                indiceInverso--;
            }
            //Mostramos el contenido de inverso
            for (int i=0;i<inverso.length;i++){
                System.out.println("Inverso [ "+i+" ]" +inverso[i]);
            }
        }
}
