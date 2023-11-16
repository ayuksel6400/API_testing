package test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C8_JSONArrayKullanimi {

    /*
{
"firstName": "John",
"lastName": "doe",
"age": 26,
"address": {
    "streetAddress": "naist street",
    "city": "Nara",
    "postalCode": "630-0192"
            },
"phoneNumbers": [
                {
                    "type": "iPhone",
                    "number": "0123-4567-8888"
                },
                {
                    "type": "home",
                    "number": "0123-4567-8910"
                }
                ]
}
 */
    @Test
    public void jSonArray(){
        JSONObject ceptel = new JSONObject();
        ceptel.put("type","iPhone");
        ceptel.put("number","0123-4567-8888");

        JSONObject evtel = new JSONObject();
        evtel.put("type","home");
        evtel.put("number","0123-4567-8910");

        JSONArray phoneNumbers = new JSONArray();
        phoneNumbers.put(0,ceptel);
        phoneNumbers.put(1,evtel);

        JSONObject adres = new JSONObject();
        adres.put("streetAddress","naist street");
        adres.put("city","Nara");
        adres.put("postalCode","630-0192");

        JSONObject personelInfo = new JSONObject();
        personelInfo.put("firstName","John");
        personelInfo.put("lastName","Doe");
        personelInfo.put("age",26);
        personelInfo.put("address",adres);
        personelInfo.put("phoneNumbers",phoneNumbers);

        System.out.println("personelInfo : " + personelInfo);
        System.out.println("personel First Name: " + personelInfo.get("firstName"));
        System.out.println("personel Last Name: " + personelInfo.get("lastName"));
        System.out.println("personel Adress-Street: " + personelInfo.getJSONObject("address").get("streetAddress"));
        System.out.println("personel Phone Number: " + personelInfo.getJSONArray("phoneNumbers").getJSONObject(0).get("number"));
        System.out.println("personel Phone Number: " + personelInfo.getJSONArray("phoneNumbers").getJSONObject(1).get("number"));
        System.out.println("personel Phone Type: " + personelInfo.getJSONArray("phoneNumbers").getJSONObject(1).get("type"));


    }


}
