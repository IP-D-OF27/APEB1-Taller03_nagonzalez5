public class Ejercicio08 {
    public static void main(String[] args) {
        double parte1 = (10*9) + 20 - (500.0/2.0) + Math.pow(3,2);
        boolean parentesis1 = parte1 >= 200;
        int parte2 = 50 - 50 + 51;
        boolean parentesis2 = 50 >= parte2;
        boolean resultado = parentesis1 || parentesis2;
        System.out.println("El resultado del ejercicio 08 es:" + resultado);
}
}