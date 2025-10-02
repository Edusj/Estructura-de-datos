package mx.edu.tesoem.isc.principal;

import mx.edu.tesoem.isc.informacion.datos.datos;

public class principal {
    public static void main(String[] args) {
        datos objdatos = new datos("cris", 20, "cris@gmail.com");
        System.out.println("nombre: " + objdatos.getNomre());
        System.out.println("edad: " + objdatos.getEdad());
        System.out.println("correo: " + objdatos.getCorreo());


        datos objdatos2 = new datos();
        objdatos2.setNombre("ñaña");
        objdatos2.setEdad(30);
        objdatos2.setCorreo("ñaña@gmail.com");

        System.out.println("nombre: " + objdatos2.getNomre());
        System.out.println("edad: " + objdatos2.getEdad());
        System.out.println("correo: " + objdatos2.getCorreo());
    }
}
