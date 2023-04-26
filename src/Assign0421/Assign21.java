package Assign0421;

public class Assign21 {
    public static void main(String[] args) {
        //TODO : 생성자 2개, 기본생성자와 매개변수를 모든 필드를 초기화하는 생성자
        Song song = new Song("Dynamite", "BTS", 2021, "Korea");
        song.show();
    }
}

class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    public void Song() {
        this.title = "";
        this.artist = "";
        this.year = 0;
        this.country = "";
    }

    public Song(String a, String b, int c, String d) {
        this.title = a;
        this.artist = b;
        this.year = c;
        this.country = d;
    }

    public void show() {
        System.out.println(title + " by " + artist + " from " + country + ", " + year);
    }
}
