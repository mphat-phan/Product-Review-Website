/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SENDO;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
 
/**
 * This is a first step in restful flow. We must authorize first and use the token for other request.
 */
public class searchSENDO {
 HashMap<Integer,productSENDO> listproduct=new HashMap<>();
    public searchSENDO(String s) {
        String url="https://searchlist-api.sendo.vn/web/products?page=1&size=10&sortType=rank&q="+s;
        try {
            Connection.Response res = Jsoup.connect(url).method(Connection.Method.GET).ignoreContentType(true).header("referer", "https://www.sendo.vn/").execute();
            Document doc =res.parse();
            JSONArray jsa= new JSONObject(doc.text()).getJSONArray("data");
            for(int i=0;i<jsa.length();i++)
                listproduct.put(i, new productSENDO(jsa.getJSONObject(i)));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public productSENDO getproduct(int i){
        return listproduct.get(i);
    }

    public HashMap<Integer, productSENDO> getListproduct() {
        return listproduct;
    }
}

