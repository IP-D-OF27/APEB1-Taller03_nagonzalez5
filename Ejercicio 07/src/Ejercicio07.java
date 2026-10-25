public class Ejercicio07 {
    public static void main(String[] args) {
        double fraccion1 = (Math.sqrt(81) + 9)/3;
        double fraccion2 = 100/25;
        double raiz = Math.sqrt(100);
        boolean condicion1 = fraccion1 == 9;
        boolean condicion2 = 10 > 1;
        boolean condicion3 = fraccion2 >= raiz;
        boolean parteB = condicion2 && condicion3;
        boolean resultado = condicion1 || parteB;
        System.out.println("El resultado del ejercicio 07:" + resultado);
        
}}
