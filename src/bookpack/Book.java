package bookpack;

public class Book {
    private String title;
    private String author;
    private int pubDate;

    public Book(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }

    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class BookDemo{
    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book("Java. Przewodnik", "Shildt", 2012);
        books[1] = new Book("Java FX", "Shildt", 2018);
        books[2] = new Book("Introducting", "Shildt", 2017);
        books[3] = new Book("Stan zagrożenia", "Clancy", 2019);
        books[4] = new Book("Ogniem i mieczem", "Sienkiewicz", 2019);
    for (int i=0; i<books.length; i++){
        books[i].show();
    }
    }
}
