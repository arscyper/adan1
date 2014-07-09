package com.app.prayer.time.client;


public class GeoTimeZone {
	
	private double _longitude;
	private boolean isLongNegative = false;
	public GeoTimeZone(double latitude, double longitude){
		_longitude = longitude;
		isLongNegative = (_longitude < 0) ? true : false;
	}
	
	public int timezone(){
		double degree = 0;
		int timezone = 0;
		if(isLongNegative){
			_longitude = Math.abs(_longitude);
		}
		for(int i = 0; i <= 12;i++){
			if(_longitude < degree){
				timezone = i;
				break;
			}
			degree += 15;	
		}
		return (!isLongNegative) ? timezone : (timezone * -1);
	}
	
	public boolean isDst(){
		boolean res = false;
		//Date d = new Date();
		//d.getTimezoneOffset();
		return res;
	}
	
	public static void main(String[] args) {
		GeoTimeZone g = new GeoTimeZone(41.926821, -73.996886);
		
		System.out.println(g.timezone());

	}

}
