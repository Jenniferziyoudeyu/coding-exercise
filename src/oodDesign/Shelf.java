package oodDesign;

public class Shelf {
    String id;
    Layer[] layers;
    Shelf(String id, Layer[] layers) {
        this.id = id;
        this.layers = layers;
    }

    boolean add(Book book) {
        for (int i = 0; i < layers.length; i++) {
            if (layers[i].category == book.category)
                return true;
        }
        return false;
    }

}

class Layer {
    String id;
    private Book[] books;
    Category category;

    Layer(String id, Category category) {
        this.id = id;
        this.category = category;
    }

    public Book[] getBooks() {
        return books;
    }


    boolean add(Book book) {
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
                return true;
            }
        }
        return false;
    }

    boolean remove(String name) {
        for(int i = 0; i < books.length; i++) {
            if (books[i].name == name) {
                books[i] = null;
                return true;
            }
        }
        return false;
    }

    boolean replace(Book target, Book replacement) {
        for (int i = 0; i < books.length; i++) {
            if(books[i].equals(target)) {
                books[i] = replacement;
                return true;
            }
        }
        return false;
    }

    Book search(String bookId) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].id.equals(bookId))
                return books[i];
        }
        return null;
    }
}

class Book {
    String id;
    String name;
    String author;
    Category category;

    Book(String id, String name, String author, Category category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            return book.id.equals(id);
        }
        else return super.equals(obj);
    }
}

enum Category {
    entertainment,
    tools
}
