public class Main {
    public static void main(String[] args){
        String nombreusuario = "Daniela";
        int edad = 29;
        boolean cuentaActiva = true;
        double saldo = 1500000.50;
        String ciudad = "Manizales";
        String tituloEsperado = "Swag Labs";
        String tituloActual = "Swag labs";

        System.out.println("Usuario:" + nombreusuario);
        System.out.println ("Edad:" + edad);
        System.out.println("Activa:" + cuentaActiva);
        System.out.println("Saldo:" + saldo);
        System.out.println("Ciudad" + ciudad);

        if (tituloActual.equals(tituloEsperado)) {
            System.out.println("Prueba Pasó");
        } else {
            System.out.println("Prueba Fallo. Esperado:" + tituloEsperado + "| Actual:" + tituloActual);
        }
    }

}
