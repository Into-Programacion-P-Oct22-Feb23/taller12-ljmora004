package ejercicios;

public class Problema03 {

    public static void main(String[] args) {

        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
        
        for (int i = 0; i < bases.length; i++) {
            resultado[i] = obtenerPotencia(bases[i], potencias[i]);
            System.out.printf("%.0f\t", resultado[i]);
        }
        System.out.println();
    }
    
    public static double obtenerPotencia(double base, double exponente) {
        
        if (exponente == 1) {
            return base;
        } else{
            
            return base * obtenerPotencia(base, exponente - 1);
        }
    }

}
