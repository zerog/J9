/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package j9;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Christopher Lemire <christopher.lemire@gmail.com>
 */
public class J9 extends JPanel {
  private static JFrame frame;
  private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;

  public J9() {
    setLayout(new GridLayout(4,3));

    // Create buttons
    b1 = new JButton("1");
    b2 = new JButton("2\nabc");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b0 = new JButton("0");

    // Add components
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    add(b0);
  }

  private static void createAndShowGUI() {
    // Create and set up the window.
    frame = new JFrame("J9");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Add content to the window.
    frame.add(new J9());

    // Display the window.
    frame.pack();
    frame.setVisible(true);
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() { createAndShowGUI(); }
    });
  }
}
