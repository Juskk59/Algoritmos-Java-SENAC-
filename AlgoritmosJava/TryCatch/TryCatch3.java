package AlgoritmosJava.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch3 {
    public static void main(String[] args) {
        try {
            Scanner scnIdade = new Scanner(System.in);
            System.out.println("Digite sua idade");
            short idade = scnIdade.nextShort();
            
            scnIdade.close();
            System.out.println("Você nasceu no ano de: " + (2023 - idade));
        } catch (InputMismatchException e) {
            System.out.println("Ops! Ocorreu o erro: " + e);
        }
        
    }
}

