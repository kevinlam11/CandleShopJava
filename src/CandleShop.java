import java.util.List;
import java.util.Scanner;

public class CandleShop {
    private Inventory inventory;
    private Sales sales;

    public CandleShop() {
        inventory = new Inventory();
        sales = new Sales();

        // Add example candles to the inventory
        Candle candle1 = new Candle("Luscious Lavender", 3, 5, 1.50);
        Candle candle2 = new Candle("Fragrant Floral's", 5, 7, 2.68);
        Candle candle3 = new Candle("Spicy N' Dicey", 2, 12, 1.00);

        inventory.addCandle(candle1);
        inventory.addCandle(candle2);
        inventory.addCandle(candle3);
    }

    public void addCandle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the candle: ");
        String name = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the burn time (in hours): ");
        int burnTime = scanner.nextInt();
        System.out.print("Enter the price: $");
        double price = scanner.nextDouble();

        Candle candle = new Candle(name, quantity, burnTime, price);
        inventory.addCandle(candle);
        System.out.println("Candle added to inventory.");
    }

    public void sellCandles() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Inventory =====");
        viewInventory();

        System.out.print("Enter the index of the candle to sell: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < inventory.getCandles().size()) {
            Candle selectedCandle = inventory.getCandles().get(index);

            System.out.print("Enter the quantity to sell: ");
            int quantity = scanner.nextInt();

            sales.sellCandle(selectedCandle, quantity);
            System.out.println("Candles sold.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void viewInventory() {
        List<Candle> candles = inventory.getCandles();

        for (int i = 0; i < candles.size(); i++) {
            Candle candle = candles.get(i);
            System.out.println("[" + i + "] " + candle.getName() +
                    " - Quantity: " + candle.getQuantity() +
                    " - Price: $" + candle.getPrice());
        }
    }


    public void generateReceipt() {
        List<Candle> soldCandles = sales.getSoldCandles();
        double totalAmountDue = 0;
        int totalBurnTime = 0;
        double totalDollarPerBurnTime = 0;

        System.out.println("===== Receipt =====");
        for (Candle soldCandle : soldCandles) {
            double subtotal = soldCandle.getPrice() * soldCandle.getQuantity();
            totalAmountDue += subtotal;
            totalBurnTime += soldCandle.getBurnTime() * soldCandle.getQuantity();
            totalDollarPerBurnTime += subtotal / (soldCandle.getBurnTime() * soldCandle.getQuantity());

            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(soldCandle.getName());
            System.out.println("Amount: " + soldCandle.getQuantity());
            System.out.println("Burn Time: " + soldCandle.getBurnTime() + " hours");
            System.out.println("Dollar per Burn Time: $" + (soldCandle.getPrice() / soldCandle.getBurnTime()));
            System.out.println("Price: $" + subtotal);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Total Burn Time: " + totalBurnTime + " hours");
        System.out.println("Total Dollar per Burn Time: $" + totalDollarPerBurnTime);
        System.out.println("Total Price: $" + totalAmountDue);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
