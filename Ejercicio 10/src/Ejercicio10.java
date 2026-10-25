public class Ejercicio10 {
    public static void main(String[] args) {
        boolean parte1 = Math.sqrt(25) * 10 >= 100;
        boolean parte2 = true;
        boolean parte3 = false;
        boolean parte4 = (10/5) >= 2;
        boolean parteIzquierda = parte1 && parte2;
        boolean resultado = parteIzquierda || parte3 || parte4;
        System.out.println("El resultado del ejercicio 10:" + resultado);
    }
}
