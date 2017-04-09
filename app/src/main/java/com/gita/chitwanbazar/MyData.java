package com.gita.chitwanbazar;

/**
 * Created by adv on 4/3/2017.
 */

public class MyData {
    String name,price;
    Integer imagep;

    public MyData(String name, String price, Integer imagep) {
        this.name = name;
        this.price = price;
        this.imagep = imagep;
    }

    public MyData(int i, String name, String s) {
        this.imagep=i;
        this.name=name;
        this.price=s;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Integer getImagep() {
        return imagep;
    }
}
