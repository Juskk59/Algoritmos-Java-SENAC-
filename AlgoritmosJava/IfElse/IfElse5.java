package AlgoritmosJava.IfElse;

import java.util.Scanner;

public class IfElse5 {
    public static void main(String[] args) {
        int alturaMaxima = 20;
        Scanner scnAltura = new Scanner(System.in);
        System.out.println("Digite a altura do pacote:");
        int alturaPacote = scnAltura.nextInt();

        if(alturaPacote > alturaMaxima) {
            System.out.println("Altura excedente.");
        } else {
            System.out.println("Altura permitida.");
        }
        scnAltura.close();
    }
}
    
