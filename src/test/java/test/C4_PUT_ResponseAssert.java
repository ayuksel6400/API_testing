package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.Request;

import static io.restassured.RestAssured.given;

public class C4_PUT_ResponseAssert {
    /*
https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki Json formatindaki body ile
    bir PUT request gonderdigimizde
    {
    "title": "Ahmet",
    "body": "Merhaba",
    "userId": 10,
    "userId": 10
    }
    donen Response'un,
    status code'unun 200,
    ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin cloudflare,
    ve status Line'in HTTP/1.1 200 OK olduğunu assert et
 */

    @Test
    public void put01(){
        String url = "https://jsonplaceholder.typicode.com/posts/72";
        JSONObject reqBody = new JSONObject();

        reqBody.put("title", "Ahmet");
        reqBody.put("body", "Merhaba");
        reqBody.put("userId", 10);
        reqBody.put("userId", 10);

        Response response = given()
                            .contentType(ContentType.JSON)
                            .when()
                            .body(reqBody.toString()).put(url);

        response.then().assertThat()
                .statusCode(200)
                .header("Server", "cloudflare")
                .contentType("application/json; charset=utf-8")
                .statusLine("HTTP/1.1 200 OK");







    }
}
