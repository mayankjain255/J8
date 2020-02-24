package com.designpatterns.structural.adapter;


public class BuilderAdapter implements Builder {

  AdvancedBuilder advancedBuilder;

  public BuilderAdapter(String type) {
    if (type.equalsIgnoreCase("House")) {
      advancedBuilder = new HouseBuilder();
    }
    else if (type.equalsIgnoreCase("Skyscraper")) {
      advancedBuilder = new SkyscraperBuilder();
    }
  }

  public void build(String type, String location) {
    if (type.equalsIgnoreCase("House")) {
      advancedBuilder.buildHouse(location);
    }
    else if (type.equalsIgnoreCase("Skyscraper")) {
      advancedBuilder.buildSkyscraper(location);
    }
  }
}
