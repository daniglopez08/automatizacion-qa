package org.example;
import java.util.ArrayList;
import  java.util.List;

public class Arreglos {
    public static void main(String[] args) {

        String[] usuarios = {"standard_user", "locked_out_user", "problem_user"};
        String usuarioBuscado = "problem_user";
        boolean encontrado = false;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usuarioBuscado)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Usuario encontrado");
        } else {
            System.out.println("Usuario no encontrado");
        }
    }
}

/** String[] usuarios = { "standard_user", "locked_out_user", "problem_user"};

 for (String usuario : usuarios){
 System.out.println(usuario);
 }*/

/** String[] usuarios = {"standard_user", "locked_out_user", "problem_user"};
 String usuarioBuscado = "problem_user";
 boolean encontrado = false;

 for (int i = 0; i < usuarios.length; i++) {
 if (usuarios[i].equals(usuarioBuscado)) {
 encontrado = true;
 }
 }
 if (encontrado) {
 System.out.println("Usuario encontrado");
 } else {
 System.out.println("Usuario no encontrado");
 }*/

/** List<String> carrito = new ArrayList<>();
 carrito.add("Mochila");
 carrito.add("Camiseta");
 carrito.add("Chaqueta");

 System.out.println("Itms en el carrito: " + carrito.size());

 for (String item : carrito){
 System.out.println(item);
 }
 if (carrito.contains("Camiseta")){
 System.out.println("Item encontrado");
 } else {
 System.out.println("itm no encontrado");
 }*/