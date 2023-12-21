class Toy extends Goods{
    private String forKidsYears;

    public Toy(String name, double price, String forKidsYears){
        super(name, price);
        this.forKidsYears = forKidsYears;
    }

    public String getForKidsYears() {
        return forKidsYears;
    }

    public void setForKidsYears(String forKidsYears) {
        this.forKidsYears = forKidsYears;
    }
}