package Academic_Library;
public class Main {
    public static void main(String[] args) {
        book a = new book();

        a.setCode("1");
        a.setTittle("Cool Book");
        a.setPublicationYear(1970);
        a.setBorrowed(false);
        a.setAuthor("Cici Divo");
        a.setIsbn("12345");
        a.setPagesNumber(90);
        a.setLoanTermInDays(4);

        if(a.canBeBorrowed()){
            System.out.println("Yes you can");
        }
        else System.out.println("No, you can't take the book");
        
        System.out.println(a.getDescription());

        magazine b = new magazine();

        b.setBorrowed(false);
        b.setCode("2");
        b.setEdition("special");
        b.setPublicationMonth(7);
        b.setPublicationYear(1940);
        b.setTittle("Pitocotoco");

        System.out.println(b.getDescription());

        if (b.loanMagazine()){
            System.out.println("yes you can");
        }
        else System.out.println("No, you can't take the magazine");

    }
}
