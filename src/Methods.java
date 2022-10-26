public class Methods {
    public static void printFullInfo(Book[] books) {
        for (Book e : books) {
            System.out.printf("Название книги: %-25s Автор: %s Год издания: %-5s\n",
                    e.getBookTitle(),
                    e.getAuthor().toString(),
                    e.getPublished());
        }
        System.out.println();
    }

    public static Book[] addTo(Book[] library, Book book) {
        Book[] newLibrary = new Book[library.length + 1];
        System.arraycopy(library, 0, newLibrary, 0, library.length);
        newLibrary[library.length] = book;
        return newLibrary;
    }
}