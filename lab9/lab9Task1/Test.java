import java.util.LinkedList;
import java.util.List;

import javafx.print.PrintColor;

public class Test {

  public static void main(String[] args) throws InterruptedException {

    Screen screen1 = new Screen();

    screen1.addShape(new Square(250, 100, 40));
    screen1.addShape(new Circle(250, 250, 30));
    screen1.addShape(new Rectangle(10, 10, 100, 100));
    screen1.addShape(new Rectangle(110, 110, 200, 200));
    screen1.addShape(new Triangle(50, 200, 40));

    screen1.draw_line( 120, 120, 240, 240 );
    screen1.draw_pixel( 50, 50 );
    screen1.draw_circle( 200, 240, 5);

    screen1.draw();

    PrinterDisplay printer1 = new PrinterDisplay();

    printer1.addShape(new Square(250, 100, 40));
    printer1.addShape(new Circle(250, 250, 30));
    printer1.addShape(new Rectangle(10, 10, 100, 100));
    printer1.addShape(new Rectangle(110, 110, 200, 200));
    printer1.addShape(new Triangle(50, 200, 40));

    printer1.print_line( 120, 120, 240, 240 );
    printer1.print_pixel( 50, 50 );
    printer1.print_circle( 200, 240, 5);

    printer1.print();



  }
}
  