package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	public TV(Marca e_marca,boolean e_estado) {
		marca=e_marca;
		estado=e_estado;
		numTV++;
	}
	
	public void setMarca(Marca n_marca) {
		marca=n_marca;
	}
	
	public void setControl(Control n_control) {
		control=n_control;
	}
	
	public void setPrecio(int n_precio) {
		precio=n_precio;
	}
	
	public void setVolumen(int n_volumen) {
		if((estado==true) && (n_volumen>=0 && n_volumen<=7)) {
			volumen=n_volumen;
		}
	}
	
	public void setCanal(int n_canal) {
		if ((estado==true) && (n_canal>=1 && n_canal<=120)) {
			canal=n_canal;
		}
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void turnOn() {
		estado=true;
	}
	
	public void turnOff() {
		estado=false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	 
	public void canalUp() {
		if (estado==true) {
			if (canal==120) {
				return;
			}else {
				canal++;
			}
		}	
	}
	
	public void canalDown() {
		if (estado==true) {
			if (canal==1) {
				return;
			} else {
				canal--;
			}
		}
	}
	
	public void volumenUp() {
		if (estado==true) {
			if (volumen==7) {
				return;
			}else {
				volumen++;
			}
		}	
	}
	
	public void volumenDown() {
		if (estado==true) {
			if (volumen==0) {
				return;
			} else {
				volumen--;
			}
		}
	}
	
	public static void setNumTV(int n_num) {
		numTV=n_num;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	
	
	
	
}
