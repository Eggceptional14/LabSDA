import java.util.LinkedList;

public class PrinterDisplay {
    private LinkedList<Shape> shapeList;

  private WrapPrinter printerWrap;

  public PrinterDisplay() {
    shapeList = new LinkedList<Shape>();
    printerWrap = new WrapPrinter();
  }

  public void addShape( Shape newShape ) {
    newShape.setDrawingService( printerWrap );
    shapeList.add(newShape);
  }

  public void print_line(int x1, int y1, int x2, int y2) {
    printerWrap.drawLine(x1, y1, x2, y2);
  }

  public void print_pixel(int x, int y) {
    printerWrap.drawLine(x,y,x,y);
  }

  public void print_circle(int x, int y, int r) {
    printerWrap.drawCircle(x, y, r);
  }

  public void print() throws InterruptedException { 
    for ( Shape s : shapeList ) {
      s.draw();
    }
    Thread.sleep( 2000 );
  }

}
