package com.myproject.redisdemo.model;

import java.io.Serializable;

public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public Game(String id, String name){
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
