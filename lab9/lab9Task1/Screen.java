import java.util.LinkedList;


public class Screen {
  private LinkedList<Shape> shapeList;

  private WrapMonitor monitorWrap;

  public Screen() {
    shapeList = new LinkedList<Shape>();
    monitorWrap = new WrapMonitor();
  }

  public void addShape( Shape newShape ) {
    newShape.setDrawingService( monitorWrap );
    shapeList.add(newShape);
  }

  public void draw_line(int x1, int y1, int x2, int y2) {
    monitorWrap.drawLine(x1, y1, x2, y2);
  }

  public void draw_pixel(int x, int y) {
    monitorWrap.drawLine(x,y,x,y);
  }

  public void draw_circle(int x, int y, int r) {
    monitorWrap.drawCircle(x, y, r);
  }

  public void draw() throws InterruptedException { 
    for ( Shape s : shapeList ) {
      s.draw();
    }
    Thread.sleep( 2000 );
  }

}
