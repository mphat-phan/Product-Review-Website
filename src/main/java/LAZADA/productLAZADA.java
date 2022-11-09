/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAZADA;
import org.json.JSONObject;

/**
 *
 * @author Asus
 */
public class productLAZADA {
    int id;
    String name;
    String seller_name;
    int price;
    int discount;
    String image;
    public productLAZADA() {
    }
    public productLAZADA(JSONObject js) {
        this.id = js.getInt("id");
        this.name = js.getString("name");
        //this.seller_name = js.getString("seller_name");
        this.price = js.getInt("default_price_max");
        this.discount = js.getInt("sale_price_max");
        this.image=js.getString("image");
    }

    public int getDiscount() {
        return discount;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
    
}
