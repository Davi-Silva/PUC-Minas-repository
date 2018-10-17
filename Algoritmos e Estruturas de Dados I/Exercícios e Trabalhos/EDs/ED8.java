/**
 * ED8
 *
 * @author Davi Cunha
 * @version 01
 */

import IO.*;


public class ED8 {
    public static int[] lerDoArquivo(String nome) {
        FILE arquivo = new FILE(FILE.INPUT, nome);
        int tamanho;
        int[] tabela = null;
        String linha;
        IO.println("Montar arranjo com valores lidos de arquivo");
        linha = arquivo.readln();
        if (linha == null) {
            IO.println("ERRO: Nao ha' dados no arquivo.");
        } else {
            tamanho = IO.getint(linha);
            if (tamanho <= 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                tabela = new int[tamanho];
                for (int x = 0; x < tamanho; x++) {
                    linha = arquivo.readln();
                    tabela[x] = IO.getint(linha);
                }
            }
        }
        arquivo.close();
        return (tabela);
    }

    public static void mostrar(int[] tabela) {
        int tamanho;
        int x;
        IO.println();
        if (tabela == null) {
            IO.println("ERRO: Tabela vazia.");
        } else {
            tamanho = tabela.length;
            if (tamanho <= 0) {
                IO.println("ERRO: Arranjo vazio.");
            } else {
                IO.println("Arranjo montado com " +
                        tamanho + " dados.");
                for (x = 0; x < tamanho; x = x + 1) {
                    IO.print(" " + tabela[x]);
                }
                IO.println();
            }
        }
    }

    public static int[] copiar(int[] tabela) {
        int tamanho;
        int x;
        int[] novo = null;
        if (tabela == null) {
            IO.println("ERRO: Arranjo vazio.");
        } else {
            tamanho = tabela.length;
            novo = new int[tamanho];
            if (novo == null) {
                IO.println("ERRO: Nao ha' espaco.");
            } else {
                for (x = 0; x < tamanho; x = x + 1) {
                    novo[x] = tabela[x];
                }
            }
        }
        return (novo);
    }

    public static int[] somar(int[] tabela1, int constante, int[] tabela2) {
        int tamanho;
        int x;
        int[] novo = null;
        if (tabela1 == null || tabela2 == null) {
            IO.println("ERRO: Arranjo vazio.");
        } else {
            if (tabela1.length == 0 || tabela2.length == 0) {
                IO.println("ERRO: Tamanho(s) invalido(s).");
            } else {
                tamanho = tabela1.length;
                novo = new int[tamanho];
                if (novo == null) {
                    IO.println("ERRO: Nao ha' espaco.");
                } else {
                    for (x = 0; x < tamanho; x = x + 1) {
                        novo[x] = tabela1[x] + constante * tabela2[x];
                    }
                }
            }
        }
        return (novo);
    }

    public static boolean comparar(int[] tabela1, int[] tabela2) {
        boolean resposta = true;
        int tamanho;
        int x;
        if (tabela1 == null || tabela2 == null) {
            IO.println("ERRO: Arranjo vazio.");
        } else {
            if (tabela1.length == 0 ||
                    tabela2.length == 0) {
                IO.println("ERRO: Tamanho(s) invalido(s).");
            } else {
                tamanho = tabela1.length;
                for (x = 0; x < tamanho; x = x + 1) {
                    resposta = resposta && (tabela1[x] == tabela2[x]);
                }
            }
        }
        return (resposta);
    }

    public static boolean eNulo(int[] tabela) {
        boolean resposta = true;
        int tamanho;
        int x;
        if (tabela == null) {
            IO.println("ERRO: Arranjo vazio.");
        } else {
            if (tabela.length == 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                tamanho = tabela.length;
                for (x = 0; x < tamanho; x = x + 1) {
                    resposta = resposta && (tabela[x] == 0);
                }
            }
        }
        return (resposta);
    }

    public static boolean ePositivo(int[] tabela) {
        boolean resposta = true;
        int tamanho;
        int x;
        if (tabela == null) {
            IO.println("ERRO: Arranjo vazio.");
        } else {
            if (tabela.length == 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                tamanho = tabela.length;
                for (x = 0; x < tamanho; x = x + 1) {
                    if (tabela[x] >= 0) {
                        resposta = resposta && (tabela[x] >= 0);
                    }
                }
            }
        }
        return (resposta);
    }

    public static boolean eSimetrico(int[] tabela1, int[] tabela2) {
        boolean resposta = true;
        int tamanho;
        int x;
        if (tabela1 == null || tabela2 == null) {
            IO.println("ERRO: Arranjo vazio.");
        } else {
            if (tabela1.length == 0 || tabela2.length == 0) {
                IO.println("ERRO: Tamanho(s) invalido(s).");
            } else {
                tamanho = tabela1.length;
                for (x = 0; x < tamanho; x = x + 1) {
                    resposta = resposta && (tabela1[x] == (-1) * tabela2[x]);
                }
            }
        }
        return (resposta);
    }

    public static int produtoEscalar(int[] tabela1, int[] tabela2) {
        int soma = 0;
        int tamanho;
        int x;
        if (tabela1 == null || tabela2 == null) {
            IO.println("ERRO: arranjo vazia.");
        } else {
            if (tabela1.length == 0 || tabela2.length == 0) {
                IO.println("ERRO: Tamanho(s) invalido(s).");
            } else {
                tamanho = tabela1.length;
                for (x = 0; x < tamanho; x = x + 1) {
                    soma = soma + tabela1[x] * tabela2[x];
                }
            }
        }
        return (soma);
    }

    public static void teste01() {
        int[] tabela = null;
        IO.println();
        IO.println("Recuperar dados de arquivo");
        IO.println();
        tabela = lerDoArquivo("DADOS.TXT");
        if (tabela == null) {
            IO.println("ERRO: Arranjo nulo.");
        } else {
            if (tabela.length == 0) {
                IO.println("ERRO: Arranjo vazio.");
            } else {
                IO.println("Arranjo montado com " +
                        tabela.length + " dados.");
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void teste02() {
        int[] tabela = null;
        IO.println();
        IO.println("Recuperar e mostrar dados de arquivo");
        IO.println();
        tabela = lerDoArquivo("DADOS.TXT");
        if (tabela == null) {
            IO.println("ERRO: Arranjo nulo.");
        } else {
            if (tabela.length == 0) {
                IO.println("ERRO: Arranjo vazio.");
            } else {
                mostrar(tabela);
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void teste03() {
        int[] tabela1 = null;
        int[] tabela2 = null;
        IO.println();
        IO.println("Recuperar e mostrar dados de arquivo");
        IO.println();
        tabela1 = lerDoArquivo("DADOS.TXT");

        if (tabela1 == null) {
            IO.println("ERRO: Arranjo nulo.");
        } else {
            if (tabela1.length == 0) {
                IO.println("ERRO: Arranjo vazio.");
            } else {
                mostrar(tabela1);
                tabela2 = copiar(tabela1);
                IO.println();
                IO.println("Apos copiar:");
                mostrar(tabela2);
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void teste04() {
        int[] tabela1 = null;
        int[] tabela2 = null;
        int[] tabela3 = null;
        IO.println();
        IO.println("Recuperar, somar e mostrar dados de arquivo");
        IO.println();
        tabela1 = lerDoArquivo("DADOS1.TXT");
        tabela2 = lerDoArquivo("DADOS2.TXT");
        if (tabela1 == null || tabela2 == null) {
            IO.println("ERRO: Arranjo nulo.");
        } else {
            if (tabela1.length == 0 ||
                    tabela2.length == 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                IO.println("Somar arranjos: ");
                mostrar(tabela1);
                IO.println("\n+");
                mostrar(tabela2);
                IO.println();
                IO.println("Resultado:");
                tabela3 = somar(tabela1, 2, tabela2);
                mostrar(tabela3);
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }


    public static void teste05() {
        int[] tabela1 = null;
        int[] tabela2 = null;
        int[] tabela3 = null;
        IO.println();
        IO.println("Recuperar, somar e mostrar dados de arquivo");
        IO.println();
        tabela1 = lerDoArquivo("DADOS1.TXT");
        tabela2 = lerDoArquivo("DADOS2.TXT");
        if (tabela1 == null || tabela2 == null) {
            IO.println("ERRO: Arranjo nulo.");
        } else {
            if (tabela1.length == 0 ||
                    tabela2.length == 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                IO.println("Somar arranjos: ");
                mostrar(tabela1);
                IO.println("\n+");
                mostrar(tabela2);
                IO.println();
                IO.println("Resultado:");
                tabela3 = somar(tabela1, -1, tabela2);
                mostrar(tabela3);
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void teste06() {
        int[] tabela1 = null;
        int[] tabela2 = null;
        String nome1, nome2;
        boolean resposta;
        IO.println();
        IO.println("Recuperar e comparar dados de arquivos");
        IO.println();
        nome1 = IO.readString("Qual o nome do primeiro arquivo? ");
        nome2 = IO.readString("Qual o nome do segundo arquivo? ");
        tabela1 = lerDoArquivo(nome1);
        tabela2 = lerDoArquivo(nome2);
        if (tabela1 == null || tabela2 == null) {
            IO.println("ERRO: Arranjo nulo.");
        } else {
            if (tabela1.length == 0 || tabela2.length == 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                IO.println("Somar arranjos: ");
                mostrar(tabela1);
                IO.println("\n+");
                mostrar(tabela2);
                IO.println();
                IO.println("Resultado:");
                resposta = comparar(tabela1, tabela2);
                if (resposta) {
                    IO.println("arranjos iguais.");
                } else {
                    IO.println("arranjos diferentes.");
                }
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void teste07() {
        int[] tabela = null;
        String nome;
        boolean resposta;
        IO.println();
        IO.println("Recuperar e comparar dados de arquivos");
        IO.println();
        nome = IO.readString("Qual o nome do arquivo? ");
        tabela = lerDoArquivo(nome);
        if (tabela == null) {
            IO.println("ERRO: Arranjo vazio.");
        } else {
            if (tabela.length == 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                IO.println("Testar se arranjo nulo: ");
                mostrar(tabela);
                IO.println();
                IO.println("Resultado:");
                resposta = eNulo(tabela);
                if (resposta) {
                    IO.println("arranjo nulo.");
                } else {
                    IO.println("arranjo nao e' nulo.");
                }
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void teste08() {
        int[] tabela = null;
        String nome;
        boolean resposta;
        IO.println();
        IO.println("Recuperar e comparar dados de arquivos");
        IO.println();
        nome = IO.readString("Qual o nome do arquivo? ");
        tabela = lerDoArquivo(nome);
        if (tabela == null) {
            IO.println("ERRO: Arranjo vazio.");
        } else {
            if (tabela.length == 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                IO.println("Testar se arranjo positivo: ");
                mostrar(tabela);
                IO.println();
                IO.println("Resultado:");
                resposta = ePositivo(tabela);
                if (resposta) {
                    IO.println("arranjo positivo.");
                } else {
                    IO.println("arranjo nao e' positivo.");
                }
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void teste09() {
        int[] tabela1 = null;
        int[] tabela2 = null;
        String nome1, nome2;
        boolean resposta;
        IO.println();
        IO.println("Recuperar e comparar dados de arquivos");
        IO.println();
        nome1 = IO.readString("Qual o nome do primeiro arquivo? ");
        nome2 = IO.readString("Qual o nome do segundo arquivo? ");
        tabela1 = lerDoArquivo(nome1);
        tabela2 = lerDoArquivo(nome2);
        if (tabela1 == null || tabela2 == null) {
            IO.println("ERRO: Arranjo nulo.");
        } else {
            if (tabela1.length == 0 ||
                    tabela2.length == 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                IO.println("Testar se arranjos diferentes: ");
                mostrar(tabela1);
                IO.println();
                mostrar(tabela2);
                IO.println();
                IO.println("Resultado:");
                resposta = eSimetrico(tabela1, tabela2);
                if (resposta) {
                    IO.println("arranjos simetricos.");
                } else {
                    IO.println("arranjos nao sao simetricos.");
                }
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }

    public static void teste10() {
        int[] tabela1 = null;
        int[] tabela2 = null;
        int produto;
        IO.println();
        IO.println("Recuperar, multiplicar e mostrar dados de arquivos");
        IO.println();
        tabela1 = lerDoArquivo("DADOS1.TXT");
        tabela2 = lerDoArquivo("DADOS2.TXT");
        if (tabela1 == null || tabela2 == null) {
            IO.println("ERRO: arranjo nula.");
        } else {
            if (tabela1.length == 0 ||
                    tabela2.length == 0) {
                IO.println("ERRO: Tamanho invalido.");
            } else {
                IO.println("Produto escalar de arranjos: ");
                mostrar(tabela1);
                IO.println("\n+");
                mostrar(tabela2);
                IO.println();
                IO.println("Resultado:");
                produto = produtoEscalar(tabela1, tabela2);
                IO.println("produto escalar = " + produto);
            }
        }
        IO.println();
        IO.pause("Apertar ENTER para continuar.");
    }


    public static void main(String[] args) {
        IO.println("EXEMPLO0141 - Programa em Java");
        IO.println("Autor: ________________________");
        teste01();
        teste02();
        teste03();
        teste04();
        teste05();
        teste06();
        teste07();
        teste08();
        teste09();
        teste10();
        IO.pause("Apertar ENTER para terminar.");
    }
}