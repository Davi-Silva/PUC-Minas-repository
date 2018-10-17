/*
  Exemplo001 - versao 0.0
  999999   - XXX
  2018-1
*/

// dependencias
import IO.*;

/**
   Modelo de classe.
*/
public class Exemplo001_v00
{
 // definir construtores/funcoes/procedimentos

 /**
    Acao principal.
 */
 public static void main ( String [ ] args )
 {
  // definir dados/resultados

  // identificar
     IO.println ( "Exemplo001 - versao 0.0 - 2018" );
     IO.println ( "999999 - XXX" );
     IO.println ( "Identificar valores dentro de um intervalo" );
     IO.println ( );

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