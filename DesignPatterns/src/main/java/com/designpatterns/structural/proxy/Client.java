package com.designpatterns.structural.proxy;


public class Client {

  public static void main(String[] args) {
    Internet internet = new ProxyInternet();
    try {
      internet.connectTo("quovantis.com");
      Thread.sleep(500);
      internet.connectTo("abc.com");
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
