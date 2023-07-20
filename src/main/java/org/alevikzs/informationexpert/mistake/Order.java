package org.alevikzs.informationexpert.mistake;

class Order {
    private final Product product;
    private final int count;

    public Order(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
