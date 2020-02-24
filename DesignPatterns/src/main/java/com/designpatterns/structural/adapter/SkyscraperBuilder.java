package com.designpatterns.structural.adapter;


public class SkyscraperBuilder implements AdvancedBuilder {

  public void buildSkyscraper(String location) {
    System.out.println("Building a skyscraper in the " + location + " area!");
  }

  public void buildHouse(String location) {
    //don't implement
  }
}