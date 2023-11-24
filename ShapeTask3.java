class Shape {
    public double calculateArea() 
    {
        return 0.0;
    }

    public double calculatePerimeter() 
    {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) 
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() 
    {
        return width * height;
    }

    @Override
    public double calculatePerimeter() 
    {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() 
    {
        return 2 * Math.PI * radius;
    }
}

public class ShapeTask3 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5.0, 4.0);
        shapes[1] = new Circle(3.0);
        shapes[2] = new Rectangle(7.0, 2.0);

        for (Shape shape : shapes) 
        {
            if (shape instanceof Rectangle) 
            {
                System.out.println("Rectangle:");
            } 
            else if (shape instanceof Circle) 
            {
                System.out.println("Circle:");
            }

            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}