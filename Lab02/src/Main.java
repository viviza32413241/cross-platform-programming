public class Main {
    public static void main(String[] args) {
        Toy toy = new Toy("Лего", 329.49, "3+");
        System.out.println("Іграшка: " + toy.getName() + ", ціна: " + toy.getPrice() + ", для дітей віком: " + toy.getForKidsYears());

        Product product = new Product("Яблуко", 10.99, 3);
        System.out.println("Продукт: "+ product.getName() + ", ціна: " + product.getPrice() + ", кількість: " + product.getQuantity());

        DairyProduct dairyProduct = new DairyProduct("Сир", 49.99, "20-10-2023");
        System.out.println("Молочний продукт: " + dairyProduct.getName() + ", ціна: " + dairyProduct.getPrice() + ", вжити до: " + dairyProduct.getExpirationDate());
    }
}