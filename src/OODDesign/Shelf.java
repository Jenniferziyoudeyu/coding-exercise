package OODDesign;


public class Shelf {
    String id;
    Layer1[] layers;
    Shelf(String id, Layer1[] layers) {
        this.id = id;
        this.layers = layers;
    }

    boolean add(Book1 book) {
        for (Layer1 layer1 : layers) {
            if (layer1.category == book.category) {
                return true;
            }
        }
        return false;
    }

}

class Layer1 {
    String id;
    private Book1[] books;
    Category category;

    Layer1(String id, Category category) {
        this.id = id;
        this.category = category;
    }

    public Book1[] getBooks() {
        return books;
    }


    boolean add(Book1 book) {
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

    boolean replace(Book1 target, Book1 replacement) {
        for (int i = 0; i < books.length; i++) {
            if(books[i].equals(target)) {
                books[i] = replacement;
                return true;
            }
        }
        return false;
    }

    Book1 search(String bookId) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].id.equals(bookId))
                return books[i];
        }
        return null;
    }
}

class Book1 {
    String id;
    String name;
    String author;
    Category category;

    Book1(String id, String name, String author, Category category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof Book) {
            Book1 book = (Book1) obj;
            return book.id.equals(id);
        }
        else return super.equals(obj);
    }

}

enum Categorys {
    entertainment,
    tools
}
