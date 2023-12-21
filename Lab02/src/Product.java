class Product extends Goods{
    private int quantity;

    public Product(String name, double price, int quantity){
        super(name, price);
        this.quantity = quantity;
    }

    public String getName(){
        return name + "перев";
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}