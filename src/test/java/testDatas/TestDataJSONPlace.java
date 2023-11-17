package testDatas;

import org.json.JSONObject;

public class TestDataJSONPlace {

    public int okStatusKodu = 200;

    public JSONObject expBodyOlusturJSON(){
        JSONObject expBody = new JSONObject();
        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","eos qui et ipsum ipsam suscipit aut" +
                "\nsed omnis non odio" +
                "\nexpedita earum mollitia molestiae aut atque rem suscipit" +
                "\nnam impedit esse");
        return expBody;
    }
}
