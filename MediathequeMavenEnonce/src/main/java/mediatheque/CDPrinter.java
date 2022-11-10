package mediatheque;

public class CDPrinter implements ItemVisitor {

    public void visit(CD cd) {
        System.out.println("Print "+ cd);
    }

    public void visit(Book book) {
    }

}
