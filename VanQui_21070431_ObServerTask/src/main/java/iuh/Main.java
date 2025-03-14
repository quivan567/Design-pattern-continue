package iuh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Investor investor1 = new Investor("Nguyễn Văn A");
        Investor investor2 = new Investor("Trần Thị B");
        stock.attach(investor1);
        stock.attach(investor2);
        stock.setPrice(50000);

        TaskManager taskManager = new TaskManager();
        TeamMember member1 = new TeamMember("Lê Văn C");
        TeamMember member2 = new TeamMember("Phạm Thị D");
        taskManager.attach(member1);
        taskManager.attach(member2);
        taskManager.setTaskStatus("Hoàn thành");
    }
}