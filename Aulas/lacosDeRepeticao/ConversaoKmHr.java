import java.text.DecimalFormat;

public class ConversaoKmHr {
    public static void main(String[] args) {
        double kmph = 0.0, ms, mh, ps;

        System.out.println("Km/h\tm/s\tm/h\tp/s");
        while (kmph <= 50.0) {
            ms = kmph * 0.2778;
            mh = kmph * 0.6214;
            ps = kmph * 0.9113;
            // System.out.printf("%.3g\t%.3g\n", kmph, ms);
            System.out.println(new DecimalFormat("00.00").format(kmph) + 
            "\t" + new DecimalFormat("00.00").format(ms) +
            "\t" + new DecimalFormat("00.00").format(mh) +
            "\t" + new DecimalFormat("00.00").format(ps));
            kmph += 0.5;
        }

    }
    
}
