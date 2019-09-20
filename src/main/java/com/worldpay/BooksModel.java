package com.worldpay;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BooksModel {
	@Id
private int bNo;
private String bAuthor;
private String bName;
private int bPrice;
public int getbNo() {
	return bNo;
}
public void setbNo(int bNo) {
	this.bNo = bNo;
}
public String getbAuthor() {
	return bAuthor;
}

public void setbAuthor(String bAuthor) {
	this.bAuthor = bAuthor;
}
public String getbName() {
	return bName;
}
public void setbName(String bName) {
	this.bName = bName;
}
public int getbPrice() {
	return bPrice;
}
public void setbPrice(int bPrice) {
	this.bPrice = bPrice;
}
public BooksModel(int bNo, String bAuthor, String bName, int bPrice) {
	super();
	this.bNo = bNo;
	this.bAuthor = bAuthor;
	this.bName = bName;
	this.bPrice = bPrice;
}


}
