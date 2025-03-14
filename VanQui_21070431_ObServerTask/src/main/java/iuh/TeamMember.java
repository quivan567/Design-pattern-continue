package iuh;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Thanh vien " + name + "Nhan duoc thong bao: " + message);
    }
}
