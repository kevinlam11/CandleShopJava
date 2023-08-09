public class Candle {
    private String name;
    private int quantity;
    private int burnTime; // in hours
    private double price;

    public Candle(String name, int quantity, int burnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBurnTime() {
        return burnTime;
    }

    public double getPrice() {
        return price;
    }
}
