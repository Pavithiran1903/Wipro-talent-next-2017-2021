class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return name + " by " + author;
    }
}
class Books {
    public static void main(String args[])
    {
        Author a= new Author("neon", "neon@gmail.com", 'm');
        Book b = new Book("Wipro", a, 10.22, 22);
        System.out.println(b);
        System.out.println(a);
        b.setPrice(10.78);
        b.setQty(78);
        System.out.println("The name of the book is :"+b.getName());
        System.out.println("The price of the book is :"+b.getPrice());
        System.out.println("The stock is :"+b.getQty());
    }
}