package Question1;

public class Square extends Shape {
    int side;

    public Square(int side){
        this.side = side;
        setArea(side * side);
        setPerimeter(side * 4);
    }
    public Square(String name, String color, int side){
        this.name = name;
        this.color = color;
        this.side = side;
        setArea(side * side);
        setPerimeter(side * 4);
    }
    public void setSide(int side){
        this.side = side;
    }
    public int getSide(){
        return side;
    }
}
