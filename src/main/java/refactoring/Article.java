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


    public double calculatePrice() {
        double price = 0;
        if (bike instanceof Brompton) {
            if (purchaseAmount > 1) {
                price += (purchaseAmount - 1) * bike.price / 2;
            }
            price += bike.price * purchaseAmount;
        } else if (bike instanceof EBike) {
            price += bike.price * purchaseAmount;
        } else if (bike instanceof Mountainbike) {
            if (purchaseAmount > 2) {
                price += purchaseAmount * bike.price * 9 / 10;
            } else {
                price += bike.price * purchaseAmount;
            }
        }
        if (price > 1000f || price == 1000.0) {
            price = price * 0.8;
        }
        return price;
    }
}
