/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package j9;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Christopher Lemire <christopher.lemire@gmail.com>
 * @author Travis Mosley <tprowx@gmail.com>
 */
public class J9 extends JPanel {
  private static JFrame frame;
  private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

  public J9() {
    setLayout(new GridBagLayout()); //FIXME Write the constructor

    // Create buttons
    b1 = new JButton("<html>"
            + "<center><font color=red>1</font></center>"
            + "<p><font color=green>---</font>");
    b2 = new JButton("<html>"
            + "<center><font color=red>2</font></center>"
            + "<p><font color=green>abc</font>");
    b3 = new JButton("<html>"
            + "<center><font color=red>3</font></center>"
            + "<p><font color=green>def</font>");
    b4 = new JButton("<html>"
            + "<center><font color=red>4</font></center>"
            + "<p><font color=green>ghi</font>");
    b5 = new JButton("<html>"
            + "<center><font color=red>5</font></center>"
            + "<p><font color=green>jkl</font>");
    b6 = new JButton("<html>"
            + "<center><font color=red>6</font></center>"
            + "<p><font color=green>mno</font>");
    b7 = new JButton("<html>"
            + "<center><font color=red>7</font></center>"
            + "<p><font color=green>qrs</font>");
    b8 = new JButton("<html>"
            + "<center><font color=red>8</font></center>"
            + "<p><font color=green>tuv</font>");
    b9 = new JButton("<html>"
            + "<center><font color=red>9</font></center>"
            + "<p><font color=green>wxyz</font>");

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
