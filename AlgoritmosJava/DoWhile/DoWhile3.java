package AlgoritmosJava.DoWhile;

public class DoWhile3 {
    public static void main(String[] args) {
        String[] frutas = {"Abacaxi","Laranja","Pera","Uva","Melão"};
        int frutasVerificadas = 0;

        while (frutasVerificadas < frutas.length) {
            System.out.println(frutas[frutasVerificadas]);
            frutasVerificadas++;
        }
    }
}
    
