package Uchet;

import java.util.ArrayList;

public class Order {
        private int id;
        public Buyer buyer;
        private ArrayList<Product> products = new ArrayList<>();

        public void setBuyer(Buyer buyer){this.buyer = buyer;}

        public void setProducts(Product product){products.add(product);}

        public Buyer getBuyer(){return buyer;}

        public ArrayList<Product> getProduct(){return products;}

        public int getId(){return id;}

        public void setId(int id){this.id = id;}


}
