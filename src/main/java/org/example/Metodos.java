package org.example;

public class Metodos {
    public static String validarLogin(String usuarioIngresado, String usuarioEsperado) {
        if (usuarioEsperado.equals(usuarioIngresado)) {
            return "Usuario coincide";
        } else {
            return "Usuario no coincide";
        }
    }
    public static void main(String[] args) {
        System.out.println(validarLogin("standard_user", "standard_user"));
        System.out.println(validarLogin("standard_user", "problem_user"));
    }
}






/** public static void saludarUsuario (String nombre){
 System.out.println("Bienvenido " + nombre);
 }

 public static void  main (String[] args){
 saludarUsuario("daniela");
 saludarUsuario("camila");
 saludarUsuario("andres");
 }*/

/** public static boolean esMayorDeEdad(int edad) {
 return edad >= 18;
 }

 public static void main(String[] args) {
 if (esMayorDeEdad(15)) {
 System.out.println("Es mayor de edad");
 } else {
 System.out.println("Es menor de edad");
 }
 }*/