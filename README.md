# Candle Shop Program in Java

This Java program manages inventory, sales, and customer information for a Candle Shop. It allows users to add, update, and view candle stock, track sales, manage customers, and generate reports. The program utilizes a console-based user interface and file handling to persist data.

## How to Run

Follow these steps to run the Candle Shop program:

1. **Prerequisites:** Before you begin, ensure you have the following:

   - Java Development Kit (JDK)
   - IntelliJ

2. **Getting Started:**

   - Clone or download this repository to your local machine.
   - Open the project in your preferred IDE or IntelliJ.

3. **Compile and Run:**

   - Open a terminal or command prompt.
   - Navigate to the directory where you saved the project files.
   - Compile the Java files: `javac CandleShopApp.java`
   - Run the program: `java CandleShopApp`

   The program will execute and provide you with a console-based interface to interact with the Candle Shop.


## Table of Contents


- [Getting Started](#getting-started)
- [Classes](#classes)
    - [Candle Class](#candle-class)
    - [Inventory Class](#inventory-class)
    - [Sales Class](#sales-class)
    - [Customer Class](#customer-class)
- [Running the Program](#running-the-program)

## Getting Started

1. Clone or download this repository to your local machine.
2. Open the project in your preferred IDE or text editor.

## Classes

### Candle Class

The `Candle` class represents a type of candle and its properties:

- `name` (String): Name of the candle.
- `quantity` (int): Quantity available in stock.
- `burnTime` (double): Estimated burn time in hours.
- `dollarPerBurnTime` (double): Cost benefit per hour of usage.
- `price` (double): Price of the candle.

### Inventory Class

The `Inventory` class manages the candle inventory:

- `candles` (List of Candle): List of available candles.

### Sales Class

The `Sales` class tracks sold candles:

- `soldCandles` (List of Candle): List of sold candles.

### Customer Class

The `Customer` class represents a customer:

- `name` (String): Name of the customer.
- `address` (String): Address of the customer.
- `phone` (String): Phone number of the customer.

## Running the Program

1. Compile the Java files: `javac CandleShopApp.java`
2. Run the program: `java CandleShopApp`

---

This README provides a comprehensive guide to the Candle Shop program. 