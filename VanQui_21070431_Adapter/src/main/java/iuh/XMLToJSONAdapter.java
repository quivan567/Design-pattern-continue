package iuh;

import org.json.JSONObject;
import org.json.XML;

public class XMLToJSONAdapter {
    private XMLData xmlData;

    public XMLToJSONAdapter(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    public String getJSON() {
        String xml = xmlData.getXML();
        JSONObject jsonObject = XML.toJSONObject(xml);
        return jsonObject.toString();
    }
}
