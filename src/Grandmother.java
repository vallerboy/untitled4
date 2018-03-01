import java.util.ArrayList;
import java.util.List;

public class Grandmother {
    public static void main(String[] args) {
        String text = "Śliwki:30:2.5/Masło:20:6.20/Kapusta:2:3/Jabłka:5:4/Margaryna:10:20/Śliwki:10:2.5/Majonez:8:4/Jabłka:10:4/Kapusta:5:3/Śliwki:20:3.20/Masło:2:3.33/Kiełbasa:2:4.44/Ciasto:4:2.22";
        Product[] productList;

        String[] products = text.split("/");
        productList = new Product[products.length];

        String[] productOne;

        int counter = 0;
        for (String product : products) {
            productOne = product.split(":");
            productList[counter] = (new Product(productOne[0],
                    Integer.parseInt(productOne[1]),
                    Float.parseFloat(productOne[2])));
            counter++;
        }

        float maxPrice = 0;
        for (Product product : productList) {
            if(product.getPrice() > maxPrice){
                maxPrice = product.getPrice();
            }
        }

        System.out.println("Najdrozszy produkt kosztuje: " + maxPrice);
    }

    public static class Product{
        private String name;
        private int quantity;
        private float price;

        public Product(String name, int quantity, float price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public float getPrice() {
            return price;
        }
    }
}
