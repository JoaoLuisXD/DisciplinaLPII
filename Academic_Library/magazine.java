package Academic_Library;
public class magazine extends libraryItem{
    private String edition;
    private int publicationMonth;

    public String getEdition() {
        return edition;
    }
    
    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getPublicationMonth() {
        return publicationMonth;
    }

    public void setPublicationMonth(int publicationMonth) {
        this.publicationMonth = publicationMonth;
    }

    public boolean loanMagazine(){
        if(getBorrowed() == false && edition != "special"){
            return true;
        }
        else return false;
    }

    public String getDescription(){
        
        return super.getDescription() + "\nedition: " + edition + "\nmonth of publication: " + publicationMonth;
    }
}
