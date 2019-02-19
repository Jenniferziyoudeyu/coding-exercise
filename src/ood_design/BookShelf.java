package ood_design;

public class BookShelf {
    String id;
    Layer[] layers;
    public BookShelf(String id) {
        this.id = id;
    }

    public boolean add(Book book) {
        for (Layer layer: layers) {

            if (layer.category == book.category) {
                return layer.add(book);
            }
            /*
            why second strategy如果不需要分类 有空就add的话 写以下方法
             */
//            if (layer.isAvailable()) return layer.add(book);
        }
        return false;
    }
}
class Layer {
    String index;
    String name;
//    int bookAmount;
//    int maxAmount;
    Book[] books;
    Category category;

    int bookAmount;

    Layer(String index, String name, Book[] books) {
        this.index = index;
        this.name = name;
//        this.bookAmount = bookAmount;
//        this.maxAmount = maxAmount;
        this.books = books;
    }

    boolean add(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                bookAmount++;
                return true;
            }
        }
        return false;
    }

    Book search(String bookIndex) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].index.equals(bookIndex)) return books[i];
        }
        return null;
    }

    boolean isAvailable() {
        return bookAmount < books.length;
    }

    boolean remove(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                books[i] = null;
                bookAmount--;
                return true;
            }
        }
        return false;
    }

    boolean replace(Book target, Book replace) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(target)) {
                books[i] = replace;
                return true;
            }
        }
        return false;
    }


}

class Book {
    String index;
    String name;
    String author;
    Category category;

    public Book(String index, String name, String author, Category category) {
        this.index = index;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            book.index.equals(((Book) obj).index);
        }
        return super.equals(obj);
    }
}



enum Category {
    tech,
    entertainment,
    tools
}
