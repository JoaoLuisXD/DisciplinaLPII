package Academic_Library;
public class book extends libraryItem implements loanable{
    private String author;
    private String isbn;
    private int pagesNumber;
    private int loanTermInDays;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public int getLoanTermInDays() {
        return loanTermInDays;
    }

    public void setLoanTermInDays(int loanTermInDays) {
        this.loanTermInDays = loanTermInDays;
    }

    public boolean canBeBorrowed(){
        if(getBorrowed() == false){
            return true;
        }
        else return false;
    }

    public int getLoanTerm(){
        return loanTermInDays;
    }

    public String getDescription(){
        return super.getDescription() + "\nauthor: " + author + "\nisbn: " + isbn + "\nnumber of pages: " + pagesNumber + "\nloan term in days: " + loanTermInDays;
    }
}
