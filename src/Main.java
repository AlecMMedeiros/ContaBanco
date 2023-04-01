import java.util.Scanner;

public class Main {
  public static void main ( String[] args ) {
    Scanner scanner = new Scanner ( System.in );
    String contaNome;

    System.out.println ("Olá! Vamos começar o seu cadastro!" );
    System.out.println ("Por favor, digite o seu nome e tecle 'ENTER': " );
    String nome = scanner.nextLine ();
    System.out.println ("-----------------------------------------------------------" );
    System.out.println ("Por favor, digite o seu sobrenome e tecle 'ENTER': " );
    String sobrenome = scanner.nextLine ();
    System.out.println ("-----------------------------------------------------------" );
    System.out.println ("Por favor, " +nome+ " " +sobrenome+ ", digite o número da AGÊNCIA informado no e-mail de pré-cadastro e tecle 'ENTER': " );
    String agencia = scanner.nextLine ();
    System.out.println ("Por favor, " +nome+ " " +sobrenome+ ", digite o número da CONTA informado no e-mail de pré-cadastro e tecle 'ENTER': " );
    System.out.println ("---DIGITE APENAS OS NÚMEROS---" ); //Poderia se colocar uma validação de tipo em um While.
    Integer conta = scanner.nextInt ();
    System.out.println ("-----------------------------------------------------------" );
    System.out.println ("Por fim, insira a o valor referente ao depósito inicial e tecle 'ENTER': " );
    Double saldo = scanner.nextDouble ();
    System.out.println ("Por favor, aguarde enquanto processamos a abertura da sua conta." );
    System.out.println ("-----------------------------------------------------------" );

    ContaTerminal Novaconta =  new ContaTerminal (conta, agencia, nome + " " + sobrenome, saldo   );

    System.out.println ( Novaconta );



  }
}