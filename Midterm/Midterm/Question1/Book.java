package Question1;

public  abstract class Book {
    String title;
    double price;
    String publishYear;

    public int borrowDate;
    public int returnDate;

    public Book(String title, double price, String publishYear){
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getPublishYear() {
        return publishYear;
    }

    abstract String description();
}
