package com.designpatterns.structural.proxy;


public class RealInternet implements Internet {

  public void connectTo(String serverHost) {
    System.out.println("Connecting to " + serverHost);
    try {
      Thread.sleep(1000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Connected to " + serverHost);
  }
}
