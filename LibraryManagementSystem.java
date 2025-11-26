public class LibraryManagementSystem {
    private String title;
    private String author;
    private boolean isAvailable;
    public LibraryManagementSystem(String title , String author){
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void borrowBook(){
        if(isAvailable){
            isAvailable=false;
            System.out.println("YOU HAVE SUCCESSFULLY BORROWED THE BOOK:"+title);
        }else{
            System.out.println("Sorry, " + title + " is currently not available.");
        }
    }
    public void returnBook(){
        if(!isAvailable){
            System.out.println("You have successfully returned the book: " + title + ".");

        }else{
            System.out.println("you have not returned the book:"+title);
        }
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryManagementSystem book1 = new LibraryManagementSystem("The Alchemist", "Paulo Coelho");

        book1.borrowBook(); 
        book1.borrowBook();  
        book1.returnBook();  
        book1.returnBook();  
    }
}

