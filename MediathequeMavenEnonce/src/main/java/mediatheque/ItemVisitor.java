package mediatheque;

interface ItemVisitor {
    void visit(Book book);
    void visit(CD cd);
}
