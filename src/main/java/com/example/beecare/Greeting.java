
package com.example.beecare;

public class Greeting {

	private final long id;
	private final String quote;

	public Greeting(long id, String quote) {
		this.id = id;
		this.quote = quote;
	}

	public long getId() {
		return id;
	}

	public String getQuote() {
		return quote;
	}
}