public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.loadProductsFromCSV("Products.csv");

        // Display loaded products
        System.out.println("Loaded Products:");
        for (Product product : store.getProducts()) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }

        // Add a customer
        Customer customer1 = new Customer(1, "John Doe", "john.doe@example.com", "123 Main St", "123-456-7890");
        store.addCustomer(customer1);

        // Place an order
        Order order1 = new Order(1, customer1.getId());
        order1.addProduct(store.getProducts().get(0)); // Adding the first product to the order
        store.placeOrder(order1);

        // Display report
        store.generateReport();
    }
}
