package AlgoritmosJava.FinallyThrow;

import java.util.Scanner;

public class FinallyThrow1 {
    public static void verificarIdade(short idade) {
        if (idade < 18) {
            throw new ArithmeticException("Idade não permitida");
        } else {
            System.out.println("Acesso garantido!");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scnIdade = new Scanner(System.in);
            System.out.println("Digite sua idade");
            short idadeUsuario = scnIdade.nextShort();
            verificarIdade(idadeUsuario);
            // conversão direta (Victor): inserir tipo ((short),(Integer),(String),etc...)
            // antes do valor a ser convertido
            scnIdade.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}
