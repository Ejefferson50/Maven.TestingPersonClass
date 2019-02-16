package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Integer expectedHeight = Integer.MAX_VALUE;
        Integer expectedWeight = Integer.MAX_VALUE;
        String expectedHairColor = "";
        String expectedGender = "";
        Boolean expectedHasSiblings = true;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Integer actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();
        String actualHairColor = person.getHairColor();
        String actualGender = person.getGender();
        Boolean actualHasSiblings = person.getHasSiblings();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person();

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithHeightAndWeight(){
        //Given
        Integer expectedHeight = 6;
        Integer expectedWeight = 225;

        //When
        Person person = new Person(expectedHeight, expectedWeight);

        //Then
        Integer actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();

        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        //Given
        Person person = new Person();
        Integer expected = 6;

        //When
        person.setHeight(expected);

        //Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetWeight() {
        //Given
        Person person = new Person();
        Integer expected = 225;

        //When
        person.setWeight(expected);

        //Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHairColor() {
        //Given
        Person person = new Person();
        String expected = "brown";

        //When
        person.setHairColor(expected);

        //Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGender() {
        //Given
        Person person = new Person();
        String expected = "Male";

        //When
        person.setGender(expected);

        //Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHasSiblings() {
        //Given
        Person person = new Person();
        Boolean expected = true;

        //When
        person.setHasSiblings(expected);

        //Then
        Boolean actual = person.getHasSiblings();
        Assert.assertEquals(expected, actual);
    }

}
