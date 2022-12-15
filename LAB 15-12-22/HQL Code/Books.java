package com.hibernatehqllab.hibernatehqllabcode;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	private int BookId;
	private String BName;
	private int Price;
	
    public Books() {
		
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBName() {
		return BName;
	}

	public void setBName(String bName) {
		BName = bName;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Books [BookId=" + BookId + ", BName=" + BName + ", Price=" + Price + "]";
	}
    
}
