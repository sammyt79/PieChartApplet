
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

/**
 * This class a pie chart using Arc2D for precision.
 */
public class PieChart extends JApplet {

    /**
     * init method
     */
    public void init() {
        // Set the background color to white.
        getContentPane().setBackground(Color.WHITE);
    }

    /**
     * paint method
     */
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // Call the superclass paint method.
        super.paint(g);

        // Draw a red-filled arc from 49 degrees
        // to 222.48 degrees.
        g2.setColor(Color.RED);
        g2.fill(new Arc2D.Double(0, 20,
                200,
                200,
                49, 222.48,
                Arc2D.PIE));

        // Draw a yellow-filled arc from 271.48 degrees
        // to 66.6 degrees.
        g.setColor(Color.YELLOW);
        g2.fill(new Arc2D.Double(0, 20,
                200,
                200,
                271.48, 66.6,
                Arc2D.PIE));

        // Draw a magenta-filled arc from 338.08 degrees
        // to 15.84 degrees.
        g.setColor(Color.MAGENTA);
        g2.fill(new Arc2D.Double(0, 20,
                200,
                200,
                338.08, 15.84,
                Arc2D.PIE));

        // Draw a green-filled arc from 353.92 degrees
        // to 13.32 degrees.
        g.setColor(Color.GREEN);
        g2.fill(new Arc2D.Double(0, 20,
                200,
                200,
                353.92, 13.32,
                Arc2D.PIE));

        // Draw a blue-filled arc from 367.24 degrees
        // to 41.76 degrees.
        g2.setColor(Color.BLUE);
        g2.fill(new Arc2D.Double(0, 20,
                200,
                200,
                367.24, 41.76,
                Arc2D.PIE));

		// Set text with specified color and position
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("SansSerif", Font.BOLD, 18));
        g2.drawString("significant others", 130, 25);
        g2.drawString("friends and family", 190, 80);
        g2.drawString("children's classmates and teachers", 200, 120);
        g2.drawString("pets", 197, 155);
        g2.drawString("other", 166, 200);
    }
}
