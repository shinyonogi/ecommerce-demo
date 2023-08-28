package com.visional24.ecsite.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//@Entityアノテーションは、このクラスがエンティティであり、JPAによってDBのテーブルとして管理されるということを示す。
@Entity
public class Product {

    /*
    @IDアノテーションは、エンティティのユニークなIDであることを示す。
    @GeneratedValueアノテーションは、主キーの生成戦略を指定する。
    Strategy = によって戦略を定義。(オプションは幾つか存在する)
    GenerationType.IDENTITY 戦略は、データベースの自動インクリメントカラムを使用してIDを生成する。
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private String description;

    //JPAはデフォルトのコンストラクタを必要とする。
    public Product() {}

    //カスタムコンストラクタを定義しても良い。
    public Product(long id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //GetterとSetterを定義。

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
