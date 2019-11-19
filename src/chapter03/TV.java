package chapter03;

import paint.Point;

public class TV {

	private int channel;
	private int volume;
	private boolean power;

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	public TV() {
		
	}


	public TV(boolean power, int channel, boolean channel2, int volume, boolean volume2) {
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}
	
	public void power(boolean on) {	
		this.power = on;
	}
	public void volume(int volume) {
		if(!power) {
			return;
		}
		this.volume = volume;
	}
	
	public void volume(boolean volume) {
//		if(up) {
//			volume(volume + 1);
//		} else {
//			volume(volume - 1);
//		}
		
		
		volume( volume + (up ? 1 : -1));
		
	}
	public void channel(int channel) {	
		if(!power) {
			return;
		}	
		if(channel < 1) {
			channel = 255;
		} else if(channel > 255) {
			channel = 1;
		}
		this.channel = channel;
		
	}
	public void channel(boolean up) {
		channel( channel + (up ? 1 : -1)); 	
		
		
	}	
}
//
//public static void drawPoint(Point point) {
//		public void show() {
//System.out.println("점[" + x + ", " + y + "]을 그렸습니다.");
//}
//}
