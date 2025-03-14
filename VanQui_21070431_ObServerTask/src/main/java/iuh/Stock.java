package iuh;

public class Stock extends Subject {
    private double price;

    public void setPrice(double price) {
        this.price = price;
        notifyObservers("Gia co phieu thay doi: " + price + "VND");
    }
}
