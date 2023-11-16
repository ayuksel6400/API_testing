package test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C10_Get_ExpectedDataHazirlama {
        /*
 https://jsonplaceholder.typicode.com/posts/22 url'ine
 bir GET request yolladigimizda donen response body'sinin
 asagida verilen ile ayni oldugunu test ediniz

Response body :
 {
 "userId":3,
 "id":22,
 "title":"dolor sint quo a velit explicabo quia nam",
 "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse"
 }
  */
    @Test
    public void getExp(){

        String url = "https://jsonplaceholder.typicode.com/posts/22";

        JSONObject exBody = new JSONObject();
        exBody.put("userId",3);
        exBody.put("id",22);
        exBody.put("title","dolor sint quo a velit explicabo quia nam");
        exBody.put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse");

        Response response = given().when().get(url);
        JsonPath respJP = response.jsonPath(); // Dönen cevabı karşılaştırmak için cevabı bir JSONPath
        // objesinin içine yerleştirdik.

        Assert.assertEquals(exBody.get("userId"),respJP.get("userId"));
        Assert.assertEquals(exBody.get("id"),respJP.get("id"));
        Assert.assertEquals(exBody.get("title"),respJP.get("title"));
        Assert.assertEquals(exBody.get("body"),respJP.get("body"));






    }





}
