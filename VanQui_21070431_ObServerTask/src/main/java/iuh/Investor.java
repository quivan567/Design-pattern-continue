package iuh;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Nha dau tu " + name + "Nhan duoc thong bao: " + message);
    }
}
