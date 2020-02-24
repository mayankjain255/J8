package com.designpatterns.structural.adapter;


public class TestBuilderAdapter {

  public static void main(String[] args) {
    BuilderImplementation builderImpl = new BuilderImplementation();

    builderImpl.build("house", "Delhi");
    builderImpl.build("Skyscraper", "Gurgaon");
    builderImpl.build("Skyscraper", "Bangalore");
    builderImpl.build("Hotel", "Noida");
  }
}
