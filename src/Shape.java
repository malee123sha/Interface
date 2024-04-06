public interface Shape {
    abstract void getArea();
    default void getEdges() {
        System.out.println("Edges of this Shape");
    }
}
class Rectangle implements Shape {
    @Override
    public void getArea() {
        int length = 10;
        int width = 20;
        int area = length * width;
        System.out.println("Area of the Rectangle :-"+area);
    }
    @Override
    public void getEdges() {
        System.out.println("I have 4 edges");
    }
}
class Square implements Shape {
    @Override
    public void getArea() {
        int length = 20;
        int area = length * length;
        System.out.println("Area of the Square :-"+area);
    }
}
class Test1 {
    public static void main(String[] args) {
        Shape r = new Rectangle(); //Up-casting
        r.getArea();
        r.getEdges();
        Shape s = new Square(); //Up-casting
        s.getArea();
    }
}
