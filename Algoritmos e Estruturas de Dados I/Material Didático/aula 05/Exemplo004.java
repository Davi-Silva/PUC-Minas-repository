/**
  * Exemplo004
  */

// ---------------------------------------------- classes nativas
//                                                ou auxiliares

   import IO.*;

// ---------------------------------------------- definicao de classe

/**
  * Exemplo004
  */
   public class Exemplo004
   {
    // ---------------------------------------------- definicao de metodos

    /**
     * Metodo01 - Decompor cadeia de caracteres em simbolos.
     */
     public static void metodo01 ( )
     {
      // definir dados
         String s = "abcde";
         int    x;

      // identificar
         IO.println ( );
         IO.println ( "Metodo01" );
         IO.println ( );

      // acoes
         for ( x=0; x<s.length( ); x=x+1 )    // crescente
         {
             IO.println ( ""+x+"\t"+s.charAt(x) );
         } // fim

         IO.println ( );
         for ( x=s.length( )-1; x>=0; x=x-1 ) // decrescente
         {
             IO.println ( ""+x+"\t"+s.charAt(x) );
         } // fim

      // encerrar
         IO.pause   ( "Apertar ENTER para continuar." );
     } // fim metodo01 ( )

    /**
     * Metodo02 - Decompor valor inteiro em digitos,
                  segundo a ordem crescente das potencias.
     */
     public static void metodo02 ( )
     {
      // definir dados
         int n = 0;
         int x, y;

      // identificar
         IO.println ( );
         IO.println ( "Metodo02" );
         IO.println ( );

      // acoes
         n = IO.readint ( "Qual o valor a ser decomposto? " );

         x = 0;

         if ( n < 0 )
            y = (-1) * n;   // converter para positivo
         else
            y = n;          // copiar valor

         if ( y == 0 )
         {
             IO.println ( ""+0+"\t"+y );
         }
         else
         {
           while ( y > 0 )
           {
             IO.println ( ""+x+"\t"+(y%10) ); // resto
             y = y / 10;                      // quociente
             x = x +  1;
           } // fim
         } // fim

      // encerrar
         IO.pause   ( "Apertar ENTER para continuar." );
     } // fim metodo02 ( )

    /**
     * Metodo03 - Decompor valor inteiro em digitos,
                  segundo a ordem crescente das potencias.
     */
     public static void metodo03 ( )
     {
      // definir dados
         int n = 0;
         int x, y;

      // identificar
         IO.println ( );
         IO.println ( "Metodo03" );
         IO.println ( );

      // acoes
         n = IO.readint ( "Qual o valor a ser decomposto? " );

         x = 0;

         y = Math.abs ( n );  // converter para positivo

         do
         {
            IO.println ( ""+x+"\t"+(y%10) );
            y = y / 10;       // reducao pelo quociente
            x = x +  1;
          }
          while ( y > 0 );

      // encerrar
         IO.pause   ( "Apertar ENTER para continuar." );
     } // fim metodo03 ( )

    /**
     * Metodo04 - Decompor valor inteiro em digitos,
                  segundo a ordem decrescente das potencias.
     */
     public static void metodo04 ( )
     {
      // definir dados
         int n = 0;
         int x, y;
         int pot10 = 1;

      // identificar
         IO.println ( );
         IO.println ( "Metodo04" );
         IO.println ( );

      // acoes
         n = IO.readint ( "Qual o valor a ser decomposto? " );

         x = 0;

         y = Math.abs ( n );

         while ( y >= pot10 )
         {
            pot10 = pot10 * 10;
         } // fim
      // mostrar a potencia de 10 imediatamente superior
         IO.pause ( "y = "+y+" pot10= "+pot10 );

         do
         {
            pot10 = pot10 / 10;            // reduzir a potencia
            if ( pot10 == 0 )
            {
              IO.println ( ""+x+"\t"+y );
            }
            else
            {
              IO.pause   ( ""+x+"\t"+(y/pot10) );
              y = y % pot10;               // reduzir o valor
            }
            x = x +  1;
         }
         while ( y > 0 );

      // encerrar
         IO.pause   ( "Apertar ENTER para continuar." );
     } // fim metodo04 ( )

    /**
     * Metodo05.
     */
     public static void metodo05 ( )
     {
      // definir dados
         int n = 0;
         int x, y;

      // identificar
         IO.println ( );
         IO.println ( "Metodo05" );
         IO.println ( );

      // acoes
         n = IO.readint ( "Qual o valor a ser decomposto? " );

         y = Math.abs ( n );

         x = 1;
         while ( x <= y/2 )
         {
            if ( y % x == 0 )   // testar se divisor
            {
              IO.println ( ""+x );
            } // fim
            x = x + 1;
         } // fim
         if ( y == 0 )
            IO.println ( ""+1 );
         else
            IO.println ( ""+y );

      // encerrar
         IO.pause   ( "Apertar ENTER para continuar." );
     } // fim metodo05 ( )

    /**
     * Metodo06.
     */
     public static void metodo06 ( )
     {
      // definir dados
         int n = 0;
         int x, y;

      // identificar
         IO.println ( );
         IO.println ( "Metodo06" );
         IO.println ( );

      // acoes
         n = IO.readint ( "Qual o valor a ser decomposto? " );

         y = Math.abs ( n );

         if ( y == 0 )
            IO.println ( "1" );
         else
         {
            IO.println ( ""+y );

            x = y/2;
            while ( x >= 1 )
            {
              if ( y % x == 0 )   // testar se divisor
              {
                IO.println ( ""+x );
              } // fim
              x = x - 1;
            } // fim
         } // fim

      // encerrar
         IO.pause   ( "Apertar ENTER para continuar." );
     } // fim metodo05 ( )

    /**
     * Metodo.
     */
     public static void forUp ( int inicio, int fim, int variacao )
     {
       if ( inicio < fim )                          // base
       {
          IO.println ( ">> "+inicio );  // antes
          forUp ( inicio+variacao, fim, variacao ); // motor
          IO.println ( "<< "+inicio );  // depois
       } // fim
     } // fim

    /**
     * Metodo.
     */
     public static void forDown ( int inicio, int fim, int variacao )
     {
       if ( inicio > fim )
       {
          IO.println ( ""+inicio );     // recursividade de cauda
          forDown ( inicio+variacao, fim, variacao );
       }
     } // fim

    /**
     * Metodo07.
     */
     public static void metodo07 ( )
     {
      // definir dados
         int n = 0;
      // identificar
         IO.println ( );
         IO.println ( "Metodo07" );
         IO.println ( );

      // acoes
         n = IO.readint ( "Qual o valor a ser usado ? " );
      // forDown ( n, 1, -1 );
         forUp ( 1, n,  1  );

      // encerrar
         IO.pause   ( "Apertar ENTER para continuar." );
     } // fim metodo07 ( )

    /**
     * Metodo para encontrar divisores de certo valor,
     * recursivamente.
     * OBS.: O valor zero tera' um divisor, pelo menos.
     */
     public static void divisores ( int y, int x )
     {
         if ( x <= y / 2 )
         {
            divisores ( y, x+1 );
            if ( y % x == 0 )
            {
               IO.println ( ""+x );
            }
//            divisores ( y, x+1 );
         }
         else
         {
            if ( y == 0 )
               IO.println ( ""+1 );
            else
               IO.println ( ""+y );
         } // fim
     } // fim divisores ( )

    /**
     * Metodo08.
     */
     public static void metodo08 ( )
     {
      // definir dados
         int n = 0;

      // identificar
         IO.println ( );
         IO.println ( "Metodo08" );
         IO.println ( );

      // acoes
         n = IO.readint ( "Qual o valor a ser usado ? " );

         divisores ( Math.abs (n), 1 );

      // encerrar
         IO.pause   ( "Apertar ENTER para continuar." );
     } // fim metodo08 ( )

    /**
     * Metodo para encontrar divisores de certo valor,
     * recursivamente.
     * OBS.: O valor zero tera' um divisor, pelo menos.
     */
     public static void divisores2 ( int y, int x )
     {
         if ( x == y )
         {
            if ( y == 0 )
               IO.println ( ""+1 );
            else
            {
               IO.println ( ""+y );
               divisores2 ( y, x/2 );   // motor1 (recomeco)
            } // fim
         }
         else
         {
            if ( x>0 )
            {
               if ( y % x == 0 )
                 IO.println ( ""+x );
               divisores2 ( y, x-1 );   // motor2 (rotina)
            } // fim
         } // fim
     } // fim divisores2 ( )

    /**
     * Metodo09.
     */
     public static void metodo09 ( )
     {
      // definir dados
         int n = 0;

      // identificar
         IO.println ( );
         IO.println ( "Metodo09" );
         IO.println ( );

      // acoes
         n = IO.readint ( "Qual o valor a ser usado ? " );

         divisores2 ( Math.abs (n), Math.abs (n) );

      // encerrar
         IO.pause   ( "Apertar ENTER para continuar." );
     } // fim metodo09 ( )

    /**
     * Metodo para contar divisores de certo valor,
     * recursivamente.
     * OBS.: O valor zero tera' um divisor, pelo menos.
     */
     public static int contar_divisores ( int y, int x )
     {
      // definir dado local
         int contador = 0;

         if ( x <= y / 2 )
         {
            if ( y % x == 0 )
            {
               IO.println ( ""+x );
               contador = 1;
            } // fim
            contador = contador + contar_divisores ( y, x+1 );
         }
         else
         {
            if ( y == 0 )
               IO.println ( ""+1 );
            else
               IO.println ( ""+y );
            contador = 1;
         } // fim
      // retornar resultado
         return ( contador );
     } // fim contar_divisores ( )

    /**
     * Metodo10.
     */
     public static void metodo10 ( )
     {
      // definir dados
         int n = 0;

      // identificar
         IO.println ( );
         IO.println ( "Metodo10" );
         IO.println ( );

      // acoes
         n = IO.readint ( "Qual o valor a ser usado ? " );

         IO.println ( "Quantidade de divisores = "
                    + contar_divisores ( Math.abs (n), 1 ) );

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
            IO.println ( "Exemplo004 - v.0.0 - 01/mm/20aa" );
            IO.println ( "Matricula: 999999 Nome: xxx yyy zzz" );
            IO.println ( );   // para saltar linha

         // mostrar opcoes
            IO.println ( "Opcoes:" );
            IO.println ( " 0 - parar" );
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

   } // fim Exemplo004 class

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
//                  ( 12 )
//                  (-12 )
//                  (  1 )
//                  (  0 )

// ----------------------------------------------
*/
