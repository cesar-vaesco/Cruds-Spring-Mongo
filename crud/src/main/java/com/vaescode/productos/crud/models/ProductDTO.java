package com.vaescode.productos.crud.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProductDTO {

    @Id
    private String _id;
    private String name;
    private Double price;
    private Date expiry_date;

    /**
     * @return String return the _id
     */
    public String get_id() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Double return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return Date return the expiry_date
     */
    public Date getExpiry_date() {
        return expiry_date;
    }

    /**
     * @param expiry_date the expiry_date to set
     */
    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

}
