import java.util.Arrays;
import java.util.TreeSet;

public class DemoConjunto {
    public static void main(String[] args) {
        String cores[] = {"vermelho", "verde", "azul", "roxo", "vermelho", "rosa", "amarelo", "verde"};
        TreeSet<String> conjCores = new TreeSet<>(Arrays.asList(cores));
        System.out.println(conjCores);

        System.out.println("Antes do rosa" + conjCores.headSet("rosa"));
        System.out.println("A partir do rosa" + conjCores.tailSet("rosa"));
        System.out.println("Primeiro: " + conjCores.first());
        System.out.println("Ultimo: " + conjCores.last());
    }
}