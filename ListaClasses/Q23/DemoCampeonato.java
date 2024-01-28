public class DemoCampeonato {
    
    public static void main(String[] args) {
        Campeonato time1 = new Campeonato("Time 1");
        Campeonato time2 = new Campeonato("Time 2");
        Campeonato time3 = new Campeonato("time 3");
    
        System.out.print("Partida 1\t");
        time1.disputas(time2);
        System.out.print("Partida 2\t");
        time1.disputas(time3);
        
        System.out.print("Partida 3\t");
        time2.disputas(time3);
        System.out.print("Partida 4\t");
        time2.disputas(time1);
        
        System.out.print("Partida 5\t");
        time3.disputas(time2);
        System.out.print("Partida 6\t");
        time3.disputas(time1);
        
        time1.imprimaTime();
        time2.imprimaTime();
        time3.imprimaTime();
    }
}
