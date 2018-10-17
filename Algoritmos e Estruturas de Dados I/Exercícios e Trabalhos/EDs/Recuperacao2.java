/**
 * Autor: Davi Cunha
 * Versão: 01
 */

import IO.FILE;
import IO.IO;


public class Recuperacao2 {

    /**
     * Metodo para gravar uma String nno arquivo DADOS.TXT
     *
     * @param seq
     */
    public static void gravarArquivo(String seq) {
        FILE file = new FILE(FILE.OUTPUT, "DADOS.TXT");
        file.println(seq);
        file.close();
    }

    /**
     * Metodo para gravar uma String nno arquivo FRASES.TXT
     *
     * @param seq
     */
    public static void gravarFrasesArquivo(String seq) {
        FILE file = new FILE(FILE.OUTPUT, "FRASES.TXT");
        file.println(seq);
        file.close();
    }

    /**
     * Metodo para ler arquivo DADOS.TXT
     *
     * @return
     */
    public static String lerArquivo() {
        FILE file = new FILE(FILE.INPUT, "DADOS.TXT");

        if (!file.exists()) {
            IO.println("Arquivo inexistente!");
        } else {
            String line, fileContent = "";
            line = file.readln();
            while (!file.eof()) {
                if (line != null) {
                    fileContent += "" + line;
                    line = file.readln();
                }
            }
            file.close();
            return fileContent;
        }
        return null;
    }


    /**
     * Metodo para ler arquivo FRASES.TXT
     *
     * @return
     */
    public static String lerFrasesArquivo() {
        FILE file = new FILE(FILE.INPUT, "FRASES.TXT");

        if (!file.exists()) {
            IO.println("Arquivo inexistente!");
        } else {
            String line, fileContent = "";
            line = file.readln();
            while (!file.eof()) {
                if (line != null) {
                    fileContent += "" + line;
                    line = file.readln();
                }
            }
            file.close();
            return fileContent;
        }
        return null;
    }

    /**
     * Metodo para comparar se o numero é positivo, negativo ou nulo
     *
     * @param x
     * @return
     */
    public static int compareTo(int x) {
        if (x < 0) {
            return -1;
        } else if (x > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Metodo para criar uma String a ser inserida num arquivo
     *
     * @param ex
     * @return
     */
    public static int[] createSequence(int ex) {
        boolean wrongSeq;
        String numbers[] = null;
        int len = 0;

        IO.println("Digite uma sequencia de numeros: ");
        switch (ex) {
            case 1:
                do {
                    String numbersSequence = IO.readln();
                    gravarArquivo(numbersSequence);
                    String fileContent = lerArquivo();
                    numbers = fileContent.split(" ");
                    len = numbers.length;
                    if (!numbers[len - 1].equals("9999")) {
                        wrongSeq = true;
                    } else {
                        wrongSeq = false;
                    }
                } while (wrongSeq);

                break;
            case 2:
                do {
                    String numbersSequence = IO.readln();
                    gravarArquivo(numbersSequence);
                    String fileContent = lerArquivo();
                    numbers = fileContent.split(" ");
                    len = numbers.length;
                    if (!numbers[len - 1].equals("0")) {
                        wrongSeq = true;
                    } else {
                        wrongSeq = false;
                    }
                } while (wrongSeq);
                break;
            case 3:

                do {
                    String numbersSequence = IO.readln();
                    gravarArquivo(numbersSequence);
                    String fileContent = lerArquivo();
                    numbers = fileContent.split(" ");
                    len = numbers.length;
                    if ((len != 1)) {
                        wrongSeq = true;
                    } else {
                        wrongSeq = false;
                    }
                } while (wrongSeq);
                break;
            case 4:
                do {
                    String numbersSequence = IO.readln();
                    gravarArquivo(numbersSequence);
                    String fileContent = lerArquivo();
                    numbers = fileContent.split(" ");
                    len = numbers.length;
                    if (len != 2) {
                        wrongSeq = true;
                    } else {
                        wrongSeq = false;
                    }
                } while (wrongSeq);
                break;
            case 5:
                do {
                    String numbersSequence = IO.readln();
                    gravarArquivo(numbersSequence);
                    String fileContent = lerArquivo();
                    numbers = fileContent.split(" ");
                    len = numbers.length;
                    if (len != 2) {
                        wrongSeq = true;
                    } else {
                        wrongSeq = false;
                    }
                } while (wrongSeq);
                break;
            case 6:

                break;
            case 7:
                do {
                    String numbersSequence = IO.readln();
                    gravarArquivo(numbersSequence);
                    String fileContent = lerArquivo();
                    numbers = fileContent.split(" ");
                    len = numbers.length;
                    if ((len != 1)) {
                        wrongSeq = true;
                    } else {
                        wrongSeq = false;
                    }
                } while (wrongSeq);
                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
        }


        int numbersInt[] = new int[len];
        numbersInt = arrayToInt(numbersInt, numbers, len);
        return numbersInt;
    }

    public static int[] arrayToInt(int numbersInt[], String numbers[], int len) {


        for (int i = 0; i < len; i++) {
            numbersInt[i] = Integer.valueOf(numbers[i]);
        }
        return numbersInt;

    }

    /**
     * Metodo para calcular a quantidade de divisores de um numero
     *
     * @param numbersInt
     * @param len
     * @return
     */
    public static int[] howManyDividerNumbers(int numbersInt[], int len) {
        int numberDividers[] = new int[len];

        for (int i = 0; i < len - 1; i++) {
            for (int divider = 2; divider <= numbersInt[i]; divider++) {
                if (numbersInt[i] % divider == 0) {
                    numberDividers[i]++;
                }
            }
        }

        return numberDividers;
    }

    /**
     * Metodo para calcular a soma de todos os divisores do numero
     *
     * @param numbersInt
     * @param len
     * @return
     */
    public static int sumDividerNumbers(int numbersInt[], int len) {
        int sum = 0;

        for (int i = 0; i <= len - 1; i++) {
            for (int divider = 2; divider <= numbersInt[i]; divider++) {
                if (numbersInt[i] % divider == 0) {
                    sum += divider;
                }
            }
        }

        return sum;
    }

    /**
     * Metodo para verificar se o numero e perfeito
     *
     * @param numbersInt
     * @param len
     * @return
     */
    public static boolean arePerfectDividers(int numbersInt[], int len) {
        return sumDividerNumbers(numbersInt, len) == numbersInt[len - 1];
    }

    /**
     * Metodo para calcular o maximo divisor comum entre dois numeros
     *
     * @param m
     * @param n
     * @return
     */
    public static int mdc(int m, int n) {
        if ((m % n == 0)) {
            return n;
        } else {
            return mdc(n, (m % n));
        }
    }

    /**
     * Metodo para da calcular o minimo multiplo comum entre dois numeros
     * @param m
     * @param n
     * @return
     */
    public static int mmc(int m, int n) {
        int resto, a, b;
        a = m;
        b = n;

        do {
            resto = a % b;
            a = b;
            b = resto;
        } while (resto != 0);

        return (m * n) / a;
    }

    /**
     * Metodo para retornar os ( N ) primeiros símbolos contidos em uma cadeia
     * @param word
     * @param n
     * @return
     */
    public static String symbolsFromWord(String word, int n) {
        return word.substring(0, n);
    }

    /**
     * Metodo para retornar todos os símbolos restantes em uma cadeia
     * @param word
     * @param n
     * @return
     */
    public static String lettersLeft(String word, int n) {
        return word.substring(n, word.length());
    }

    /**
     * Metodo para retornar o último símbolo contido em uma cadeia
     * @param word
     * @param n
     * @return
     */
    public static String lastLetterLeft(String word,int n) {
        return word.substring(word.length() - 1, word.length());
    }

    /**
     * Metodo para retornar todos os símbolos restantes em uma cadeia, exceto o último
     * @param word
     * @param n
     * @return
     */
    public static String exceptLastLetter(String word,int n) {
        return word.substring(0, word.length() -1);
    }

    /**
     * Exercicio 01
     */
    public static void exercicio01() {
        int postive = 0, negative = 0, zero = 0;
        int numbersInt[] = createSequence(1);
        int len = numbersInt.length;

        for (int i = 0; i < len; i++) {
            switch (compareTo(numbersInt[i])) {
                case -1:
                    negative++;
                    break;
                case 0:
                    zero++;
                    break;
                case 1:
                    postive++;
                    break;
            }
        }

        IO.println("Qtd de numeros positivos = " + postive);
        IO.println("Qtd de numeros nulos = " + zero);
        IO.println("Qtd de numeros negativos = " + negative);
    }

    /**
     * Exercicio 02
     */
    public static void exercicio02() {
        int numbersInt[] = createSequence(2);
        int len = numbersInt.length;
        int numberDividers[];
        int sum = 0;

        sum = sumDividerNumbers(numbersInt, len);
        numberDividers = howManyDividerNumbers(numbersInt, len);

        int greaterInt = -1;
        int smallerInt = 999999;
        int greaterDividerNumberIntPosition = 0;
        int smallerDividerNumberIntPosition = 0;

        for (int i = 0; i < numberDividers.length - 1; i++) {
            if (numberDividers[i] > greaterInt) {
                greaterInt = numberDividers[i];
                greaterDividerNumberIntPosition = i;
            }
            if (numberDividers[i] < smallerInt) {
                smallerInt = numberDividers[i];
                smallerDividerNumberIntPosition = i;
            }
        }
        IO.println("Soma dos divisores inteiro = " + sum);
        IO.println("Numero com maior numero de divisores possiveis = " + numbersInt[greaterDividerNumberIntPosition]);
        IO.println("Numero com menor numero de divisores possiveis = " + numbersInt[smallerDividerNumberIntPosition]);
    }

    /**
     * Exercicio 03
     */
    public static void exercicio03() {
        int numbersInt[] = createSequence(3);
        int len = numbersInt.length;
        int numberDividers[] = new int[len];
        int sum = 0;

        sum = sumDividerNumbers(numbersInt, len);
        IO.println("Soma dos divisores inteiro = " + sum);

        for (int i = 0; i < len; i++) {
            if (arePerfectDividers(numbersInt, len)) {
                IO.println("O numero " + numberDividers[i] + " e perfeito");
            } else {
                IO.println("O numero " + numberDividers[i] + " NAO e perfeito");
            }
        }

    }

    /**
     * Exercicio 04
     */
    public static void exercicio04() {
        int numbersInt[] = createSequence(4);
        IO.println(mdc(numbersInt[0], numbersInt[1]));
    }

    /**
     * Exercicio 05
     */
    public static void exercicio05() {
        int numbersInt[] = createSequence(5);
        IO.println(mmc(numbersInt[0], numbersInt[1]));
    }

    /**
     * Exercicio 06
     */
    public static void exercicio06() {

    }

    /**
     * Exercicio 07
     */
    public static void exercicio07() {
        IO.println("Digite a quatidade de simbolos da palavra: ");
        String word = IO.readln();
        int n;
        do {
            n = IO.readint();
        } while (n <= 0);
        IO.println(symbolsFromWord(word, n));
    }

    /**
     * Exercicio 08
     */
    public static void exercicio08() {
        IO.println("Digite a quatidade de simbolos da palavra: ");
        String word = IO.readln();
        int n;
        do {
            IO.println("Digite a posicao do caractere: ");
            n = IO.readint();
        } while (n <= 0 && n > word.length() - 1);
        IO.println(lettersLeft(word, n));
    }

    /**
     * Exercicio 09
     */
    public static void exercicio09() {
        IO.println("Digite a quatidade de simbolos da palavra: ");
        String word = IO.readln();
        int n;
        do {
            IO.println("Digite a posicao do caractere: ");
            n = IO.readint();
        } while (n <= 0 && n > word.length() - 1);
        IO.println(lastLetterLeft(word, n));
    }

    /**
     * Exercicio 10
     */
    public static void exercicio10() {
        IO.println("Digite a quatidade de simbolos da palavra: ");
        String word = IO.readln();
        int n;
        do {
            IO.println("Digite a posicao do caractere: ");
            n = IO.readint();
        } while (n <= 0 && n > word.length() - 1);
        IO.println(exceptLastLetter(word, n));
    }


    public static void main(String[] args) {
        exercicio01();
        exercicio02();
        exercicio03();
        exercicio04();
        exercicio05();
        exercicio06();
        exercicio07();
        exercicio08();
        exercicio09();
        exercicio10();

    }
}
