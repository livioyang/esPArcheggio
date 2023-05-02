import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Parcheggio s = new Parcheggio();
        List<Macchina> codaMacchine = new ArrayList<>();
        codaMacchine.add(new Macchina("M1",s));
        codaMacchine.add(new Macchina("M2",s));
        codaMacchine.add(new Macchina("M3",s));
        codaMacchine.add(new Macchina("M4",s));
        codaMacchine.add(new Macchina("M5",s));
        codaMacchine.add(new Macchina("M6",s));
        codaMacchine.add(new Macchina("M7",s));
        codaMacchine.add(new Macchina("M8",s));

        for (Macchina p : codaMacchine) {
            p.start();
        }
    }
}
