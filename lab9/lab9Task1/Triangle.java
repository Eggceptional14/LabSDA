public class Triangle extends Shape {
    protected int len;

  public Triangle(int x, int y, int len) {
    super(x, y);
    this.len = len;
  }

  public void draw() {
     draw.drawLine( x, y, x + len/2, y - len);
     draw.drawLine( x, y, x - len/2, y - len);
     draw.drawLine( x - len/2, y-len, x + len/2, y - len);
  }

}
