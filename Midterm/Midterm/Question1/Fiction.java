package Question1;

abstract class Fiction extends Book implements iBorrowable{

    public Fiction(String title, double price, String publishYear){
        super(title,price,publishYear);
        //this.title = title;
        //this.price = price;
        //this.publishYear = publishYear;

    }
    @Override
    String description() {
        return this.title + "all events are imaginary and not based on real facts";
    }

    @Override
    public void setBorrowDate(int day) {
       this.borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate = day;
    }

    @Override

    public boolean isAvailable(int day) {
            if(borrowDate <= day && day <= returnDate) return false;
            return true;
    }
}
