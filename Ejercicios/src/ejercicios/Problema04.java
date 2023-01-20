package ejercicios;

import org.apache.commons.lang3.math.NumberUtils; 

public class Problema04 {

    public static void main(String[] args) {
        
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int[] dataFinal = new int[6];
        for (int i = 0; i < dataInicial.length; i++) {
            dataFinal[i] = NumberUtils.toInt(dataInicial[i]);
            System.out.printf("%d\t", dataFinal[i]);
        }
        System.out.println();
    }
    
}
