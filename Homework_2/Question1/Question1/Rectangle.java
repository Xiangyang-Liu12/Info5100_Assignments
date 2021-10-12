package Question1;

public class Rectangle extends Shape {
    int width;
    int height;

  public Rectangle(int side){
      this.height = side;
      this.width = side;
      setArea(width * height);
      setPerimeter((width + height) * 2);
    }
    public  Rectangle(int width, int height){
      this.height = height;
      this.width = width;
      setArea(width * height);
      setPerimeter((width + height) * 2);
    }

    public Rectangle(String name, String color, int width, int height){
      this.name = name;
      this.color = color;
      this.width = width;
      this.height = height;
      setArea(width * height);
      setPerimeter((width + height) * 2);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public  int getHeight(){
      return height;
    }

    public void setHeight(int height){
      this.height = height;
    }
}
