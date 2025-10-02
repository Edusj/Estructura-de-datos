package mx.edu.tesoem.isc.informacion.datos;

public class datos {
    private String nombre;
    private int edad;
    private String correo;

    public datos (String nombre, int edad, String correo){

        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

     public datos(){}
      
     public String getNomre(){
        return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public int getEdad() {
         return edad;
     }

     public void setCorreo(String correo) {
         this.correo = correo;
     }

     public String getCorreo() {
         return correo;
     }

     public void setEdad(int edad) {
         this.edad = edad;
     }
}
