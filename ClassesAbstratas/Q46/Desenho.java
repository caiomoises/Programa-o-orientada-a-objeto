import ClassesAbstratas.Q45.FiguraGeometrica;

public class Desenho {
    private FiguraGeometrica figuraGeometrica1;
    private FiguraGeometrica figuraGeometrica2;

    private double coordenadaX1;
    private double coordenadaY1;

    private double coordenadaX2;
    private double coordenadaY2;

    public Desenho(FiguraGeometrica figuraGeometrica1, FiguraGeometrica figuraGeometrica2, double coordenadaX1, double coordenadaY1, double coordenadaX2, double coordenadaY2) {
        this.figuraGeometrica1 = figuraGeometrica1;
        this.figuraGeometrica2 = figuraGeometrica2;
        this.coordenadaX1 = coordenadaX1;
        this.coordenadaY1 = coordenadaY1;
        this.coordenadaX2 = coordenadaX2;
        this.coordenadaY2 = coordenadaY2;
    }

    public void apresenta() {
        System.out.println("coordenadas: (" + coordenadaX1 + ", " + coordenadaY1 + ")");
        figuraGeometrica1.desenha();

        System.out.println("\n");

        System.out.println("coordenadas: (" + coordenadaX2 + ", " + coordenadaY2 + ")");
        figuraGeometrica2.desenha();

        System.out.println("=====================");
    }
}
