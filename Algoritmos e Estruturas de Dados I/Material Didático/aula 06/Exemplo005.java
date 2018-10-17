/*
  * ---------------------------------------------- Documentacao preliminar
  * Pontificia Universidade Catolica de Minas Gerais
  * Curso de Ciencia da Computacao
  * Algoritmos e Estruturas de Dados I
  *
  * Exemplos
  *
  * Objetivo:
  * Modelo de programa para a disciplina AED I
  *
  * Autor:   Matricula: 999999  Nome: xxx yyy zzz
  * Versao:  1.0                Data: 01/mm/20aa
  *
*/

// ---------------------------------------------- classes nativas
//                                                ou auxiliares

   import IO.*;

// ---------------------------------------------- definicao de classe

/**
  * Exemplo005 - Recursao
  */
   public class Exemplo005
   {
   // ---------------------------------------------- definicao de metodos

   /**
    * Metodo01 - Repetir acao iterativamente.
    */
      public static void metodo01 ( )
      {
       // definir dados
          int n;
          int x;

       // identificar
          IO.println ( );
          IO.println ( "Metodo01" );
          IO.println ( );

       // acoes
          n = IO.readint ( "Quantidade = " );
          for ( x=0; x<n; x=x+1 )
          {
              IO.println ( ""+x );
          } // fim
       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo01 ( )

   /**
    * Metodo para repetir acao,
    * recursivamente.
    * @param x - valor inicial
    * @param n - valor final
    * @param variacao - passo
    */
      public static void forUp ( int x, int n, int variacao )
      {
          if ( x < n )                           // teste
          {
             IO.println ( ""+x );                // acao
             forUp ( x+variacao, n, variacao );  // chamada recursiva
          } // fim
      } // fim

   /**
    * Metodo02.
    */
      public static void metodo02 ( )
      {
       // definir dados
          int n;
          int x;

       // identificar
          IO.println ( );
          IO.println ( "Metodo01" );
          IO.println ( );

       // acoes
          n = IO.readint ( "Quantidade = " );
          forUp ( 0, n, 1 );                      // primeira chamada

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo02 ( )

   /**
    * Metodo para somar (n) primeiros numeros naturais, 
    * recursivamente.
    * @return soma dos primeiros numeros naturais
    * @param  n - quantidade
    */
      public static int soma1 ( int n )
      {
          int soma = 0;

          if ( n > 0 )
          {
           // IO.println ( ""+n );
           //soma = soma1 ( n-1 ) + n;
             soma = n + soma1 ( n-1 );
          } // fim

          return ( soma );
      } // fim

   /**
    * Metodo03.
    */
      public static void metodo03 ( )
      {
       // definir dados
          int n;
          int x;

       // identificar
          IO.println ( );
          IO.println ( "Metodo03" );
          IO.println ( );

       // acoes
          n = IO.readint ( "Quantidade = " );

          x = soma1 ( n );

          IO.println ( "soma ("+n+") = "+x );

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo03 ( )

   /**
    * Metodo para somar (n) primeiros numeros impares, 
    * recursivamente.
    * @return soma dos primeiros numeros impares
    * @param  n - quantidade
    */
      public static int somaImpar ( int n )
      {
          int soma = 0;

          if ( n > 0 )
          {
             IO.println ( ""+n+" "+(2*n-1) );
             soma = (2*n-1) + somaImpar ( n-1 );  // cauda
          } // fim

          return ( soma );
      } // fim

   /**
    * Metodo04.
    */
      public static void metodo04 ( )
      {
       // definir dados
          int n;
          int x;

       // identificar
          IO.println ( );
          IO.println ( "Metodo03" );
          IO.println ( );

       // acoes
          n = IO.readint ( "Quantidade = " );

          x = somaImpar ( n );

          IO.println ( "somaImpar ("+n+") = "+x );

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo04 ( )

   /**
    * Metodo para calcular o produto dos (n) primeiros numeros naturais,
    * recursivamente.
    * @return soma dos primeiros numeros impares
    * @param  n - quantidade
    */
      public static int produtoN ( int n )
      {
          int produto = 1;
          if ( n > 0 )
          {
             // IO.println ( ""+n );
             produto = n * produtoN ( n-1 );  // cauda
          } // fim
          return ( produto );
      } // fim

   /**
    * Metodo05.
    */
      public static void metodo05 ( )
      {
       // definir dados
          int n;
          int x;

       // identificar
          IO.println ( );
          IO.println ( "Metodo05" );
          IO.println ( );

       // acoes
          n = IO.readint ( "Quantidade = " );

          x = produtoN ( n );

          IO.println ( "produtoN ("+n+") = "+x );

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo05 ( )

   /**
    * Metodo para contar minusculas em cadeia de caracteres,
    * recursivamente.
    * @return quantidade de minusculas, ou zero
    * @param  s - cadeia de caracteres
    * @param  n - posicao a ser analisada
    */
      public static int contarMinusculas ( String s, int n )
      {
          int soma = 0;

          if ( s != null && 0 <= n && n < s.length( ) )
          {
           // IO.println ( ""+n );
              if ( 'a' <= s.charAt(n) && s.charAt(n) <= 'z' )
              {
                 soma = 1;
              } // fim
              soma = soma + contarMinusculas ( s, n-1 );  // cauda
          } // fim

          return ( soma );
      } // fim

   /**
    * Metodo06.
    */
      public static void metodo06 ( )
      {
       // definir dados
          int n;
          int x;
          String s;

       // identificar
          IO.println ( );
          IO.println ( "Metodo06" );
          IO.println ( );

       // acoes
          s = IO.readString ( "Qual a palavra? " );
          n = s.length( );

          x = contarMinusculas ( s, n-1 );

          IO.println ( "soma ("+n+") = "+x );

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo06 ( )

   /**
    * Metodo para mostrar numeros pares nao multiplos de 3.
    * @param n   - quantidade (controle)
    * @param par - possivel par a ser exibido
    */
      public static void mostrarParesNaoMultiplosDe3 ( int n, int par )
      {
       // definir dado local
          int resultado = 0;

       // testar o controle
          if ( n > 0 )
          {
             if ( par % 3 != 0 )
             {
              // IO.println ( ""+n+"\t"+par );
                 mostrarParesNaoMultiplosDe3 ( n-1, par+2 );
                 IO.println ( ""+n+"\t"+par );
             }
             else
             {
                 mostrarParesNaoMultiplosDe3 ( n, par+2 );
             } // fim
          } // fim
      }  // fim

   /**
    * Metodo07.
    */
      public static void metodo07 ( )
      {
       // definir dado local
          int n = 0;

       // identificar
          IO.println ( );
          IO.println ( "Metodo07" );
          IO.println ( );

       // acoes
          n = IO.readint ( "Quantos? " );
          mostrarParesNaoMultiplosDe3 ( n, 2 );

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo07 ( )

   /**
    * Metodo para mostrar numeros pares nao multiplos de 3.
    * @param n   - quantidade        (controle)
    * @param x   - contador de pares (indice invertido)
    * @param par - possivel par a ser exibido
    */
      public static void mostrarParesNaoMultiplosDe3 ( int n, int x, int par )
      {
         if ( n > 0 )
         {
            if ( par % 3 != 0 )
            {
                IO.println ( ""+n+"\t"+x+"\t"+par );
                mostrarParesNaoMultiplosDe3 ( n-1, x+1, par+2 );
             // IO.println ( ""+n+"\t"+x+"\t"+par );
            }
            else
            {
                mostrarParesNaoMultiplosDe3 ( n, x, par+2 );
            } // fim
         } // fim
      } // fim

   /**
    * Metodo08.
    */
      public static void metodo08 ( )
      {
       // definir dado local
          int n = 0;

       // identificar
          IO.println ( );
          IO.println ( "Metodo08" );
          IO.println ( );

       // acoes
          n = IO.readint ( "Quantos? " );
          mostrarParesNaoMultiplosDe3 ( n, 1, 2 );

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo08 ( )

   /**
    * Metodo para mostrar os inversos dos numeros pares nao multiplos de 3.
    * @param n   - quantidade        (controle)
    * @param par - possivel par a ser exibido
    */
      public static void mostrarInversosParesNaoMultiplosDe3 ( int n, int par )
      {
       // definir dados locais
          int resultado = 0;
          FILE arquivo;

          if ( n > 0 )
          {
             if ( par % 3 != 0 )
             {
              // IO.println ( ""+n+"\t"+par );

                 mostrarInversosParesNaoMultiplosDe3 ( n-1, par+2 );

              // saidas formatadas
              // IO.printf ( "%d\t%5.2f\n", n, (1.0/par) );
              // IO.printf ( "%3d\t%7.2f\n", n, (n*10+1.0/par) );

              // saidas formatadas nao formatadas
              // IO.println ( ""+n+"\t"+((double)1/par) );
              // IO.println ( ""+n+"\t"+(1/(double)par) );
                 IO.println ( ""+n+"\t"+(1.0/par) );

              // abertura de arquivo para receber acrescimos
                 arquivo = new FILE ( FILE.APPEND, "saida.txt" );
              // gravar em arquivo
                 arquivo.println ( ""+n+"\t"+(1.0/par) );
              // fechar arquivo (INDISPENSAVEL para gravar)
                 arquivo.close ( );
          }
          else
          {
                 mostrarInversosParesNaoMultiplosDe3 ( n, par+2 );
          } // fim
        } // fim
      } // fim

   /**
    * Metodo09.
    */
      public static void metodo09 ( )
      {
       // definir dado local
          int n = 0;

       // identificar
          IO.println ( );
          IO.println ( "Metodo09" );
          IO.println ( );

       // acoes
          n = IO.readint ( "Quantos? " );
          mostrarInversosParesNaoMultiplosDe3 ( n, 2 );

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo09 ( )

   /**
    * Metodo10.
    */
      public static void metodo10 ( )
      {
       // definir dado local
          int n = 0;
          FILE arquivo;
          String linha;

       // identificar
          IO.println ( );
          IO.println ( "Metodo10" );
          IO.println ( );

       // acoes
          // limpar arquivo (= abrir para gravar e depois fechar)
             arquivo = new FILE ( FILE.OUTPUT, "saida.txt" );
             arquivo.close( );

          // primeira chamada ao metodo recursivo
             n = IO.readint ( "Quantos? " );
             mostrarInversosParesNaoMultiplosDe3 ( n, 2 );

             IO.pause ( );

          // abrir arquivo para leitura
             arquivo = new FILE ( FILE.INPUT, "saida.txt" );

             IO.println ( "Exibicao do arquivo "+"saida.txt" );
          
             linha  = arquivo.readln ( );    // primeira linha
             while ( ! arquivo.eof( ) )      // teste
             {
                IO.println ( linha );
                linha  = arquivo.readln ( ); // proxima linha
             } // fim

             arquivo.close( ); // recomendado fechar, mesmo na leitura

             IO.pause( );

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo10 ( )

   // ---------------------------------------------- definicao do metodo principal

      public static void main ( String [ ] args )
      {
       // definir dados
          int opcao;

       // repetir ate' desejar parar
          do
          {
           // identificar
              IO.println ( );   // para saltar linha
              IO.println ( "Exemplo005 - v.0.0 - 01/mm/20aa" );
              IO.println ( "Matricula: 999999 Nome: xxx yyy zzz" );
              IO.println ( );   // para saltar linha

           // mostrar opcoes
              IO.println ( "Opcoes:"        );
              IO.println ( " 0 - parar"     );
              IO.println ( " 1 - metodo 01" );
              IO.println ( " 2 - metodo 02" );
              IO.println ( " 3 - metodo 03" );
              IO.println ( " 4 - metodo 04" );
              IO.println ( " 5 - metodo 05" );
              IO.println ( " 6 - metodo 06" );
              IO.println ( " 7 - metodo 07" );
              IO.println ( " 8 - metodo 08" );
              IO.println ( " 9 - metodo 09" );
              IO.println ( "10 - metodo 10" );
              IO.println ( );

           // ler opcao
              opcao = IO.readint ( "Qual a sua opcao? " );

           // escolher acao
              switch ( opcao )
              {
                case 0:
                   break;
                case 1:
                   metodo01 ( );
                   break;
                case 2:
                   metodo02 ( );
                    break;
                case 3:
                   metodo03 ( );
                    break;
                case 4:
                   metodo04 ( );
                   break;
                case 5:
                   metodo05 ( );
                   break;
                case 6:
                   metodo06 ( );
                    break;
                case 7:
                   metodo07 ( );
                   break;
                case 8:
                   metodo08 ( );
                   break;
                case 9:
                   metodo09 ( );
                   break;
                case 10:
                   metodo10 ( );
                   break;
                default:
                   break;
            } // fim escolher
         }
         while ( opcao != 0 );

      // encerrar execucao
         IO.println ( );
         IO.pause   ( "Apertar ENTER para terminar." );

      } // end main ( )

   } // fim Exemplo005 class

/*
// ---------------------------------------------- Documentacao complementar
//
// ---------------------------------------------- Historico
//
// Versao	Data	 Modificacao
// 0.0		01/mm	 esboco
//
// ---------------------------------------------- Testes
//
// Versao	Teste
// 0.0		01. ( OK )      teste do modelo
//
// ----------------------------------------------
*/
