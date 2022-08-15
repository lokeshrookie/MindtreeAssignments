package oopsAssignments;

public class Eighteen {
    public static void main(String[] args) {
        Book one = new Book("Daniel Defoe", "Robinson Crusoe",
                15.50, 1719);
        Book two = new Book("Joseph Conrad",
                "Heart of Darkness", 12.80, 1902);
        Book three = new Book("Pat Conroy", "Beach Music",
                9.50, 1996);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }

}
class Book{
    String title;
    int yearOfPublication;
    double price;
    String authorName;
    public Book(String authorName, String title, double price, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", authorName='" + authorName + '\'' +
                "title='" + title + '\'' +
                ", price= $" + price +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
