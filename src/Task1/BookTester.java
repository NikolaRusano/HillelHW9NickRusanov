package Task1;

import java.util.ArrayList;

public class BookTester {

    public static void main(String[] args) {
        Book book1 = new Book(500.50,"The Dark Tower", 700, "hard");
        Book book2 = new Book(1750.50,"CLR via C#", 900, "hard");
        Book book3 = new Book(22.50,"Fury", 125, "soft");
        Book book4 = new Book(50.50,"To Kill a Mockingbird", 300, "soft");
        Book book5 = new Book(75.50,"Souls of the Black People", 350, "soft");
        Book book6 = new Book(95.50,"Gamlet", 200, "hard");
        Book book7 = new Book(105.50,"Frankenstein", 377, "hard");
        Book book8 = new Book(350.50,"Song of Solomon", 420, "hard");
        Book book9 = new Book(175.50,"Over the cuckoo's nest", 200, "hard");
        Book book10 = new Book(250.50,"В поисках утраченного времени", 300, "hard");
        ArrayList<Book>bookCollection = new ArrayList<>();
        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover  = new ArrayList<>();
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);
        bookCollection.add(book4);
        bookCollection.add(book5);
        bookCollection.add(book6);
        bookCollection.add(book7);
        bookCollection.add(book8);
        bookCollection.add(book9);
        bookCollection.add(book10);

        System.out.println("All books: \n");
        for(Book book:bookCollection) {
            System.out.println("Title " + book.getTitle() + " with " + book.getQuantityOfPages() + " pages" + " with $ " + book.getPrice() + " cover " + book.getCoverType());
        }
       //System.out.println("All books: \n");
        for(Book book:booksWithSoftCover) {
            System.out.println("Title " + book.getTitle() + " with " + book.getQuantityOfPages() + " pages" + " with $ " + book.getPrice() + " cover " + book.getCoverType());
        }
        //System.out.println("All books: \n");
        for(Book book:booksWithHardCover) {
            System.out.println("Title " + book.getTitle() + " with " + book.getQuantityOfPages() + " pages" + " with $ " + book.getPrice() + " cover " + book.getCoverType());
        }


        for(Book book:bookCollection){
            if (book.getCoverType() == "soft"){
                System.out.println("Title " + book.getTitle() + " with " + book.getQuantityOfPages() + " pages" + " with $ " + book.getPrice() + " cover " + book.getCoverType());
                System.out.println(booksWithSoftCover.add(book));


            }else if (book.getCoverType() == "hard"){
                System.out.println("Title " + book.getTitle() + " with " + book.getQuantityOfPages() + " pages" + " with $ " + book.getPrice() + " cover " + book.getCoverType());
                System.out.println(booksWithHardCover.add(book));

            }
        }


        System.out.println("\nSoft cover books\n");
        for(Book book:booksWithSoftCover){
            System.out.println("Title " + book.getTitle() + " with " + book.getQuantityOfPages() + " pages" + " with $ " + book.getPrice() + " cover " + book.getCoverType());
        }
        System.out.println("\nHard cover books\n");
        for(Book book:booksWithSoftCover){
            System.out.println("Title " + book.getTitle() + " with " + book.getQuantityOfPages() + " pages" + " with $ " + book.getPrice() + " cover " + book.getCoverType());
        }

    }
}
