import java.util.TreeMap;

public class DemoMapa {
    public static void main(String[] args) {
        String aux;
        int valor;
        String entrada = "Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos e vem sendo utilizado desde o século XVI quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos Lorem Ipsum sobreviveu não só a cinco séculos como também ao salto para a editoração eletrônica permanecendo essencialmente inalterado Se popularizou na década de 60 quando a Letraset lançou decalques contendo passagens de Lorem Ipsum e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker";

        String[] palavras = entrada.split(" ");
        TreeMap<String, Integer> contaPalavras = new TreeMap<>();
        System.out.println("Palavras encontradas: " + palavras.length);

        for (String palavra : palavras){
            palavra.concat(entrada);
            aux = palavra.toLowerCase();
            if (contaPalavras.containsKey(aux)) {
                
                valor = contaPalavras.get(aux);
                contaPalavras.put(aux, valor + 1);
            } else {
                contaPalavras.put(aux, 1);
            }
        }
        for (String palavra : contaPalavras.keySet()) {
            System.out.println(palavra + ": " + contaPalavras.get(palavra) + " - Quantidade de letras = " + palavra.length());
        }
    }
}
