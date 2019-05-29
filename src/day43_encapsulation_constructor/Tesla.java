package day43_encapsulation_constructor;

public class Tesla {
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	
	

	public String toString() {
		return "Tesla model = " + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving;
	}

	public boolean isValidModel(String model) {
		model = model.toLowerCase();
		if (model.equals("model s") || model.equals("model x") || model.equals("model 3") || model.equals("model y")
				|| model.equals("Roadster")) {
			return true;
		} else {
			return false;
		}

	}

	public void setModel(String model) {
		if (isValidModel(model)) {
			this.model = model;
		} else {
			System.out.println(model + " is unknown");
		}
	}

	public void setInfo(String model, int range, double zeroTo60, double price, boolean isSelfDriving) {
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(isSelfDriving);
	}
	

	public String getModel() {
		return model;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getRange() {
		return range;
	}

	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSelfDriving() {
		return selfDriving;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}

}
