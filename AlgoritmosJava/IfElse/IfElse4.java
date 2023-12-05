package AlgoritmosJava.IfElse;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        int anoAtual = 2023;
        Scanner scnAnoNascimento = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento:");
        int anoNascimento = scnAnoNascimento.nextInt();
        int idade = anoAtual - anoNascimento;

        if(idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        scnAnoNascimento.close();
    }
}
    
