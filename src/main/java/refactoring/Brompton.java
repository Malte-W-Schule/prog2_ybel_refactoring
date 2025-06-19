package refactoring;

public class Brompton extends Bike {

    public int maxSpeed;
    public int rearGearsCount;
    public int frontGearsCount;

    public Brompton(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount) {
        this.productName = productName;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.rearGearsCount = rearGearsCount;
        this.frontGearsCount = frontGearsCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public Integer getBatteryCapacity() {
        return null;
    }

    @Override
    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
