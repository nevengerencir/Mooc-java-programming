
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }
    public boolean equals(Book book){
        if (book==this){


            return true;
        }
        if(!(book instanceof Book)){


            return false;
        }
        Book comparedbook= (Book) book;
        if(this.name.equals(comparedbook.getName())&& this.publicationYear== comparedbook.getPublicationYear()){


            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

}
