package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String hairColor;
    private String gender;
    private Boolean hasSiblings;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.height = Integer.MAX_VALUE;
        this.weight = Integer.MAX_VALUE;
        this.hairColor = "";
        this.gender = "";
        this.hasSiblings = false;

    }

    public Person(int age) {
        this.age = age;


    }

    public Person(String name) {
        this.name = name;


    }



    public Person(String name, int age) {
        this.name = name;
        this.age = age;


    }

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;


    }

    public Person(String gender) {
        this.gender = gender;

    }

    public Person(Boolean hasSiblings) {
        this.hasSiblings = hasSiblings;


    }

    public void setName(String name) {
    this.name = name;

    }

    public void setAge(int age) {
    this.age = age;
    }

    public void setHeight(Integer height){
        this.height = height;
    }

    public void setWeight(Integer weight){
        this.weight = weight;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setHasSiblings(boolean hasSiblings){
        this.hasSiblings = hasSiblings;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }

    public Integer getHeight() {

        return height;

    }

    public Integer getWeight() {

        return weight;

    }

    public String getHairColor() {

        return hairColor;

    }

    public String getGender() {

        return gender;

    }

    public Boolean getHasSiblings() {

        return hasSiblings;

    }

}
