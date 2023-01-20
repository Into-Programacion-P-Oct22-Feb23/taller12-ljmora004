package ejercicios;


public class Problema00 {

    public static void main(String[] args) {
        
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
        
        for (int fila = 0; fila < datos.length; fila++) {
            for (int columna = 0; columna < datos[fila].length; columna++) {
                resultado[fila][columna] = factorial(datos[fila][columna]);
            } 
        }
        
        for (int fila = 0; fila < datos.length; fila++) {
            for (int columna = 0; columna < datos[fila].length; columna++) {
                System.out.printf("%.1f\n", resultado[fila][columna]);
            }
        }
    }
    
    public static double factorial(double numero) { 
        if (numero <= 1) {
            
            return 1; 
        } else { 
            return numero * factorial(numero - 1);
        }
    }
    
}
