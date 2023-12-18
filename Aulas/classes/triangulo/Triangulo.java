public class Triangulo {
    double l1;
    double l2;
    double l3;
    String desc;
    
    void inicializaTriangulo(double lado1, double lado2, double lado3, String descricao){
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = descricao;
    }

    double perimetro(){
        return l1+l2+l3;
    }
}
