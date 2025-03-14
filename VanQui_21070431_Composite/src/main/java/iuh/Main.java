package iuh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        Table table1 = new Table();
        table1.addProduct(new Product("Cà phê", 30000));
        table1.addProduct(new Product("Trà sữa", 50000));

        Table table2 = new Table();
        table2.addProduct(new Product("Nước suối", 15000));
        table2.addProduct(new Product("Sinh tố", 40000));

        cafe.addTable(table1);
        cafe.addTable(table2);

        System.out.println("Doanh thu của quán: " + cafe.getTotalRevenue() + " VND");
    }
}