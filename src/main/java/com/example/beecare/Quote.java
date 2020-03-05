
package com.example.beecare;

public class Quote {
  private String type;
  private Greeting greeting;


  public Quote(long id, String quote) {
    greeting = new Greeting(id, quote);
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Greeting getGreeting() {
    return greeting;
  }

  public void setGreeting(Greeting greeting) {
    this.greeting = greeting;
  }

  @Override
  public String toString() {
    return String.format("ALI BEY %s\t%s\t%d", type, greeting.getQuote(), greeting.getId());
  }

}