package edu.mu;

public class MediaProduct {
	private String title;

	private String getTitle() {
		return title;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private double getPrice() {
		return price;
	}
	private void setPrice(double price) {
		this.price = price;
	}
	private int getYear() {
		return year;
	}
	private void setYear(int year) {
		this.year = year;
	}
	private Genre getGenre() {
		return genre;
	}
	private void setGenre(Genre genre) {
		this.genre = genre;
	}
	private double price;
	private int year;
	private Genre genre;
}
/*
Implement a base class MediaProduct with protected aLributes/fields !tle(String),
price(double), year(int) and genre(Genre). The genre should be represented using an enum.
• Create subclasses VinylRecordProduct, CDRecordProduct, and TapeRecordProduct, each
represenHng a different type of media product. Ensure these classes inherit from MediaProduct
and contain a constructor that uses the super keyword to iniHalize the aLributes.
• Implement copy constructors for each media product to prevent informaHon leaks.
*/
