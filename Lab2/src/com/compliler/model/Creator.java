package com.compliler.model;

@TableName(name = "creators")
public class Creator {
    private Long id;
    private String name;
    private Integer age;

    public Creator(){}
    public Creator(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
}
