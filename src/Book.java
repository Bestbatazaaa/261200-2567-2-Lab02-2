public class Book {
    String title = "";
    String author = "";
    double price = 0.0;

    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // TODO: Complete the rest of this constructor.
    }

    public void displayDetails() {
        if(price > 0) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Error price can't be a negative number");
        }
        // TODO: Complete the rest of this method.
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public void applyDiscount(double Discount) {
        if (price < 0){
            System.out.println("Error since price is a negative number");
        }else {
            if (Discount > 0) {
                if (Discount < 100) {
                    price = price - ((Discount / 100.0) * price);
                    System.out.println("Your prices has been successfully updated");
                    System.out.println("Updated price: " + price);
                } else {
                    System.out.println("Error discount can't be greater than hundred");
                }
            } else if (Discount == 0) {
                System.out.println("Error discount can't be zero");
            } else {
                System.out.println("Error discount can't be a negative number");
            }
        }
    }

    public static void main(String arg[]){
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(1000);
        hp1Book.displayDetails();
        hp1Book.applyDiscount(50);
        hp1Book.displayDetails();
    }
}