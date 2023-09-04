package edu.dio.methods;

public class Methods {
public static void main(String[] args) {
	SmartTV smartTv = new SmartTV();
	System.out.println("What is the channel? " + smartTv.channel);
	System.out.println("TV is On? " + smartTv.on);
	System.out.println("At what Volume? " + smartTv.volume);
	smartTv.turnOn();
	System.out.println("And now Tv is On ? " + smartTv.on);
	smartTv.turnOff();
	System.out.println("And now Tv is On ? " + smartTv.on);
	smartTv.increaseVolume();
	System.out.println("At what Volume? " + smartTv.volume);
	smartTv.decreaseVolume();
	System.out.println("At what Volume? " + smartTv.volume);
	smartTv.changeChannel(13);
	System.out.println(smartTv.channel);
	smartTv.nextChannel();
	smartTv.nextChannel();
	smartTv.previousChannel();
	System.out.println("Actual Channel: " + smartTv.channel);
}
}

