package Assign0421;

public class Assign22 {
    //TODO: 사각형이 포함하는가? 이거 오류?
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);

        r. show();
        System.out.println("Area : " + s.square());
        if(t.contains(r))
            System.out.println("t includes r");
        if(t.contains(s))
            System.out.println("t includes s");
    }
}

class Rectangle{
    int x =0;
    int y = 0;
    int width =0;
    int height = 0;

    public Rectangle(int a, int b, int c, int d){
        this.x = a;
        this.y = b;
        this.width = c;
        this.height = d;
    }

    public int square(){
        return this.width * this.height;
    }

    public void show(){
        System.out.println("Rectangle at (" + x + "," + y + ") with area " + width*height);
    }

    public boolean contains(Rectangle r){
        if(r.x >= this.x && r.x +r.width <= this.x + this.width && r.y <= this.y && r.y -r.height >= this.y-this.height)
            return true;

        else
            return false;
    }
}
