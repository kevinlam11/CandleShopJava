import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Candle> candles;

    public Inventory() {
        candles = new ArrayList<>();
    }

    public void addCandle(Candle candle) {
        candles.add(candle);
    }

    public List<Candle> getCandles() {
        return candles;
    }
}
