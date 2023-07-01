import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int numero;
       String agencia;
       String nomeCliente;
       double saldo;

       System.out.println(" -------------Conta Bancaria----------------");
       System.out.println();
       System.out.println("Por Favor, digite o numero da Conta: (1234)");
       numero =sc.nextInt();


       System.out.println("Agora digite o numero da Agência: (123-4)");
       agencia = sc.next();

       System.out.println("Informe seu Nome: " );
       nomeCliente = sc.next();
       sc.nextLine();

       System.out.println("Informe seu Saldo Atual: " );
       saldo = sc.nextDouble();

       System.out.println();
       System.out.printf("Olá %s, sua conta foi criada com sucesso"
            + " sua agencia é %s " + "sua conta é %d e seu saldo %.2f já está disponível " + "para saque", nomeCliente, agencia, numero, saldo
       );
        sc.close();

    }
}
