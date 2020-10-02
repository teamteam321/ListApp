package com.akzaki.listapp.model;

public class List_Item {
    public final int image_id;
    public final String main_text;
    public final String sub_text;

    public List_Item(int image_id, String main_text, String sub_text) {
        this.image_id = image_id;
        this.main_text = main_text;
        this.sub_text = sub_text;
    }
}
