public class NEULibrary {
    public static void main(String[] args) {

        Student Tyke = new Student("Tyke", 001);
        Student Meowth = new Student("Meowth", 002);
        Student Tom = new Student("Tom", 003);

        Book book1 = new Book("This is a Book", "Yuro");
        Book book2 = new Book("Is this a Book?", "Yuri");

        Journal journal1 = new Journal("Journal is Journal?", "Mika");
        Journal journal2 = new Journal("Life in a Journal", "Caged");

        Borrow borrowing = new ResourceToBorrow();

        borrowing.borrowedBy(Tyke, book1);
        borrowing.borrowedBy(Meowth, book2);
        borrowing.borrowedBy(Tom, journal1);
        borrowing.borrowedBy(Tom, journal2);
    }
}