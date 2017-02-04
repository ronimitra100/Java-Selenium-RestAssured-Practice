package udemy1.fruz1;

import java.util.List;

public class Apartment {
/*
 {
  "id": "",
  "address": "",
  "price": 0,
  "square": 0,
  "features": [
    ""
  ],
  "active": false
}
Apartment {
id (string, optional),
address (string, optional),
price (number, optional),
square (integer, optional),
features (array[string], optional),
active (boolean, optional)
}
 */
	private String id;
	private String address;
	private double price;
	private int square;
	private List<String> features;
	private boolean active;
	
	public Apartment(){}
	
	public Apartment(String address, double price, int square){
		this.address = address;
		this.price = price;
		this.square = square;
	}
	
	public Apartment(String address, double price, int square, List<String> features, boolean active){
		this.address = address;
		this.price = price;
		this.square = square;
		this.features = features;
		this.active = active;
	}
	
	public void setId(){
		this.id = id;
	}
	
	public void setAddress(){
		this.address = address;
	}
	
	public void setPrice(){
		this.price = price;
	}

	public void setSquare(){
		this.square = square;
	}

	public void setFeatures(){
		this.features = features;
	}
	
	public void setActive(){
		this.active = active;
	}
	////
	public String getId(){
		return id;
	}
	
	public String getAddress(){
		return address;
	}
	
	public double getPrice(){
		return price;
	}

	public int getSquare(){
		return square;
	}

	public List<String> getFeatures(){
		return features;
	}
	
	public boolean getActive(){
		return active;
	}
}
