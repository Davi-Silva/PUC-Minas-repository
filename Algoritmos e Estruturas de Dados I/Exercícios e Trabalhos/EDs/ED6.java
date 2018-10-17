/**
 * ED6
 *
 * @author
 * @version 01
 */

import IO.*;

public class ED6 {
    public static void metodo01(int x) {

        if (x > 0) {

            IO.println("Valor lido = " + x);

            metodo01(x - 1);
        }
    }

    public static void metodo02(int x) {
        if (x > 0) {
            metodo02(x - 1);
            IO.println("Valor = " + x);
        }
    }

    public static void metodo03(int x) {
        if (x > 1) {
            IO.print(" " + x);
            metodo03(x - 1);
        } else {

            IO.println(" " + x);
        }
    }

    public static void metodo04(int x) {
        if (x > 1) {
            IO.print(" " + 2 * (x - 1));
            metodo04(x - 1);
        } else {
            IO.println(" 1");
        }
    }

    public static void metodo05(int x) {
        if (x > 1) {
            metodo05(x - 1);
            IO.print(" + " + (2 * (x - 1)) + "/" + (2 * x - 1));
        } else {
            IO.print(" 1");
        }
    }

    public static int funcao01(int x) {
        int resposta = 0;
        if (x > 1) {
            resposta = x + funcao01(x - 1);
            IO.print(" + " + x);
        } else {
            IO.print(" 1");
            resposta = 1;
        }
        return (resposta);
    }

    public static double funcao02(int x) {
        double resposta = 0.0;
        if (x > 1) {
            resposta = (2.0 * (x - 1) / (2.0 * x - 1)) + funcao02(x - 1);
            IO.print(" + " + 2 * (x - 1) + "/" + (2 * x - 1));
        } else {
            resposta = 1.0;
            IO.print(" 1");
        }
        return (resposta);
    }

    public static int funcao03(int x) {
        int resposta = 1;
        if (x >= 10) {
            resposta = 1 + funcao03(x / 10);
        } else {
            if (x < 0) {
                resposta = funcao03(-x);
            }
        }
        return (resposta);
    }

    public static int funcao04(int x) {
        int resposta = 0;
        if (x == 1 || x == 2) {
            resposta = 1;
        } else {
            if (x > 1) {
                resposta = funcao04(x - 1) + funcao04(x - 2);
            }
        }
        return (resposta);
    }

    public static int funcao05(String cadeia, int x) {
        int resposta = 0;
        if (0 <= x && x < cadeia.length()) {
            if (cadeia.charAt(x) >= 'a' && cadeia.charAt(x) <= 'z') {
                resposta = 1;
            }
            resposta = resposta + funcao05(cadeia, x + 1);
        }
        return (resposta);
    }

    public static int funcao06(int x) {
        if (x >= 5) {
            funcao06(x - 1);
            if (x % 2 != 0) {
                IO.print(" " + x);
            }
        } else {
            IO.print("");
        }
        return x;
    }

    public static int funcao07(int x) {
        if (x >= 5) {
            funcao07(x - 1);
            if (x % 5 == 0) {
                IO.print(" " + x);
            }
        } else {
            IO.print("");
        }
        return x;
    }

    public static int funcao08(int x) {
        if (x >= 1) {
            funcao08(x - 1);
            if (x % 5 == 0) {
                IO.print(" " + x);
            }
        } else {
            IO.print("1");
        }
        return x;
    }


    public static int funcao09(int x) {
        if (x >= 0) {
            IO.println("1/" + Math.pow(5, x));
            funcao09(x - 1);
        }
        return x;
    }

    public static void funcao10(String c, int x) {
        if (x < c.length()) {
            IO.println(c.substring(x, x + 1));
            funcao10(c, x + 1);
        }
    }

    public static int funcao11(int x) {
        if (x >= 3) {
            funcao11(x - 1);
            if (x % 2 != 0) {
                IO.print(" " + x);
            }
        } else {
            IO.print("");
        }
        return x;
    }

    public static int funcao13(int n) {
        if (n <= 1) {
            IO.print(" " + n);
            return n;
        } else {
            IO.print(" " + n);
            return funcao13(n - 1) + funcao13(n - 2);
        }
    }

    public static boolean maiuscula(String n) {
        return n.charAt(0) >= 65 || n.charAt(0) <= 87;
    }

    /*public static int funcao14(String n, int x) {
        int nUpperCaseLetters = 0;
        if (x < n.length()) {
            if (maiuscula(n.substring(x))) {
                nUpperCaseLetters += funcao14(n, x + 1);
            }
        }
        return nUpperCaseLetters;
    }*/

    /**
     * main() – metodo principal
     */
    public static void main(String[] args) {
        IO.println("EXEMPLO0101 - Programa em Java");
        IO.println("Autor: ________________________");
        metodo01(5);
        IO.println("\n");
        metodo02(5);
        IO.println("\n");
        metodo03(5);
        IO.println("\n");
        metodo04(5);
        IO.println("\n");
        metodo05(5);
        IO.println("\n");
        IO.println(" = " + funcao01(5));
        IO.println("\n");
        IO.println(" = " + funcao02(5));
        IO.println("\n");
        IO.println(" Digitos = " + funcao03(123));
        IO.println(" Digitos = " + funcao03(0));
        IO.println(" Digitos = " + funcao03(-12));
        IO.println("\n");
        IO.println(" Fibonacci = " + funcao04(1));
        IO.println(" Fibonacci = " + funcao04(2));
        IO.println(" Fibonacci = " + funcao04(3));
        IO.println(" Fibonacci = " + funcao04(4));
        IO.println(" Fibonacci = " + funcao04(5));
        IO.println("\n");
        IO.println("Minusculas (\"abc\",0) = " + funcao05("abc", 0));
        IO.println("Minusculas (\"aBc\",0) = " + funcao05("aBc", 0));
        IO.println("Minusculas (\"AbC\",0) = " + funcao05("AbC", 0));
        IO.println("\n");
        int n;
        do {
            n = IO.readint();
        } while (n < 5);
        IO.print("Numero impares = ");
        funcao06(n);
        IO.println("\n");
        IO.print("Multiplos de 5 = ");
        funcao07(n);
        IO.println("\n");
        IO.print("Multiplos de 5 + 1 = ");
        funcao08(n);
        IO.println("\n");
        IO.print("Pontencia de 5 = ");
        funcao09(n);
        IO.println("\n");
        String c = IO.readln();
        IO.println("Simbolos separados");
        funcao10(c, 0);
        IO.print("Somar impares = ");
        funcao11(n);
        IO.println("\n");
        IO.print("Fibonacci = ");
        IO.println(funcao13(n));
        IO.println("\n");
        IO.print("Numero de letras maiusculas = ");
        /*IO.println(funcao14(c, 0));*/
        IO.println("\n");
        IO.pause("Apertar ENTER para terminar.");
    }
}