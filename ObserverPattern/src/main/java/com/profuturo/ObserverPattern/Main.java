package com.profuturo.ObserverPattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		YoutubeChannel channel = new YoutubeChannel();
		Subscriber s1 = new Subscriber(channel);
		Subscriber s2 = new Subscriber(channel);

		channel.attach(s1);
		channel.attach(s2);

		channel.addNewVideo("Video patron observer");
	}

}
