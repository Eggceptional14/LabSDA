public class WrapXML extends DrawingService {

    private XML xmlFile;
    public WrapXML() {
        xmlFile = XML.getXML();
      }
    
      public void drawLine(int x1, int y1, int x2, int y2) {
        xmlFile.drawLine(x1, y1, x2, y2);
      }
    
      public void drawCircle(int x, int y, int r) {
        xmlFile.drawCircle(x, y, r);
      }
    
}
