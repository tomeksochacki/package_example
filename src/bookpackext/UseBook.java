package bookpackext;

class UseBook {
    public static void main(String[] args) {
        bookpack.Book books[] = new bookpack.Book[5];
        books[0] = new bookpack.Book("Java. Przewodnik", "Shildt", 2012);
        books[1] = new bookpack.Book("Java FX", "Shildt", 2018);
        books[2] = new bookpack.Book("Introducting", "Shildt", 2017);
        books[3] = new bookpack.Book("Stan zagrożenia", "Clancy", 2019);
        books[4] = new bookpack.Book("Ogniem i mieczem", "Sienkiewicz", 2019);

        for (int i = 0; i<books.length; i++){
            System.out.println(books[i]);
            books[i].show();
        }
    }
}
