public class Main {
    public static void main(String[] args) {

        double purchasePrice = 5;
        final double tax_rate = 0.05;
        double salesTax = 0;

        System.out.print("The price of your purchase is: $" + purchasePrice );
        salesTax = purchasePrice * tax_rate;
        System.out.println("\nSales Tax is at 5% so your tax is: $" + salesTax);




    }
}