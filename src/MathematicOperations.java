public class MathematicOperations {
    public static void main(String[] args) {

        double x = 2.1;
        double y = 3;

        // ceil nos devuelve un número entero hacia arriba
        System.out.println(Math.ceil(x));

        // floor nos devuelve un número entero hacia abajo
        System.out.println(Math.floor(x));

        // Devuelve un número elevado a otro número
        System.out.println(Math.pow(x,y));

        // El dato mas grande entre los 2
        System.out.println(Math.max(x,y));

        // Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        // Area de un circulo
        // pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        // Area de una esfera
        // 4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Volumen de una esfera
        // (4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
