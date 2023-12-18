public class Q13 {
    public static void main(String[] args) {
        System.out.println("==================================mega-sena=================================");
        for(int j=0; j<4; j++){
            for(int i=1; i <=10; i++){
                System.out.print("|" + i + "|\t");
            }
    
            System.out.println("\n");
    
            for(int i=11; i<= 60; i++){
                System.out.print("|" + i + "|\t");
                if(i % 10 == 0){
                    System.out.println("\n");
                }
            }
            System.out.println("");
        }
    }
}
