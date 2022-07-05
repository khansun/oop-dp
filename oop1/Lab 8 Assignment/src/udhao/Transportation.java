package udhao;

abstract class Transportation {
	double baseFare ;
	double distanceFare;
	double timeFare;
	double promoCut;
	public double getPayable() {
		return payable;
	}
	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}
	public void setDistanceFare(double distanceFare) {
		this.distanceFare = distanceFare;
	}
	public void setTimeFare(double timeFare) {
		this.timeFare = timeFare;
	}
	public void setPromoCut(double promoCut) {
		this.promoCut = promoCut;
	}
	public void setOnlineCut(double onlineCut) {
		this.onlineCut = onlineCut;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	public void setPayable(double payable) {
		this.payable = payable;
	}
	double onlineCut = 0;
	double time;
	double speed;
	double totalFare;
	double payable;
	String online;
	public double getBaseFare() {
		return baseFare;
	}
	public double getDistanceFare() {
		return distanceFare;
	}
	public double getTimeFare() {
		return timeFare;
	}
	public double getPromoCut() {
		return promoCut;
	}
	public double getOnlineCut() {
		return onlineCut;
	}
	public double getTime() {
		return time;
	}
	public String isOnline() {
		return online;
	}
	public void setOnline(String o) {
	this.online =o;
		
	}
	public double getSpeed() {
		return speed;
	}
	public double getTotalFare() {
		return totalFare;
	}
	abstract double getFareCare();
	abstract void bill();
	
}
