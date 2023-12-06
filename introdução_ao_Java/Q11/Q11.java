package Q11;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1, x2, y1, y2;
        System.out.print("Insira o valor de X1: ");
        x1 = input.nextInt();
        System.out.print("Insira o valor de X2: ");
        x2 = input.nextInt();
        System.out.print("Insira o valor de Y1: ");
        y1 = input.nextInt();
        System.out.print("Insira o valor de Y2: ");
        y2 = input.nextInt();

        if(y2>y1 && x2>x1){
            System.out.print("O segundo ponto esta acima e a direita do primeiro ponto!");
        }else if(y2>y1 && x2<x1){
            System.out.print("O segundo ponto esta acima e a esquerda do primeiro ponto!");
        }else if(y2<y1 && x2>x1){
            System.out.print("O segundo ponto esta abaixo e a direita do primeiro ponto!");
        }else if(y2<y1 && x2<x1){
            System.out.print("O segundo ponto esta abaixo e a esquerda do primeiro ponto!");
        }else if(y2==y1 && x2>x1){
            System.out.print("O segundo ponto esta a direita do primeiro ponto!");
        }else if(y2==y1 && x2<x1){
            System.out.print("O segundo ponto esta a esquerda do primeiro ponto!");
        }else if(y2>y1 && x2==x1){
            System.out.print("O segundo ponto esta acima do primeiro ponto!");
        }else if(y2<y1 && x2==x1){
            System.out.print("O segundo ponto esta abaixo do primeiro ponto!");
        }else{
            System.out.println("Ambos os pontos estão no mesma coordenada! ");
        }

        input.close();
    }
}