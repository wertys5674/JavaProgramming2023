package Assign0407;

public class Book {
    public String title;
    public String author;

    public Book(String t){
        title = t;
        author = "Unknown";
    }

    public Book(String t, String a){
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("Litte Prince","Sbtoine de Saint-Exupery");
        Book loveStory = new Book("Coonhyang");

        System.out.println(littlePrince.title);
        System.out.println(loveStory.title);
    }
}
