/*
 * Escreva um programa que utilize a estrutura de dados do tipo Mapa para contar o número
 * de ocorrências de cada letra em uma String. Por exemplo, a string "HELLO THERE"
 * contém dois H’s, três E’s, dois L’s, um O , um T e um R. Exiba os resultados em ordem
 * alfabética.
 * • Serão totalmente desconsideradas respostas que não utilizarem um Mapa como
 * parte da estratégia de solução desta questão.
 */

import java.util.TreeMap;

public class Q49 {
    public static void main(String[] args) {
        int valor;
        String[] palavras = "HELLO THERE".split(" ");
        TreeMap<String, Integer> contaPalavras = new TreeMap<>();
        for (String palavra : palavras){
            if (contaPalavras.containsKey(palavra)) {
                valor = contaPalavras.get(palavra);
                contaPalavras.put(palavra, valor + 1);
            } else {
                contaPalavras.put(palavra, 1);
            }
        }
        for (String letra : contaPalavras.keySet()) {
            System.out.println(letra + ": " + contaPalavras.get(letra));
        }
    }
}
