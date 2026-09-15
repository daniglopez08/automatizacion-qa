package org.example;
//Pruebas con ciclos//
public class prueba {
    public static void main(String[] args) {
        /**int intento = 1;

        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        for (int n=1; n <= 10; n++){
            System.out.println("Ejecutando escenario " + n + " de 10");
        }

        while (intento < 3){
            System.out.println("Intento numero: " + intento);
            intento++;
        }*/
        String[] productos = {"Mochila", "Camiseta", "Chaqueta"};
        String productoBuscado = "Camisetas";
        boolean encontrado = false;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equals(productoBuscado)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("PRUEBA PASO: el producto esta en la lista");
        } else {
            System.out.println("PRUEBA FALLO: no se encontro " + productoBuscado);
        }
    }
}




