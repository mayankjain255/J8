package com.designpatterns.structural.adapter;


public class BuilderImplementation implements Builder {

  BuilderAdapter builderAdapter;

  public void build(String type, String location) {
    if (type.equalsIgnoreCase("House") || type.equalsIgnoreCase("Skyscraper")) {
      builderAdapter = new BuilderAdapter(type);
      builderAdapter.build(type, location);
    }
    else {
      System.err.println("Unable to build " + type + " building");
    }
  }
}