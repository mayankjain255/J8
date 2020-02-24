package com.designpatterns.structural.adapter;


public class HouseBuilder implements AdvancedBuilder {

  public void buildHouse(String location) {
    System.out.println("Building a house located in the " + location + " area!");
  }

  public void buildSkyscraper(String location) {
    //don't implement
  }
}