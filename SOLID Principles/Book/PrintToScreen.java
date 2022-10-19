public class PrintToScreen {
    public void printToScreen(Book book){
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
