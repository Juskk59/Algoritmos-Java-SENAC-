package AlgoritmosJava.IfElse;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        String vUserName = "teste";
        String vPass = "teste";
        Scanner inputUser = new Scanner(System.in);
        Scanner inputPass = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = inputUser.nextLine();

        System.out.println("Enter password");
        String pass = inputPass.nextLine();

        if (vUserName.equals(userName) == true && pass.equals(vPass) == true) {
            System.out.println("Bem vindo ao sistema");
        } else {
            System.out.println("Usuário ou senha incorretos");
        }
        inputPass.close();
        inputUser.close();
        System.out.println("Usuário válido: " + vUserName);
        System.out.println("Usuário digitado: " + userName);
        System.out.println("Senha válida: " + vPass);
        System.out.println("Senha digitada: " + pass);
    }
}
    
