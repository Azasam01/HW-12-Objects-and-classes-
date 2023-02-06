public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("James", "Joyce");

        Book book1 = new Book("Ulysses",author1,1921);
        book1.setYearOfPublication(1922);
        System.out.println("Title of the book - " + book1.getName());
        System.out.println("Author of the book - " + book1.getAuthor());
        System.out.println("Year of publication of the book - " + book1.getYearOfPublication() );


        Author author2 = new Author("Fyodor", "Dostoyevsky");

        Book book2 = new Book("Crime and Punishment",author2,1866);
        System.out.println("Title of the book - " + book2.getName());
        System.out.println("Author of the book - " + book2.getAuthor());
        System.out.println("Year of publication of the book - " + book2.getYearOfPublication());



    }
}