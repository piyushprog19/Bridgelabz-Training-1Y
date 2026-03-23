package question_2;
public class Main {
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 50000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Rice", 1000);

        Product[] products = {p1, p2, p3};

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println("Tax: " + t.getTaxDetails());
            }

            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}