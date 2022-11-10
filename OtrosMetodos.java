package Ejercicio4;

public class OtrosMetodos {

    public static int generarNumeroAleatorio(int numMaximo, int numMinimo){
        int n = (int) (Math.random() * (numMaximo + 1 - numMinimo)) + numMinimo;
        return n;
    }
}
