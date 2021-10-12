package Question1;

public class Shape {
    String name;
    String color;
    int area;
    int perimeter;
    public Shape(){}

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }
    public Shape(String name,String color,int perimeter,int area){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }
    //printShape method
    public String printShape(){
        return "The "+name+ " has a " +color +" color";
    }
   //getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    public int getArea(){
        return area;
    }
    public void setArea(int area){
        this.area = area;
    }

    public int getPerimeter(){
        return perimeter;
    }
    public void setPerimeter(int perimeter){
        this.perimeter = perimeter;
    }
}
