package Academic_Library;
public abstract class libraryItem {
    private String code;
    private String tittle;
    private int publicationYear;
    private boolean borrowed;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Boolean getBorrowed(){
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void loanBook(){
        if(borrowed == true){
            System.out.println("The book has already been borrowed.");
        }
        else borrowed = true;
    }

    public boolean giveBack(){
        return borrowed = false;
    }

    public String getDescription(){
        return "\nCode of the book: " + code + "\nTittle: " + tittle + "\nYear of publication: " + publicationYear + "\nWas it borrowed: " + borrowed;
    }

    
}
