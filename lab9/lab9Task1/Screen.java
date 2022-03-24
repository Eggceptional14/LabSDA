import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class Screen extends JComponent {
    private static Screen screen;

    public static Screen getScreen() {
        if (screen == null) {
          screen = new Screen();
        }
        return screen;
      }
    
      private List<Shape> shapeList = new LinkedList<Shape>();
      private List<Arc>  arcs;
      private List<Line> lines;
      private List<Pixel> pixels;

      private JFrame frame;
    
      private Screen() {
        super();
        arcs  = new LinkedList<Arc>();
        lines = new LinkedList<Line>();
        pixels = new LinkedList<Pixel>();
        frame = new JFrame("Screen");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( this );
    
        frame.setVisible(true);
      }

      public void addShape( Shape newShape ) {
          shapeList.add( newShape );
      }
    
      public synchronized void draw_line(int x1, int y1, int x2, int y2) {
        lines.add(new Line(x1, y1, x2, y2));
        repaint();
      }
    
      public synchronized void draw_circle(int x, int y, int r) {
        arcs.add(new Arc(x, y, r));
        repaint();
      }

      public synchronized void draw_pixel( int x, int y ){
          pixels.add( new Pixel(x, y));
          repaint();
      }

      public void draw_shape() throws InterruptedException{
          for ( Shape s : shapeList ) {
              s.draw();
          }
          Thread.sleep(2000);
        }

      public synchronized void paint(Graphics g) {
        for (Line line : lines) {
          g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }
    
        for (Arc arc : arcs) {
          g.drawArc(arc.x, arc.y, arc.r*2, arc.r*2, 0, 360);
        }

        for ( Pixel pix : pixels) {
            g.drawLine( pix.x, pix.y, pix.x, pix.y);
        }

      }

}
