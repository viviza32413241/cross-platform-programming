class DairyProduct extends Goods{
    private String expirationDate;

    public DairyProduct(String name, double price, String expirationDate){
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate(){
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
