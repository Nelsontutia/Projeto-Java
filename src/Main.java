
import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String resposta;

        // Estruturas de Repeticao
        // WHILE - ENQUANTO

        // Enquanto o nome for diferente de Vini

        // Eu pergunto novamente

        String nome = "Fulano";

        // WHILE () {}
        // Enquanto nome for diferente de Vini
        // NUNCA use == ou != para textos
//        while (!nome.equals("Vini")) {
//            System.out.println("Incorreto!");
//            System.out.println("Insira o nome:");
//            nome = sc.nextLine();
//        }
//        // Exercicio Senha
//        // NAO CRIAR UM LACO INFINITO
//        System.out.println("DIGITE SUA SENHA");
//        String Senha = sc.nextLine();
//
//        // Exercicio Senha
//        while (!Senha.equals("123")) {
//            System.out.println("Senha incorreta");
//            Senha =sc.nextLine() ;

//        }

        // ENQUANTO
        // DO/WHILE - FACA ENQUANTO
        int senha;
        do {
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();
        } while(senha != 123);
        String digitado;
 do {
     System.out.println("Executando um processo");
     System.out.println("O que deseja?");
     digitado = sc.nextLine();
     // Enquanto o que ddigitou for s

     resposta = sc.nextLine();
 } while(digitado.equals("S") || digitado.equals("S"));



    do {
        // o que repete
        System.out.println("Executando o processo...");
        digitado = sc.nextLine();
        // enquanto o que digitou  for s

        } while(digitado.equals("S"));




}}




