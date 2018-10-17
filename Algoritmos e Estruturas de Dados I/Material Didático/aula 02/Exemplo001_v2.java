/*
  Program : Exemplo001 - Testar valores dentro de um intervalo
  @author : 999999 - XXX
  @version: 0.2
  @data   : 28/02/2018
*/

import IO.*;

/**
   Classe.
 */
public class Exemplo001_v2
{

 /**
    Funcao para ler inteiro e positivo.
  */
  public static int lerPositivo ( String mensagem )
  {
    int resultado = 0;

    do
    {
      resultado = IO.readint ( mensagem );
      if ( resultado <= 0 )
      {
        IO.println ( "ERRO: Valor nao e' maior que zero" );
      }
    }
    while ( resultado <= 0 );

    return ( resultado );
  } // fim

 /**
    Funcao para ler inteiro condicionado a outro valor.
  */
  public static int lerCondicionado ( String mensagem, int condicionante )
  {
    int resultado = 0;

    do
    {
      resultado = IO.readint ( mensagem );
      if ( resultado <= condicionante )
      {
        IO.println ( "ERRO: Valor nao e' maior que "+condicionante );
      }
    }
    while ( resultado <= condicionante );

    return ( resultado );
  } // fim

 /**
    Funcao para encontrar valores dentro de um intervalo.
  */
  public static String noIntervalo ( int quantidade, int inferior, int superior )
  {
      String resposta = "";
      int d;
      int dado;

   // repetir para ler essa quantidade de dados
      for ( d=1; d<=quantidade; d=d+1 )
      {
       // ler dado do teclado
          dado = IO.readint ( "Qual o valor ("+d+")? " );
       // testar se valor pertence ao intervalo
          if ( inferior <= dado && dado <= superior )
          {
           // mostrar o controle da repeticao
              resposta = resposta + " " + dado;
          } // fim
      } // fim

      return ( resposta );
   }

 /**
    Acao principal.
  */
  public static void main ( String [ ] args )
  {
   // definir dados
      int quantidade = 0;
      int d        = 0;
      int dado     = 0;
      int inferior = 0;
      int superior = 0;
      String resposta = "";

   // identificar
      IO.println ( "Exemplo001 - versao: 0.2" );
      IO.println ( "999999   - XXX" );
      IO.println ( );

   // definir acoes
   // ler a quantidade do teclado
      quantidade = lerPositivo ( "Qual a quantidade de dados ? " );

   // ler o limite inferior
      inferior   = lerPositivo ( "Qual o limite inferior? " );

   // ler o limite superior, garantindo que seja maior que o inferior
      superior   = lerCondicionado ( "Qual o limite superior? ", inferior );

   // repetir para ler essa quantidade de dados
      resposta = noIntervalo ( quantidade, inferior, superior );
      IO.println ( "resposta = "+resposta );

   // mostrar a quantidade de dados
   //    IO.println ( "quantidade de dados = "+quantidade );

   // encerrar
      IO.pause   ( "\n\nApertar ENTER para terminar.\n" );
  } // fim
} // fim



/*
  Anotacoes

  Testes
  quantidade  inteiro  valor inicial = 0
  inferior    inteiro  lido
  superior    inteiro  lido

  Testar
  quantidade = 6
  inferior   = 15
  superior   = 35

  a.) { 10, -10, 20, 50, 15, 35 }

      [15:35] -> { 15, 20, 35 }

*/