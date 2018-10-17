/**
 * ED9
 *
 * @author Davi Cunha
 * @version 01
 */

import IO.*;

public class ED9 {
    public static int[][] lerDoArquivo(String nome) {
        FILE arquivo = new FILE(FILE.INPUT, nome);
        int linhas, colunas;
        int x, y;
        int[][] tabela = null;
        String linha;
        IO.println("Montar matriz com valores lidos de arquivo");
        linha = arquivo.readln();// testar a disponibilidade de dados
        if (linha == null) {
            IO.println("ERRO: Nao ha' dados no arquivo.");
        } else {
            linhas = IO.getint(linha);
            linha = arquivo.readln();
            colunas = IO.getint(linha);
            if (linhas <= 0 || colunas <= 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                tabela = new int[linhas][colunas];
                for (x = 0; x < linhas; x = x + 1) {
                    for (y = 0; y < colunas; y = y + 1) {
                        linha = arquivo.readln();
                        tabela[x][y] = IO.getint(linha);
                    }
                }
            }
        }
        arquivo.close();
        return (tabela);
    }

    public static void mostrar(int[][] tabela) {
        int linhas, colunas;
        int x, y;
        IO.println();
        if (tabela == null) {
            IO.println("ERRO: Tabela vazia.");
        } else {
            linhas = tabela.length;
            colunas = tabela[0].length;
            if (linhas <= 0 || colunas <= 0) {
                IO.println("ERRO: Tabela vazia.");
            } else {
                IO.println("Matriz montada com " +
                        linhas + "x" +
                        colunas + " dados.");// repetir para cada dado na matriz
                for (x = 0; x < linhas; x = x + 1) {
                    for (y = 0; y < colunas; y = y + 1) {
                        IO.print(" " + tabela[x][y]);
                    }
                    IO.println();
                }
            }
        }
    }

    public static void teste01() {
        int[][] tabela = null;
        IO.println();
        IO.println("Recuperar dados de arquivo");
        IO.println();
        tabela = lerDoArquivo("DADOS.TXT");// 4. testar a existencia de dados
        if (tabela == null) {
            IO.println("ERRO: Matriz vazia.");
        } else {
            if (tabela.length == 0) {
                IO.println("ERRO: Matriz vazia.");
            } else {
                IO.println("Matriz montada com " +
                        tabela.length + "x" +
                        tabela[0].length + " dados.");
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void teste02() {
        int[][] tabela = null;
        IO.println();
        IO.println("Recuperar e mostrar dados de arquivo");
        IO.println();
        tabela = lerDoArquivo("DADOS.TXT");
        if (tabela == null) {
            IO.println("ERRO: Matriz nula.");
        } else {
            if (tabela.length == 0) {
                IO.println("ERRO: Matriz vazia.");
            } else {
                mostrar(tabela);
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void main(String[] args) {
        IO.println("EXEMPLO0141 - Programa em Java");
        IO.println("Autor: ________________________");
        teste01();
        IO.pause("Apertar ENTER para terminar.");
    }
}