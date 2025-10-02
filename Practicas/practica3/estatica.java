package practica3;

public class estatica {

    public static int[] agregar (int[] num,int indice){
        System.out.println("Ingresa el valor entero ");
        num[indice]=Integer.parseInt(System.console().readLine());
        return num;
    }
    public static void main(String[] args) {
        int[] numeros=new int[10];
        int indice=0;
        boolean bandera=true;

        System.out.println("simulando memoria estatica");
        String opcion="";
        do{
            System.out.println("1.- Agregar numero");
            System.out.println("2.- Mostrar numero");
            System.out.println("3.- Eliminar numero");
            System.out.println("4.- Salir");
            opcion=System.console().readLine();
            switch(opcion){
                case "1": if (indice > 9){
                        System.out.println("Memoria llena");
                    }else{
                        numeros=agregar(numeros,indice);
                        indice++;
                    }
                    break;
                case "2": for (int i=0;i<indice;i++){
                        System.out.println(numeros[i]);
                    }
                    break;
                case "3": if (indice==0){
                        System.out.println("Memoria vacia");

                    }else{
                        indice--;
                        System.out.println("Eliminado: "+numeros[indice]);
                    }
                    break;
                case "4": bandera=false;
                    break;

            }
        }while(bandera);
    }

}