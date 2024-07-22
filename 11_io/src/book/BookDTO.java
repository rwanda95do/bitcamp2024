package book;

import java.io.Serializable;

public class BookDTO implements Serializable, Comparable<BookDTO>{
	private int code, price, qty, total;
	private String title, author;
	
	public BookDTO() {}
	public BookDTO(int code, String title, String author, int price, int qty) {
		this.code = code;
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
		this.total = price * qty;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return getCode() + "\t " + getTitle() + "\t " + getAuthor() + "\t " + getPrice() + "\t " + getQty()
				+ "\t " + getTotal();
	}
	
	
	// 책 제목으로 오름차순 정렬 
	@Override
	public int compareTo(BookDTO o) {
		
		return this.title.compareTo(o.title);
	}
	
	
	
}
