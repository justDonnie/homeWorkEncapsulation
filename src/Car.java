public class Car {
    private String brandName;
    private String model;
    private int maxSpeed;
    private int numSeats;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public String toString() {
        return "Car: " +
                "brandName: " + brandName + '\'' +
                "model: " + model + '\'' +
                "maxSpeed: " + maxSpeed +
                "numSeats: " + numSeats ;
    }
}