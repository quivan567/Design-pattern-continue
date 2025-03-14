package iuh;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private List<Table> tables = new ArrayList<>();

    public void addTable(Table table) {
        tables.add(table);
    }

    public double getTotalRevenue() {
        return tables.stream().mapToDouble(Table::getPrice).sum();
    }
}
