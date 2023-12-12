package Aulas.classes;

public class Data {
    int dia;
    int mes;
    int ano;

    boolean dataEhValida(){
        return (dia >= 1 && dia <= 31 &&  mes >= 1 && mes <= 12 && ano >=0);
    }

    void inicializaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

    void mostraData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
