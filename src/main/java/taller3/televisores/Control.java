package taller3.televisores;

public class Control {
	TV tv;
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int n_canal) {
		tv.setCanal(n_canal);
	}
	
	public void enlazar(TV tele){
		tv=tele;
		tv.setControl(this);
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void setTv(TV n_tv) {
		tv=n_tv;
	}
}