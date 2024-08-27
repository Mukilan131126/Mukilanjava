class Shape {
    String name;
    int height;
    int width;
    int radius;
    
    public Shape(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }
    public Shape(String name,int radius){
        this.name=name;
        this.radius=radius;
    }


    public void calculateArea() {
        int area = height * width;
        System.out.println(area);
    }
}

class Square extends Shape {
    
    
    public Square(String name, int height, int width) {
        super(name, height, width); 
        System.out.println("The area of square is " );
    }
}
class Circle extends Shape{
    public Circle(String name,int radius){
        super(name,radius);
        System.out.println("The area of the circle is" );
    }
    public void calculateArea(){
        double area = 3.14*radius*radius;
        System.out.println(area);
    }
}

public class  Mains{
    public static void main(String[] args) {
        
        Square obj = new Square("square", 56, 76);
        obj.calculateArea();
        Circle obj1 = new Circle("Circle", 7);
        obj1.calculateArea();
    }
}
