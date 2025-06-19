package refactoring;

public class Article {

    public Bike bike;
    public int purchaseAmount;

    /**
     * 
     * @param bike
     * @param price
     */
    public Article(Bike bike, int price) {
        this.bike = bike;
        purchaseAmount = price;
    }
}
