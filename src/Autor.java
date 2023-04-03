import java.time.LocalDate;

public class Autor {
    public String name;
    public String sureName;
    public int kolRitterBook;

    @Override
    public String toString() {
        return "name= " + name + "," + "sureName= " + sureName + "," + "kolRitterBook= " + kolRitterBook ;
    }

    public Autor(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
        this.kolRitterBook = 0;
    }

    public Book newBook(String title) {
        Book newBook = new Book("Cat", this, LocalDate.now().getYear());
        return newBook;
    }
}


