package refactoring;

public class Bike {

    public String productName;
    public double price;
    public Integer batteryCapacity;

    /**
     *  get battery capacity.
     * @return batteryCapacity
     */
    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * GetGearsCount for bike.
     * @return unsupportedOperation error
     */
    public int getGearsCount() {
        throw new UnsupportedOperationException("Not Implemented");
    }
}
