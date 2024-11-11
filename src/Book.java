public class Book {
    public String bookCode;
    public String name;
    public double price;
    public String author;

    public Book(String bookCode, String author, double price, String name) {
        this.bookCode = bookCode;
        this.author = author;
        this.price = price;
        this.name = name;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceDiscount() {
        return price;
    }
}

