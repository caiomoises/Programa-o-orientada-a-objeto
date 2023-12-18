package Q23;

import java.util.Random;

public class Campeonato {
    String nome;
    int vitoria;
    int derrota;
    int saldo;
    int empate;
    int pontos;

    public Campeonato(String nome){
        this.nome = nome;
        this.vitoria = 0;
        this.derrota = 0;
        this.saldo = 0;
        this.empate = 0;
        this.pontos = 0;
    }

    void disputas(Campeonato b){
        Random random = new Random();
        int gol1 = random.nextInt(6);
        int gol2 = random.nextInt(6);

        if(gol1 > gol2){
            this.vitoria++;
            this.pontos+=3;
            this.saldo += gol1 - gol2;
            b.derrota++;
            b.saldo -= gol1 - gol2;
        }else if(gol1 < gol2){
            b.vitoria++;
            b.pontos+=3;
            b.saldo+= gol2 - gol1;
            this.derrota++;
            this.saldo -= gol2 - gol1;
        }else{
            this.empate++;
            this.pontos++;
            b.empate++;
            b.pontos++;
        }
        System.out.println(this.nome + " " + gol1 + "X" + gol2 + " " + b.nome);
    }
    void imprimaTime(){
        System.out.println("Nome: " + nome + "\tPontos: " + pontos + "\tVitoria: " + vitoria + "\tEmpates: " + empate);
    }
}
