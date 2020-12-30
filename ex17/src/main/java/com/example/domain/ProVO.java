package com.example.domain;

import java.util.ArrayList;

public class ProVO {
	private String pcode;
	private String pname;
	private String image;
	private int price;
	
	private ArrayList<String> images;
	

	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ArrayList<String> getImages() {
		return images;
	}
	public void setImages(ArrayList<String> images) {
		this.images = images;
	}
	@Override
	public String toString() {
		return "ProVO [pcode=" + pcode + ", pname=" + pname + ", image=" + image + ", price=" + price + "]";
	}

	
	
	
}
