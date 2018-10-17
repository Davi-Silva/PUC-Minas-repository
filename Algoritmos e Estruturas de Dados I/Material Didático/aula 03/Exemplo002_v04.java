/*
  Exemplo002 - versao 0.4
  999999   - XXX
  2018-1
*/

// dependencias
import IO.*;

/**
   Modelo de classe.
*/
public class Exemplo002_v04
{
 // definir construtores/funcoes/procedimentos
    /**
       Funcao para ler inteiro positivo do teclado.
       @return valor inteiro positivo
       @param  mensagem a ser exibida antes da leitura
    */
    public static int lerPositivo ( String mensagem )
    {
     // definir dados locais
        int valor = 0;

        do
        {
         // ler valor do teclado
            valor = IO.readint ( mensagem );
         // testar se quantidade valida
            if ( valor <= 0 )
            {
             // mostrar erro
                IO.println ( "ERRO: Valor invalido ("+valor+")" );
            } // fim
        }
        while ( valor <= 0 );

     // retornar o resultado
        return ( valor );
    } // fim

    /**
       Funcao para ler inteiro do teclado maior que certa referencia.
       @return valor inteiro positivo
       @param  mensagem a ser exibida antes da leitura
       @param  referencia de valor a ser superada
    */
    public static int lerIntMaior ( String mensagem, int referencia )
    {
     // definir dados locais
        int valor = 0;

        do
        {
         // ler valor do teclado
            valor = IO.readint ( mensagem );
         // testar se quantidade valida
            if ( valor <= referencia )
            {
             // mostrar erro
                IO.println ( "ERRO: Valor menor ou igual a ("+referencia+")." );
            } // fim
        }
        while (valor <= referencia );

     // retornar o resultado
        return ( valor );
    } // fim

    /**
       Funcao para determinar valores pertencentes a certo intervalo.
       @return valores no intervalo; ou "", caso contrario
       @param  quantidade de dados
       @param  inferior - limite do intervalo
       @param  superior - limite do intervalo
    */
    public static String acharValoresNoIntervalo
         ( int quantidade, int inferior, int superior )
    {
     // definir dados locais
        String  resposta   =  "" ;
        int     valor      =   0 ;
        int     controle   =   0 ; // para usar na repeticao

     // repetir para essa quantidade
        for ( controle=1;
              controle<=quantidade;
              controle=controle+1 )
        {
         // ler valor do teclado
            valor = IO.readint ( "Qual valor? " );
         // testar se dentro do intervalo
            if ( inferior <= valor && valor <= superior )
            {
             // mostrar o valor
                resposta = resposta + " " + valor;
            }
        } // fim for

        // retornar o resultado
           return ( resposta );
   } // fim

 /**
    Acao principal.
 */
 public static void main ( String [ ] args )
 {
  // definir dados/resultados
     int     quantidade =   0 ;
     int     inferior   =   0 ; // limite inferior do intervalo
     int     superior   =   0 ; // limite superior do intervalo
     String  resposta   =  "" ;

     int     tamanho    =   0 ;
     int     posicao    =   0 ;

     int     contador   =   0 ;

  // identificar
     IO.println ( "Exemplo002 - versao 0.4 - 2018" );
     IO.println ( "999999 - XXX" );
     IO.println ( "Identificar valores dentro de um intervalo" );
     IO.println ( );

  // ler a quantidade do teclado
     quantidade = lerPositivo ( "Quantos valores? " );
  // ler limite inferior do intervalo
     inferior = IO.readint  ( "Qual o limite inferior? " );
  // ler limite superior do intervalo
     superior = lerIntMaior ( "Qual o limite superior? ", inferior );
  // mostrar a resposta
     resposta = acharValoresNoIntervalo ( quantidade, inferior, superior );
     IO.println ( "resposta = "+resposta );
  // testar a existencia de valores na resposta
     tamanho = resposta.length( );
     if ( tamanho == 0 )
     {
        IO.println ( "resposta = "+0+" // vazio " );
     }
     else
     {
        IO.println ( "tamanho = "+tamanho );
        for ( posicao = 0; posicao < tamanho; posicao = posicao + 1 )
        {
            if ( resposta.charAt(posicao) == ' ' )
            {
              IO.println ( "posicao = "+posicao
                         + " -> |"+resposta.charAt(posicao)+"|" );
              contador = contador + 1;
            } // fim if
        } // fim for
        IO.println ( "resposta = "+contador+" valores" );
     } // fim if

  // encerrar
     IO.pause   ( "\nApertar ENTER para terminar." );
 } // fim
} // fim

/*
  Anotacoes
  quantidade inteiro valor_inicial=0
  inferior   inteiro lido
  superior   inteiro lido
  valor      inteiro lido

  A fazer:
  a.) testar se a quantidade e' positiva

  Testes
  a.) quantidade = 6
      valores = { -10, 10, 15, 20, 35, 50 }
      intervalo = [ 15:35 ]
      resultado = { 15, 20, 35 }
  b.) quantidade = 6
      valores = { -10, 10, 15, 20, 35, 50 }
      intervalo = [ 35:15 ]
      resultado = { }
  b.) quantidade = -6
      valores = { 10, -10, 20, 50, 15, 35 }
      intervalo = [ 15:35 ]
      resultado = { }
  c.) quantidade = 0
      valores = { -10, 10, 15, 20, 35, 50 }
      intervalo = [ 15:35 ]
      resultado = { }
*/