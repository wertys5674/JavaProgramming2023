package Assign0421;

public class Assign28 {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(64,1024);
        myTV.printProperty();
    }
}


class TV_2 {
    private int size;
    public TV_2(int size){
        this.size = size;
    }
    protected int getSize(){
        return size;
    }
}

class ColorTV extends TV_2{
    private int colors;

    public ColorTV(int size, int colors){
        super(size);
        this.colors = colors;
    }

    public void printProperty(){
        System.out.println(getSize() + " inches, " + colors + " colors");
    }
}
