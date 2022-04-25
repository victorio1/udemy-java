public class HolaMundo {

    public static void main(String[] args){
        
        String saludar = "Hola mundo";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 10;
        boolean valor = true;
        int numero2 = 15;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String nombre;

        nombre = "Andres";

        if(numero > 10){
            nombre = "Juan";
        }

        int edadPersona = 5;
    }

}
