package com.designpatterns.structural.adapter2;


public class LedTV implements Monitor {

  public void display(String message) {
    System.out.println("The message " + message + " is displaying on LeDTV");

  }

}
