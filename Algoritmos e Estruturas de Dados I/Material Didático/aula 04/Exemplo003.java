import IO.*;

/**
   Exemplo003.
 */
public class Exemplo003
{
 /**
    Funcao para calcular o n-esimo valor par.
    @return     n-esimo valor par
    @param  n - numero de ordem (indexador, pode ser zero)
  */
  public static int par ( int n )
  {
    int resultado = 2 * n;
    return ( resultado );
  } // fim

 /**
    Funcao para calcular o n-esimo valor impar.
    @return     n-esimo valor impar
    @param  n - numero de ordem (indexador)
  */
  public static int impar ( int n )
  {
//    int resultado = 2 * n + 1;
    int resultado = 2 * n - 1;
    return ( resultado );
  } // fim

 /**
    Funcao para calcular o quadrado de certo valor.
    @return     quadrado do valor
    @param  n - valor do qual se quer o quadrado
  */
  public static int quadrado ( int n )
  {
    int resultado = n * n;
    return ( resultado );
  } // fim

 /**
    Procedimento recursivo para
    mostrar valores pares menores que certo valor.
    @param  n - valor de referencia
  */
  public static void par2 ( int n )
  {
    int resultado = 0;
    if ( n > 0 )
    {
      if ( n%2 == 0 )
      {
        IO.println ( String.valueOf(n) );
      }
      par2 ( n-1 );
//      par2 ( --n );  // equivalente, apenas neste caso
//      par2 ( n-- );  // repeticao infinita
    } // fim se
  } // fim

 /**
    Procedimento para
    mostrar valores menores que certa quantidade.
  */
  public static void metodo01 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      x = 1;
      while ( x <= n )
      {
        IO.println ( ""+x );
        x = x + 1;
      }
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares.
  */
  public static void metodo02 ( )
  {
   // dados locais
      int n;
      int x;
      int par;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      par = 0;
      x   = 1;
      while ( x <= n )
      {
        par = par + 2;
        IO.println ( ""+x+"\t"+par );
        x = x + 1;
      }
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares.
  */
  public static void metodo03 ( )
  {
   // dados locais
      int n;
      int x;
      int par;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      par = 0;
      for ( x=1; x<=n; x=x+1 )
      {
        par = par + 2;
        IO.println ( ""+x+"\t"+par );
      }
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares,
    com indexador invertido.
  */
  public static void metodo04 ( )
  {
   // dados locais
      int n;
      int x;
      int par;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      par = 0;
      for ( x=n; x>=1; x=x-1 )
      {
        par = par + 2;
        IO.println ( ""+x+"\t"+par );
      }
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares,
    em ordem decrescente.
  */
  public static void metodo05 ( )
  {
   // dados locais
      int n;
      int x;
      int par;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      par = 0;
      for ( x=1; x<=n; x=x+1 )
      {
        par = par + 2;
  //      IO.println ( ""+x+"\t"+par );
      }
      IO.println ( );
      for ( x=n; x>=1; x=x-1 )
      {
        IO.println ( ""+x+"\t"+par );
        par = par - 2;
      }
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares.
  */
  public static void metodo06 ( )
  {
   // dados locais
      int n;
      int x, y;
      int par;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      par = 2;
      x   = 1;
      y   = 0;
      while ( x <= n )
      {
        y = y + 1;
        if ( par % 2 == 0 )
        {
          IO.println ( ""+x+"\t"+par );
          x = x + 1;
        }
        par = par + 1;
      } // fim
      IO.println ( "y="+y );
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares,
    em ordem decrescente.
  */
  public static void metodo07 ( )
  {
   // dados locais
      int n;
      int x;
      int par;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      par = 2*n+2; // calcular o primeiro par
      x   = n;
      while ( x >= 1 )
      {
        par = par - 2;
        IO.println ( ""+x+"\t"+par );
        x = x - 1;
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares,
    em ordem decrescente.
  */
  public static void metodo08 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=n; x>=1; x=x-1 )
      {
        IO.println ( ""+x+"\t"+(2*x) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares,
    em ordem crescente.
  */
  public static void metodo09 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=1; x<=n; x=x+1 )
      {
        IO.println ( ""+x+"\t"+(2*x) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares,
    em ordem crescente, usando funcao.
  */
  public static void metodo10 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=1; x<=n; x=x+1 )
      {
        IO.println ( ""+x+"\t"+par(x) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores impares,
    em ordem crescente, usando funcao.
  */
  public static void metodo11 ( )
  {
   // dados locais
      int n;
      int x;
      int impar = 1;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=1; x<=n; x=x+1 )
      {
        IO.println ( ""+x+"\t"+impar );
        impar = impar + 2;
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores impares,
    em ordem crescente, usando funcao.
  */
  public static void metodo12 ( )
  {
   // dados locais
      int n;
      int x;
      int impar = 1;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=1; x<=n; x=x+1 )
      {
        impar = 2 * x - 1;
        IO.println ( ""+x+"\t"+impar );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores impares,
    em ordem crescente, usando funcao.
  */
  public static void metodo13 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=1; x<=n; x=x+1 )
      {
        IO.println ( ""+x+"\t"+impar(x) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores impares,
    em ordem decrescente, usando funcao.
  */
  public static void metodo14 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=n; x>=1; x=x-1 )
      {
        IO.println ( ""+x+"\t"+impar(x) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores quadraticos,
    em ordem decrescente, usando funcao.
  */
  public static void metodo15 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=n; x>=1; x=x-1 )
      {
        IO.println ( ""+x+"\t"+(x*x) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores quadraticos,
    em ordem decrescente, usando funcao.
  */
  public static void metodo16 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=n; x>=1; x=x-1 )
      {
        IO.println ( ""+x+"\t"+quadrado(x) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores inversos quadraticos,
    em ordem crescente, usando funcao.
  */
  public static void metodo17 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=1; x<=n; x=x+1 )
      {
        IO.println ( ""+x+"\t"+(double) 1/quadrado(x) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores inversos quadraticos,
    em ordem crescente, usando funcao.
  */
  public static void metodo18 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=1; x<=n; x=x+1 )
      {
        IO.println ( ""+x+"\t"+1.0/quadrado(x) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores inversos quadraticos,
    em ordem crescente, usando funcao.
  */
  public static void metodo19 ( )
  {
   // dados locais
      int n;
      int x;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      for ( x=1; x<=n; x=x+1 )
      {
        IO.println ( ""+x+"\t"+1.0/Math.pow(x,2) );
      } // fim
      IO.pause ( );
  } // fim

 /**
    Procedimento para
    mostrar certa quantidade de valores pares,
    recursivamente, em ordem decrescente, usando funcao.
  */
  public static void metodo20 ( )
  {
   // dados locais
      int n;

   // ler quantidade
      n = IO.readint ( "Quantos? " );
   // mostrar valores
      par2 ( n );
      IO.pause ( );
  } // fim

 /**
    Acao principal.
  */
  public static void main ( String [ ] args )
  {
      // definir dados
         int opcao;

      // repetir ate' desejar parar
         do
         {
         // identificar
            IO.println ( );   // para saltar linha
            IO.println ( "Lista_00 - v.0.0 - 01/mm/20aa" );
            IO.println ( "Preparacao para a Lista 01" );
            IO.println ( "Matricula: 999999 Nome: xxx yyy zzz" );
            IO.println ( );   // para saltar linha

         // mostrar opcoes
            IO.println ( "Opcoes:" );
            IO.println ( "0 - parar" );
            IO.println ( " 1 - metodo 01  11 - metodo 11" );
            IO.println ( " 2 - metodo 02  12 - metodo 12" );
            IO.println ( " 3 - metodo 03  13 - metodo 13" );
            IO.println ( " 4 - metodo 04  14 - metodo 14" );
            IO.println ( " 5 - metodo 05  15 - metodo 15" );
            IO.println ( " 6 - metodo 06  16 - metodo 16" );
            IO.println ( " 7 - metodo 07  17 - metodo 17" );
            IO.println ( " 8 - metodo 08  18 - metodo 18" );
            IO.println ( " 9 - metodo 09  19 - metodo 19" );
            IO.println ( "10 - metodo 10  20 - metodo 20" );
            IO.println ( );

         // ler opcao
            opcao = IO.readint ( "Qual a sua opcao? " );

         // escolher acao
            switch ( opcao )
            {
               case  0:               break;
               case  1: metodo01 ( ); break;
               case  2: metodo02 ( ); break;
               case  3: metodo03 ( ); break;
               case  4: metodo04 ( ); break;
               case  5: metodo05 ( ); break;
               case  6: metodo06 ( ); break;
               case  7: metodo07 ( ); break;
               case  8: metodo08 ( ); break;
               case  9: metodo09 ( ); break;
               case 10: metodo10 ( ); break;
               case 11: metodo11 ( ); break;
               case 12: metodo12 ( ); break;
               case 13: metodo13 ( ); break;
               case 14: metodo14 ( ); break;
               case 15: metodo15 ( ); break;
               case 16: metodo16 ( ); break;
               case 17: metodo17 ( ); break;
               case 18: metodo18 ( ); break;
               case 19: metodo19 ( ); break;
               case 20: metodo20 ( ); break;
               default: IO.println ( "ERRO: Valor invalido" );
            } // fim escolher
         }
         while ( opcao != 0 );

      // encerrar execucao
         IO.println ( );
         IO.pause   ( "Apertar ENTER para terminar." );
  } // fim main ( )
} // fim classe
