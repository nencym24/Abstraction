public class Star {
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();
        r.read(80.5);
        r.show();
        r.getPI();

        Circle c = new Circle();
        c.read(40.3);
        c.show();
        c.getPI();
    }
}

abstract class Shape{

    double rectangle;
    double circle;
    double pi = 3.14;

    abstract void getPI();
}

class Rectangle extends Shape{

     public void read(double rectangle){
        this.rectangle = rectangle;
    }
    public void show(){
        System.out.println("Area of rectangle : ");
    }
    void getPI(){
         
        System.out.println(2*pi*rectangle);
    }
}

class Circle extends Shape{

    public void read(double circle){
        this.circle = circle;
    }
    public void show(){
        System.out.println("Area of circle : ");
    }
    void getPI(){
        System.out.println(pi*circle*circle);
    }
}
