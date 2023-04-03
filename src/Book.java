public class Book {
    public String nameBook;
    public Autor autor;
    public int year;
    public int rating;
    public String text;

    @Override
    public String toString() {
        return nameBook + ", " + autor + ", " + year + ", " + rating + ", " +text;
    }

    public Book(String nameBook, Autor autor, int year){
        this.nameBook = nameBook;
        this.autor = autor;
        this.year = year;
        this.rating = 3;
        this.text = " ";
    }
    public void up() {
        if (rating < 5) {
            rating++;
        }
    }
    public void down() {
        if (rating > 0) {
            rating--;
        }
    }
    public void append(String moreText){
        text += moreText;
    }
}
