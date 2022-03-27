import java.util.List;

public class XML {
    private static XML xmlFile;

  public static XML getXML() {
    if (xmlFile == null) {
      xmlFile = new XML();
    }
    return xmlFile;
  }

  private List<Arc>  arcs;
  private List<Line> lines;

  public synchronized void drawLine(int x1, int y1, int x2, int y2) {
    lines.add(new Line(x1, y1, x2, y2));
  }

  public synchronized void drawCircle(int x, int y, int r) {
    arcs.add(new Arc(x, y, r));
  }

}
