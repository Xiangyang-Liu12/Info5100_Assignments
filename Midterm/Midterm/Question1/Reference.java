package Question1;

public class Reference extends Book{
    String category;

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public Reference(String title, double price, String publishYear, String category){
        super(title, price, publishYear);
        this.category = category;
    }
    @Override
    String description() {
        return this.title + "all information is real";
    }
}
