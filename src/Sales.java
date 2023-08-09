import java.util.ArrayList;
import java.util.List;

public class Sales {
    private List<Candle> soldCandles;

    public Sales() {
        soldCandles = new ArrayList<>();
    }

    public void sellCandle(Candle candle, int quantity) {
        int availableQuantity = candle.getQuantity();
        if (availableQuantity >= quantity) {
            candle.setQuantity(availableQuantity - quantity);
            soldCandles.add(new Candle(candle.getName(), quantity, candle.getBurnTime(), candle.getPrice()));
        } else {
            System.out.println("Insufficient stock for " + candle.getName());
        }
    }

    public List<Candle> getSoldCandles() {
        return soldCandles;
    }
}
