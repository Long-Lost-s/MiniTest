public class Main {
    public static void main(String[] args){
        ProgrammingBook Book1 = new ProgrammingBook("Code1", "Starter", 90, "Long", "Java", "Business");
        ProgrammingBook Book2 = new ProgrammingBook("Code2", "Elementary", 150, "Long", "Java", "Hello");
        ProgrammingBook Book3 = new ProgrammingBook("Code3", "Pre-Intermediate", 200, "Long", "Java", "Hi");

        FictionBook Fiction1 = new FictionBook("Fiction1", "Galaxy", 120, "SuperLong", "Fic1");
        FictionBook Fiction2 = new FictionBook("Fiction2", "Galactic Cluster", 130, "SuperLong", "Fic1");
        FictionBook Fiction3 = new FictionBook("Fiction3", "Galaxy Group", 30, "SuperLong", "Fic2");

        double totalPrice = 0;
        Book[] books = {Book1, Book2, Book3, Fiction1, Fiction2, Fiction3};
        for(Book book : books){
            totalPrice += book.getPriceDiscount();
        }
        System.out.println("Total price after discount: " + totalPrice);

        int javaBookCount = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                ProgrammingBook progBook = (ProgrammingBook) book;
                if (progBook.getLanguage().equals("Java")) {
                    javaBookCount++;
                }
            }
        }
        System.out.println("ProgrammingBook has the language 'Java': " + javaBookCount);

        int fictionCategoryCount = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                if (fictionBook.getCategory().equals("Fic1")) {
                    fictionCategoryCount++;
                }
            }
        }
        System.out.println("FictionBook has the category 'Fic1': " + fictionCategoryCount);

        int cheapFictionBookCount = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                if (book.getPrice() < 100) {
                    cheapFictionBookCount++;
                }
            }
        }
        System.out.println("FictionBook has price < 100: " + cheapFictionBookCount);

    }
}