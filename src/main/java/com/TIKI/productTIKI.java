/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIKI;

import org.json.JSONObject;

/**
 *
 * @author Asus
 */
public class productTIKI {
    int id;
    String name;
    String seller_name;
    int price;
    int discount_rate;
    int discount;
    int review_count;
    int rating_average;
    String image;

    public productTIKI() {
    }
    public productTIKI(JSONObject js) {
        this.id = js.getInt("id");
        this.name = js.getString("name");
        this.seller_name = js.getString("seller_name");
        this.price = js.getInt("price");
        this.discount_rate = js.getInt("discount_rate");
        this.discount = js.getInt("discount");
        this.review_count = js.getInt("review_count");
        this.rating_average = js.getInt("rating_average");
        this.image=js.getString("thumbnail_url");
    }

    public int getDiscount() {
        return discount;
    }

    public int getDiscount_rate() {
        return discount_rate;
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

    public int getRating_average() {
        return rating_average;
    }

    public int getReview_count() {
        return review_count;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setDiscount_rate(int discount_rate) {
        this.discount_rate = discount_rate;
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

    public void setRating_average(int rating_average) {
        this.rating_average = rating_average;
    }

    public void setReview_count(int review_count) {
        this.review_count = review_count;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
