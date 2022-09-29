package com.jewellery;

import com.database.Connect;

public class Jewellery 
{
    private String id;
    private String name;
    private String type;
    private String category;
    private float gold_weight;
    private float silver_weight;
    private float tunch;
    private float pure_gold_weight;
    private float pure_silver_weight;
    private int rate;
    private float labour_charge;
    private int rupess;
    private String date;
    private String description;
    private String image_path;

    public Jewellery(String id, String name, String type, String jewellery_class, float gold_weight, float silver_weight, float tunch, float pure_gold_weight, float pure_silver_weight, int rate, float labour_charge, int rupess, String date, String description, String image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.category = jewellery_class;
        this.gold_weight = gold_weight;
        this.silver_weight = silver_weight;
        this.tunch = tunch;
        this.pure_gold_weight = pure_gold_weight;
        this.pure_silver_weight = pure_silver_weight;
        this.rate = rate;
        this.labour_charge = labour_charge;
        this.rupess = rupess;
        this.date = date;
        this.description = description;
        this.image_path = image;
    }

    public Jewellery(String id, String name, String type, String category, float gold_weight, float silver_weight, float tunch, float pure_gold_weight, float pure_silver_weight, int rate, float labour_charge, int rupess, String date, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.category = category;
        this.gold_weight = gold_weight;
        this.silver_weight = silver_weight;
        this.tunch = tunch;
        this.pure_gold_weight = pure_gold_weight;
        this.pure_silver_weight = pure_silver_weight;
        this.rate = rate;
        this.labour_charge = labour_charge;
        this.rupess = rupess;
        this.date = date;
        this.description = description;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getGold_weight() {
        return gold_weight;
    }

    public void setGold_weight(float gold_weight) {
        this.gold_weight = gold_weight;
    }

    public float getSilver_weight() {
        return silver_weight;
    }

    public void setSilver_weight(float silver_weight) {
        this.silver_weight = silver_weight;
    }

    public float getTunch() {
        return tunch;
    }

    public void setTunch(float tunch) {
        this.tunch = tunch;
    }

    public float getPure_gold_weight() {
        return pure_gold_weight;
    }

    public void setPure_gold_weight(float pure_gold_weight) {
        this.pure_gold_weight = pure_gold_weight;
    }

    public float getPure_silver_weight() {
        return pure_silver_weight;
    }

    public void setPure_silver_weight(float pure_silver_weight) {
        this.pure_silver_weight = pure_silver_weight;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public float getLabour_charge() {
        return labour_charge;
    }

    public void setLabour_charge(float labour_charge) {
        this.labour_charge = labour_charge;
    }

    public int getRupess() {
        return rupess;
    }

    public void setRupess(int rupess) {
        this.rupess = rupess;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    
    public int addJewellery(Connect connect, String id, int id_count)
    {
        return connect.insertJewellery(this, id, id_count);
    }
    
    public Jewellery getJewellery()
    {
        return null;
    }
    
}
