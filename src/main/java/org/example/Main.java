package org.example;

public class Main {
    public static void main(String[] args) {

        String contrasena = "123abcdddddd";
        String usuarioIngresado = "Standar";
        String usuarioEsperado = "Standars";
        double saldo = 1500000.50;
        double valorCompra = 2000000;


        if (contrasena.length() >= 8) {
            System.out.println("Contraseña Correcta");
        } else {
            System.out.println("Contraseña demasiado corta");
        }

        if (usuarioEsperado.equals(usuarioIngresado)) {
            System.out.println("Login Correcto");
        } else {
            System.out.println("login incorecto");


            if (valorCompra <= saldo) {
                System.out.println("Compra exitosa");
            } else {
                double falta = valorCompra - saldo;
                System.out.println("Te falta: " + falta);
            }
        }
    }

}








        /**

         */


