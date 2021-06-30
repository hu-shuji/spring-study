package com.example.mytest.bean;




public class UserBean {
    private int id;
    private String name;
    private String password;
    private int score;
    public int getId(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score=score;
    }
}
