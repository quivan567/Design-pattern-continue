package iuh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        XMLData xmlData = new XMLData();

        XMLToJSONAdapter adapter = new XMLToJSONAdapter(xmlData);
        String jsonData = adapter.getJSON();

        JSONService jsonService = new JSONService();
        jsonService.processData(jsonData);
    }
}
