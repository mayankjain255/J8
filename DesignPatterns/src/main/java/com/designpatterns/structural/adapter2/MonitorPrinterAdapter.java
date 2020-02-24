package com.designpatterns.structural.adapter2;


public class MonitorPrinterAdapter implements Monitor {

  Printer printer;

  public MonitorPrinterAdapter(Printer printer) {
    this.printer = printer;
  }

  public void display(String message) {
    printer.print(message);
  }

}
