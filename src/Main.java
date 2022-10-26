
public class Main {
    public static void main(String[] args) {

        Author stephenEdwinKing = new Author("Stephen", "King");
        Author mikhailBulgakov = new Author("Mikhail", "Bulgakov");
        Author fedorDostoevskiy = new Author("Fedor", "Dostoevskiy");
        Author georgeOrwell = new Author("George", "Orwell");

        Book book1 = new Book("The green mile", stephenEdwinKing, 1996);
        Book book2 = new Book("It", stephenEdwinKing, 1986);
        Book book3 = new Book("The master and margarita", mikhailBulgakov, 1967);
        Book book4 = new Book("The White Guard", mikhailBulgakov, 1925);
        Book book5 = new Book("The idiot", fedorDostoevskiy, 1868);
        Book book6 = new Book("Crime and punishment", fedorDostoevskiy, 1866);
        Book book7 = new Book("Nineteen Eighty-Four", georgeOrwell, 1949);
        Book book8 = new Book("Ivan Vasilievich", mikhailBulgakov, 1965);
        Book book9 = new Book("Heart of a Dog", mikhailBulgakov, 1987);
        Book book10 = new Book("Fatal eggs", mikhailBulgakov, 1965);
        Book book11 = new Book("Fatal eggs", mikhailBulgakov, 1965);

        Book[] library = {book1, book2, book3, book4, book5, book6, book7, book8};
        Methods.printFullInfo(library);

        Book[] newLibrary = new Book[0];
        book1.setPublished(2096);
        newLibrary = Methods.addTo(newLibrary, book1);
        newLibrary = Methods.addTo(newLibrary, book9);
        newLibrary = Methods.addTo(newLibrary, book10);

        Methods.printFullInfo(newLibrary);

        System.out.println(book11.equals(book10));
        System.out.println(book11.hashCode());
        System.out.println(book10.hashCode());
        System.out.println(book11.equals(book1));
        System.out.println(book11.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book11);
    }
}
