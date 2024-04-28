package ClassesAbstratas.Q46;

import ClassesAbstratas.Q45.Quadrado;
import ClassesAbstratas.Q45.Triangulo;
import ClassesAbstratas.Q45.Circulo;

public class PrincipalD {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        Desenho desenho = new Desenho(circulo, quadrado, 1, 2, 3, 4);
        desenho.apresenta();
    }
}
