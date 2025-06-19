package refactoring;

public class Bike {

    protected String productName;
    protected double price;
    protected Integer batteryCapacity;
    protected int maxSpeed;
    protected int rearGearsCount;
    protected int frontGearsCount;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getRearGearsCount() {
        return rearGearsCount;
    }

    public void setRearGearsCount(int rearGearsCount) {
        this.rearGearsCount = rearGearsCount;
    }

    public int getFrontGearsCount() {
        return frontGearsCount;
    }

    public void setFrontGearsCount(int frontGearsCount) {
        this.frontGearsCount = frontGearsCount;
    }

    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
