package br.com.conta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in);

       String Agencia; String NomeCliente;
       int Num;
       Double Saldo;

        System.out.println("Digite seu nome: ");
        NomeCliente = entrada.nextLine();

        System.out.println("Digite o numero da agencia: ");
        Agencia = entrada.nextLine();

       System.out.println("Digite o numero da conta ");
       Num = entrada.nextInt();

       System.out.println("Digite o valor do deposito: ");
       Saldo = entrada.nextDouble();

       System.out.println("Valor deposito com sucesso: " + Saldo);

       System.out.println("Ola " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + Agencia + ", conta " + Num + " e seu saldo " + Saldo + " ja esta disponivel para saque.");

    }
}
