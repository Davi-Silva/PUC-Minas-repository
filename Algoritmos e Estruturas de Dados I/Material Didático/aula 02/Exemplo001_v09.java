/*
  Exemplo001 - versao 0.9
  999999   - XXX
  2018-1
*/

// dependencias
import IO.*;

/**
   Modelo de classe.
*/
public class Exemplo001_v09
{
 // definir construtores/funcoes/procedimentos
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
        while (valor <= 0);

     // retornar o resultado
        return ( valor );
    } // fim

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
         // mostrar o controle
            IO.println ( "controle = "+controle );
         // ler valor do teclado
            valor = IO.readint ( "Qual valor? " );
         // testar se dentro do intervalo
            if ( inferior <= valor && valor <= superior )
            {
             // mostrar o valor
             //   IO.println ( "valor = "+valor+" dentro do intervalo" );
                resposta = resposta + " " + valor;
            }
            else
            {
             // fora do intervalo
             //   IO.println ( "valor fora do intervalo " );
            } // fim if
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

  // identificar
     IO.println ( "Exemplo001 - versao 0.9 - 2018" );
     IO.println ( "999999 - XXX" );
     IO.println ( "Identificar valores dentro de um intervalo" );
     IO.println ( );

  // ler a quantidade do teclado
     quantidade = lerPositivo ( "Quantos valores? " );

      // mostrar a quantidade de dados
         IO.println ( "quantidade= "+quantidade );

      // ler limite inferior do intervalo
         inferior = IO.readint ( "Qual o limite inferior? " );

      // ler limite superior do intervalo
         superior = IO.readint ( "Qual o limite superior? " );

      // testar se os limites sao validos
         if ( inferior >= superior )
         {
          // mostrar erro
             IO.println ( "ERRO: Limites invalidos." );
         }
         else
         {
          // achar os valores no intervalo
             resposta = acharValoresNoIntervalo ( quantidade, inferior, superior );
          // mostrar a resposta
             IO.println ( "resposta= "+resposta );
         } // fim

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