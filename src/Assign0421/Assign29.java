package Assign0421;

public class Assign29 {
    public static void main(String[] args) {
        IPTV myTV = new IPTV("192.1.1.2", 64,2047);
        myTV.printProperty();
    }
}

class TV_3 {
    private int size;
    public TV_3(int size){
        this.size = size;
    }
    protected int getSize(){
        return size;
    }
}

class ColorTV_2 extends TV_3{
    private int colors;

    public ColorTV_2(int size, int colors){
        super(size);
        this.colors = colors;
    }

    public void printProperty(){
        System.out.println(getSize() + " inches, " + colors + " colors");
    }

    protected int getColor(){
        return colors;
    }
}

class IPTV extends ColorTV_2{
    private String ip;
    public IPTV(String ip, int size, int colors) {
        super(size, colors);
        this.ip = ip;
    }

    public void printProperty(){
        System.out.println("My IPTV is " + getSize() + " inches, " + getColor() + " colors and IP adrress is " + ip);

    }
}