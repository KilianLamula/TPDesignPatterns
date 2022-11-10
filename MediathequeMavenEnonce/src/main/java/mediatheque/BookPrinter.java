package mediatheque;

public class BookPrinter implements ItemVisitor {
    
    public void visit(CD cd) {
    }

    public void visit(Book book) {
        System.out.println("Print "+ book);
    }

}
