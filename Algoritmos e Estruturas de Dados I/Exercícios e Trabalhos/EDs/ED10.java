/**
* Exemplo0190
*
* @author Lucas Eiji Hirose Takakuwa
* @version 01
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao de classe auxiliar
/**
* Classe para tratar arranjo de inteiros.
*/
class Arranjo
{
/**
* armazenador generico dos dados
*/
   public Object [ ] tabela;
/**
* construtor padrao
*/
   public Arranjo ( )
   {
      tabela = null;
   } // fim construtor padrao
   /**
* construtor alternativo.
*/
   public Arranjo ( int tamanho )
   {
      if ( tamanho <= 0 )
      {
         IO.println ( "ERRO: quantidade invalida." );
      }
      else
      {
         tabela = new Object [ tamanho ];
      } // fim se
   } // fim construtor alternativo
/**
* informar a quantidade de posicoes reservadas.
*/
   public int length ( )
   {
      int tamanho = 0;
      if ( tabela != null )
      {
         tamanho = tabela.length;
      }
      return ( tamanho );
   } // fim length ( )
   
   /**
* exibir dados em tabela.
*/
   public void printArray ( )
   {
   // definir dados
      int tamanho, posicao;
   // identificar
      IO.println ( );
   // testar se a tabela foi montada
      if ( tabela == null )
      {
         IO.println ( "ERRO: Tabela vazia." );
      }
      else
      {
      // obter o tamanho da tabela
         tamanho = length( );
      // mostrar tabela
         IO.println ( "Tabela com "+tamanho+" posicoes:" );
      // repetir para cada posicao na tabela
         for ( posicao = 0;
         posicao < tamanho;
         posicao = posicao + 1 )
         {
         // mostrar o valor armazenado
            IO.println ( "posicao = "+posicao+
               " tem valor = "+tabela [ posicao ] );
         } // fim repetir
      } // fim se
   } // fim printArray ( )
   
   /**
* ler valores inteiros de arquivo e guardar em uma tabela.
* @param message - com texto a ser mostrado na tela
*/
   public void readArray ( String message )
   {
   // definir dados
      int posicao,
         tamanho = length( );
      String linha;
   // testar se quantidade valida
      if ( tamanho <= 0 )
      {
         IO.println ( "ERRO: Tamanho invalido." );
      }
      else
      {
      // mostrar mensagem antes de ler dados
         IO.println ( message );
      // obter o tamanho da tabela
         tamanho = this.length ( );
      // repetir para cada posicao na tabela
         for ( posicao = 0;
         posicao < tamanho;
         posicao = posicao + 1 )
         {
         // ler linha do teclado
            linha = IO.readln ( );
         // armazenar em um posicao da tabela
         // como objeto em String
            tabela [ posicao ] = linha;
         } // fim repetir
      } // fim se
   } // fim readArray ( )
   
   /**
* ler valores inteiros de arquivo e guardar em uma tabela.
* @param message - com texto a ser mostrado na tela
* @param n - quantidade de dados a serem lidos
*/
   public void readIntArray ( String message, int n )
   {
   // definir dados
      int posicao,
         tamanho = length( );
      String linha;
   // testar se quantidade valida
      if ( tamanho <= 0 ||
      n <= 0 || n > tamanho )
      {
         IO.println ( "ERRO: Quantidade invalida." );
      }
      else
      {
      // mostrar mensagem antes de ler dados
         IO.println ( message );
      // repetir para cada posicao na tabela
         for ( posicao = 0;
         posicao < n;
         posicao = posicao + 1 )
         {
         // ler linha do teclado
            linha = IO.readln ( );
         // armazenar em um posicao da tabela
         // valor convertido para inteiro
            tabela [ posicao ] = IO.getint ( linha );
         } // fim repetir
      } // fim se
   } // fim readIntArray ( )
   
   /**
* exibir certa quantidade de dados em tabela.
* @param n - quantidade de dados a serem mostrados
*/
   public void printIntArray ( int n )
   {
   // definir dados
      int posicao,
         tamanho = length( );
   // identificar
      IO.println ( );
   // testar se a tabela foi montada
      if ( tabela == null ||
      n <= 0 || n > tamanho )
      {
         IO.println ( "ERRO: Tabela vazia ou quantidade invalida." );
      }
      else
      {
      // mostrar tabela
         IO.println ( "Tabela com "+tamanho+" posicoes:" );
      // repetir para cada posicao na tabela
         for ( posicao = 0;
         posicao < n;
         posicao = posicao + 1 )
         {
         // mostrar o valor armazenado
            IO.println ( "posicao = "+posicao+
               " tem valor = "+(int) tabela [ posicao ] );
         } // fim repetir
      } // fim se
   } // fim printIntArray ( )
   
   /**
* clonar tabela.
* @return nova tabela com dados copiados
*/
   public Arranjo clone ( )
   {
   // definir dados
      int tamanho, posicao;
      Arranjo nova = null;
   // testar existencia de dados
      if ( tabela == null )
      {
         IO.println ( "ERRO: Tabela vazia." );
      }
      else
      {
      // obter o tamanho da tabela original
         tamanho = length( );
      // reservar espaco para a nova tabela
         nova = new Arranjo ( tamanho );
      // testar a existencia de dados
         if ( nova == null )
         {
            IO.println ( "ERRO: Nao ha' espaco." );
         }
         else
         {
         // repetir para cada posicao na tabela original
            for ( posicao = 0;
            posicao < nova.length( );
            posicao = posicao + 1 )
            {
            // copiar dado de uma posicao
               nova.tabela [ posicao ] = tabela [ posicao ];
            } // fim repetir
         } // fim se
      } // fim se
   // retornar nova tabela
      return ( nova );
   } // fim clone ( )
   
   /**
* copiar certa quantidade de dados em tabela.
* @return nova tabela com dados copiados
* @param n - quantidade de dados
*/
   public Arranjo copyArray ( int n )
   {
   // definir dados
      int posicao,
         tamanho = length( );
      Arranjo nova = null;
   // testar existencia de dados
      if ( tabela == null ||
      n <= 0 || n > tamanho )
      {
         IO.println ( "ERRO: Tabela vazia." );
      }
      else
      {
      // reservar espaco para a nova tabela
         nova = new Arranjo ( n );
      // testar a existencia de dados
         if ( nova == null )
         {
            IO.println ( "ERRO: Nao ha' espaco." );
         }
         else
         {
         // repetir para cada posicao na tabela original
            for ( posicao = 0;
            posicao < nova.length( );
            posicao = posicao + 1 )
            {
            // copiar dado de uma posicao
               nova.tabela [ posicao ] = tabela [ posicao ];
            } // fim repetir
         } // fim se
      } // fim se
   // retornar nova tabela
      return ( nova );
   } // fim copyArray ( )
   
   /**
* exibir dados em tabela automaticamente.
*/
   public String toString ( )
   {
   // definir dados
      String msg = null;
      int posicao,
         tamanho;
   // testar se a tabela foi montada
      if ( tabela != null )
      {
      // obter o tamanho da tabela
         tamanho = length( );
      // repetir para cada posicao na tabela
         msg = "";
         for ( posicao = 0;
         posicao < tamanho;
         posicao = posicao + 1 )
         {
         // guardar valor armazenado
            msg = msg + " " + tabela [ posicao ];
         } // fim repetir
      } // fim se
   // retornar valores armazenados
      return ( msg );
   } // fim toString ( )

} // fim da classe Arranjo
// ---------------------------------------------- definicao da classe principal
public class Exemplo0190
{
// ---------------------------------------------- definicao de metodo auxiliar
/**
* Testar definições de arranjo usando classe.
*/

   public static int [][] GerarTabela (int l, int c){
      int [][] tabela = new int [l][c];
      int pl = 0, pc = 0;
      while((pl+1)*(pc+1)<=(l*c)){
         if(pl<l){
            tabela[pl][pc] = 0+(int)(Math.random()*(100-0+1));
            pl = pl + 1;
         }
         else{
            if(pc<c){
               pl = 0;
               pc = pc + 1;
            }
         }
      }
      return(tabela);
   }
   
   public static int [][] RecuperarMatriz(String nome){
      FILE arquivo = new FILE(FILE.INPUT, nome);
      int [][] tabela = null;
      String linha = arquivo.readln();
      int l = IO.getint(linha);
      linha = arquivo.readln();
      int c = IO.getint(linha);
      tabela = new int [l][c];
      int pl = 0, pc = 0;
      int e;
      linha = arquivo.readln();
      e = IO.getint(linha);
      while((pl+1)*(pc+1)<=(l*c)){
         if(pl<l){
            tabela[pl][pc] = e;
            pl = pl + 1;
            linha = arquivo.readln();
            e = IO.getint(linha);
         }
         else{
            if(pc<c){
               pl = 0;
               pc = pc + 1;
            }
         }
      }
      arquivo.close();
      return(tabela);
   }
   
   public static void m_02(){
      String nome = "Tabela.txt";
      FILE arquivo = new FILE(FILE.OUTPUT, nome);
      int l = 5, c = 5;
      arquivo.println(""+l);
      arquivo.println(""+c);
   //int [][] tabela = new int [l][c];
      int [][] tabela = GerarTabela(l, c);
      int pl = 0, pc = 0;
      while((pl+1)*(pc+1)<=(l*c)){
         if(pl<l){
            arquivo.println(""+tabela[pl][pc]);
            pl = pl + 1;
         }
         else{
            if(pc<c){
               pl = 0;
               pc = pc + 1;
            }
         }
      }
      arquivo.close();
      tabela = RecuperarMatriz(nome);
      pl = 0;
      pc = 0;
      while((pl+1)*(pc+1)<=(l*c)){
         if(pl<l){
            IO.print(" "+tabela[pl][pc]);
            pl = pl + 1;
         }
         else{
            if(pc<c){
               pl = 0;
               pc = pc + 1;
               IO.println();
            }
         }
      }
      IO.println();
   }
   
   public static void metodo01 ( )
   {
   // 1. definir dados
      Arranjo a1 = null; // nao existe objeto
      Arranjo a2 = new Arranjo ( ); // existe objeto (sem dados, no momento)
   // 2. identificar
      IO.println ( "Definicoes de arranjo" );
   // 3. testar as definicoes de arranjo
      if ( a1 == null )
      {
         IO.println ( "Arranjo a1 nulo" );
      }
      else
      {
         IO.println ( "Arranjo a1 nao nulo" );
      } // fim se
      if ( a2 == null )
      {
         IO.println ( "Arranjo a2 nulo" );
      }
      else
      {
         IO.println ( "Arranjo a2 nao nulo" );
      } // fim se
   // 5. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo01( )
   
   public static void metodo02 ( )
   {
   // 1. definir dados
      Arranjo a1 = null;
      Arranjo a2 = new Arranjo ( );
      Arranjo a3 = new Arranjo ( 3 );
   // 3. testar as definicoes de arranjo
      if ( a3 == null )
      {
         IO.println ( "Arranjo a3 nulo" );
      }
      else
      {
         IO.println ( "Arranjo a3 nao nulo com "+a3.length( )+" posicoes." );
      } // fim se
   }
   
   /**
* Testar entrada e saida de dados em arranjo usando classe.
*/
   public static void metodo03 ( )
   {
   // 1. definir dados
      Arranjo a3 = new Arranjo ( 3 );
   // 2. identificar
      IO.println ( );
      IO.println ( "Entrada e saida em arranjo" );
      IO.println ( );
   // 3. testar entrada e saida em arranjo
      if ( a3 == null )
      {
         IO.println ( "Arranjo a3 nulo" );
      }
      else
      {
      // mostrar informacoes sobre arranjo
         IO.println ( "Arranjo a3 nao nulo com "+a3.length( )+" posicoes." );
      // mostrar dados no arranjo
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printArray ( );
      } // fim se
   // 4. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo03( )
   
   /**
* Testar entrada e saida de dados em arranjo usando classe.
*/
   public static void metodo04 ( )
   {
   // 1. definir dados
      Arranjo a3 = new Arranjo ( 3 );
   // 2. identificar
      IO.println ( );
      IO.println ( "Entrada e saida em arranjo" );
      IO.println ( );
   // 3. testar entrada e saida em arranjo
      if ( a3 == null )
      {
         IO.println ( "Arranjo a3 nulo" );
      }
      else
      {
      // mostrar informacoes sobre arranjo
         IO.println ( "Arranjo a3 nao nulo com "+a3.length( )+" posicoes." );
      // ler dados e guardar no arranjo
         a3.readArray ( "Entrar com dados no arranjo:" );
      // mostrar dados no arranjo
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printArray ( );
      } // fim se
   // 4. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo04( )
   
   /**
* Testar entrada e saida de dados em arranjo usando classe.
*/
   public static void metodo05 ( )
   {
   // 1. definir dados
      Arranjo a3 = new Arranjo ( 3 );
   // 2. identificar
      IO.println ( );
      IO.println ( "Entrada e saida em arranjo" );
      IO.println ( );
   // 3. testar entrada e saida em arranjo
      if ( a3 == null )
      {
         IO.println ( "Arranjo a3 nulo" );
      }
      else
      {
      // mostrar informacoes sobre arranjo
         IO.println ( "Arranjo a3 nao nulo com "+a3.length( )+" posicoes." );
      // ler dados e guardar no arranjo
         a3.readIntArray ( "Entrar com dados no arranjo:", 2 );
      // mostrar dados no arranjo
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printArray ( );
      } // fim se
   // 4. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo05( )
   
   /**
* Testar entrada e saida de dados em arranjo usando classe.
*/
   public static void metodo06 ( )
   {
   // 1. definir dados
      Arranjo a3 = new Arranjo ( 3 );
   // 2. identificar
      IO.println ( );
      IO.println ( "Entrada e saida em arranjo" );
      IO.println ( );
   // 3. testar entrada e saida em arranjo
      if ( a3 == null )
      {
         IO.println ( "Arranjo a3 nulo" );
      }
      else
      {
      // mostrar informacoes sobre arranjo
         IO.println ( "Arranjo a3 nao nulo com "+a3.length( )+" posicoes." );
      // ler dados e guardar no arranjo
         a3.readIntArray ( "Entrar com dados no arranjo:", 2 );
      // mostrar dados no arranjo
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printIntArray ( 2 );
      } // fim se
   // 4. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo06( )
   
   /**
* Testar entrada e saida de dados em arranjo usando classe.
*/
   public static void metodo07 ( )
   {
   // 1. definir dados
      Arranjo a2 = null;
      Arranjo a3 = new Arranjo ( 3 );
   // 2. identificar
      IO.println ( );
      IO.println ( "Entrada e saida em arranjo" );
      IO.println ( );
   // 3. testar entrada e saida em arranjo
      if ( a3 == null )
      {
         IO.println ( "Arranjo a3 nulo" );
      }
      else
      {
      // mostrar informacoes sobre arranjo
         IO.println ( "Arranjo a3 nao nulo com "+a3.length( )+" posicoes." );
      // ler dados e guardar no arranjo
         a3.readIntArray ( "Entrar com dados no arranjo:", 2 );
      // tornar arranjos identicos
         a2 = a3;
      // mostrar dados no arranjo
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a2.printIntArray ( 2 );
      // ler dados e guardar no arranjo
         a2.readIntArray ( "Entrar com dados no arranjo:", 3 );
      // mostrar dados no arranjo original
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printIntArray ( 3 );
      // mostrar dados no arranjo copiado
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a2.printIntArray ( 3 );
      } // fim se
   // 4. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo07( )
   
/**
* Testar entrada e saida de dados em arranjo usando classe.
*/
   public static void metodo08 ( )
   {
   // 1. definir dados
      Arranjo a2 = null;
      Arranjo a3 = new Arranjo ( 3 );
   // 2. identificar
      IO.println ( );
      IO.println ( "Entrada e saida em arranjo" );
      IO.println ( );
   // 3. testar entrada e saida em arranjo
      if ( a3 == null )
      {
         IO.println ( "Arranjo a3 nulo" );
      }
      else
      {
      // mostrar informacoes sobre arranjo
         IO.println ( "Arranjo a3 nao nulo com "+a3.length( )+" posicoes." );
      // ler dados e guardar no arranjo
         a3.readIntArray ( "Entrar com dados no arranjo:", 3 );
      // tornar arranjos identicos
         a2 = a3.clone ( );
      // mostrar dados no arranjo
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a2.printIntArray ( 3 );
      // ler dados e guardar no arranjo
         a2.readIntArray ( "Entrar com dados no arranjo:", 3 );
      // mostrar dados no arranjo original
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printArray ( );
      // mostrar dados no arranjo copiado
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a2.printIntArray ( 3 );
      } // fim se
   // 4. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo08( )
   
   /**
* Testar entrada e saida de dados em arranjo usando classe.
*/
   public static void metodo09 ( )
   {
   // 1. definir dados
      Arranjo a2 = null;
      Arranjo a3 = new Arranjo ( 3 );
   // 2. identificar
      IO.println ( );
      IO.println ( "Entrada e saida em arranjo" );
      IO.println ( );
   // 3. testar entrada e saida em arranjo
      if ( a3 == null )
      {
         IO.println ( "Arranjo a3 nulo" );
      }
      else
      {
      // mostrar informacoes sobre arranjo
         IO.println ( "Arranjo a3 nao nulo com "+a3.length( )+" posicoes." );
      // ler dados e guardar no arranjo
         a3.readIntArray ( "Entrar com dados no arranjo:", 3 );
      // tornar arranjos identicos
         a2 = a3.copyArray( 3 );
      // mostrar dados no arranjo copiado
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a2.printIntArray ( 3 );
      // mostrar dados no arranjo original
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printIntArray ( 3 );
      } // fim se
   // 4. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo09( )
   
/**
* Testar entrada e saida de dados em arranjo usando classe.
*/
   public static void metodo10 ( )
   {
   // 1. definir dados
      Arranjo a2 = null;
      Arranjo a3 = new Arranjo ( 3 );
   // 2. identificar
      IO.println ( );
      IO.println ( "Entrada e saida em arranjo" );
      IO.println ( );
   // 3. testar entrada e saida em arranjo
   // ler dados e guardar no arranjo
      a3.readArray ( "Entrar com dados no arranjo:" );
   // tornar arranjos identicos
      a2 = a3.copyArray( 2 );
   // mostrar dados no arranjo copiado
      IO.println ( "Mostrar dados lidos e armazenados:" );
      IO.println ( ""+a2 );
   // mostrar dados no arranjo original
      IO.println ( "Mostrar dados lidos e armazenados:" );
      IO.println ( ""+a3 );
   // 4. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo10( )
      
// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0181 - Programa em Java" );
      IO.println ( "Autor: Lucas Eiji Hirose Takakuwa" );
   // executar o metodo auxiliar
   
      //metodo01();
      //metodo02();
      //metodo03();
      //metodo04();
      //metodo05();
      //metodo06();
      //metodo07();
      //metodo08();
      //metodo09();
      metodo10();
   // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0161