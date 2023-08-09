import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CandleShop candleShop = new CandleShop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Candle Shop Management System =====");
            System.out.println("1. Add Candle");
            System.out.println("2. Sell Candles");
            System.out.println("3. View Inventory");
            System.out.println("4. Generate Receipt");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    candleShop.addCandle();
                    break;
                case 2:
                    candleShop.sellCandles();
                    break;
                case 3:
                    candleShop.viewInventory();
                    break;
                case 4:
                    candleShop.generateReceipt();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

