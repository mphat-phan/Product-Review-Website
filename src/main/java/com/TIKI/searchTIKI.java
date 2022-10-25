/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIKI;

import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Asus
 */
public class searchTIKI {
    HashMap<Integer,productTIKI> listproduct=new HashMap<>();

    public searchTIKI(String s) {
        String url="https://tiki.vn/api/v2/products?limit=10&q="+s;
        try {
            Connection.Response res = Jsoup.connect(url).method(Connection.Method.GET).ignoreContentType(true).execute();
            Document doc =res.parse();
            JSONArray jsa= new JSONObject(doc.text()).getJSONArray("data");
            for(int i=0;i<jsa.length();i++)
                listproduct.put(i, new productTIKI(jsa.getJSONObject(i)));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public productTIKI getproduct(int i){
        return listproduct.get(i);
    }

    public HashMap<Integer, productTIKI> getListproduct() {
        return listproduct;
    }
}
