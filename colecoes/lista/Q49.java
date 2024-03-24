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
         String palavra = "HELLO THERE";
         TreeMap<Character, Integer> contaPalavras = new TreeMap<>();
         for (int i = 0; i<palavra.length(); i++){
            if (palavra.charAt(i) != ' ' && contaPalavras.containsKey(palavra.charAt(i))) {
                valor = contaPalavras.get(palavra.charAt(i));
                contaPalavras.put(palavra.charAt(i), valor + 1);
            }
            else if (palavra.charAt(i) != ' ' && contaPalavras.containsKey(palavra.charAt(i))==false) {
                contaPalavras.put(palavra.charAt(i), 1);
            } 
        }
        for (Character letra : contaPalavras.keySet()) {
            System.out.println(letra + ": " + contaPalavras.get(letra));
        }
    }
}
