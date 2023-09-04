package edu.dio.methods;

/**
 * @author Erick
 */
public class SmartTV {
	boolean on = false;
	int channel = 1;
	int volume = 25;

	/**
	 * Esse metodo é usado para ligar a SmartTV
	 * @param on parametro usado para definir o estado da TV
	 */
	public void turnOn() {
		on = true;
	}

	/**
	 * Esse metodo é usado para desligar a SmartTV
	 * @param on parametro usado para definir o estado da TV
	 */
	public void turnOff() {
		on = false;
	}

	public int increaseVolume() {
		return volume++;
	}

	public int decreaseVolume() {
		return volume--;
	}

	public int nextChannel() {
		System.out.println("Actual Channel: " + channel);
		return channel++;
	}

	public int previousChannel() {
		System.out.println("Actual Channel: " + channel);
		return channel--;
	}

	public int changeChannel(int targetChannel) {
		return channel = targetChannel;
	}

}
