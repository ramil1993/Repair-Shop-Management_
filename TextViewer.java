import java.awt.Button;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.imageio.ImageIO;
import java.net.URL;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.nio.file.Path;
import java.awt.Frame;


public class TextViewer extends Frame implements ActionListener {
  String directory; 

  TextArea textarea; 


  public TextViewer() {
    this(null, null);
  }

  public TextViewer(String directory, String filename) {
  
    super("ProNorth Collision Text Viewer"); // Create the frame
    super.setBackground(Color.DARK_GRAY);
    String path = System.getProperty("user.dir");
    ImageIcon icon = new ImageIcon(path + "\\pics\\icon.png");
    super.setIconImage(icon.getImage());
   
	 // Destroy the window when the user requests it
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        dispose();
      }
    });

    // Create a TextArea to display the contents of the file in
    textarea = new TextArea("", 24, 80);
    textarea.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
    textarea.setEditable(false);
    textarea.setBackground(Color.WHITE);
    this.add("Center", textarea);

    // Create a bottom panel to hold a couple of buttons in
    Panel p = new Panel();
    p.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));
    this.add(p, "South");

    // Create the buttons and arrange to handle button clicks
    Font font = new Font("SansSerif", Font.BOLD, 14);
    Button openfile = new Button("Open File");
    Button close = new Button("Close");
    openfile.addActionListener(this);
    openfile.setActionCommand("open");
    openfile.setFont(font);
    close.addActionListener(this);
    close.setActionCommand("close");
    close.setFont(font);
    p.add(openfile);
    p.add(close);

    this.pack();

    // Figure out the directory, from filename or current dir, if necessary
    if (directory == null) {
      File f;
      if ((filename != null) && (f = new File(filename)).isAbsolute()) {
        directory = path + "\\storage";
        filename = f.getName();
      } else
        directory = path + "\\storage";
    }

    this.directory = directory; // Remember the directory, for FileDialog
    setFile(directory, filename); // Now load and display the file
  }


  public void setFile(String directory, String filename) {
    if ((filename == null) || (filename.length() == 0))
      return;
    File f;
    FileReader in = null;
    // Read and display the file contents. Since we're reading text, we
    // use a FileReader instead of a FileInputStream.
    try {
      f = new File(directory, filename); // Create a file object
      in = new FileReader(f); // And a char stream to read it
      char[] buffer = new char[4096]; // Read 4K characters at a time
      int len; // How many chars read each time
      textarea.setText(""); // Clear the text area
      while ((len = in.read(buffer)) != -1) { // Read a batch of chars
        String s = new String(buffer, 0, len); // Convert to a string
        textarea.append(s); // And display them
      }
      this.setTitle("ProNorth Collision Viewing File: " + filename); // Set the window title
      textarea.setCaretPosition(0); // Go to start of file
    }
    // Display messages if something goes wrong
    catch (IOException e) {
      textarea.setText(e.getClass().getName() + ": " + e.getMessage());
      this.setTitle("TextViewer: " + filename + ": I/O Exception");
    }
    // Always be sure to close the input stream!
    finally {
      try {
        if (in != null)
          in.close();
      } catch (IOException e) {
      }
    }
  }


  public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    if (cmd.equals("open")) { // If user clicked "Open" button
      // Create a file dialog box to prompt for a new file to display
      FileDialog f = new FileDialog(this, "Open File", FileDialog.LOAD);
      f.setDirectory(directory); // Set the default directory

      // Display the dialog and wait for the user's response
      f.show();

      directory = f.getDirectory(); // Remember new default directory
      setFile(directory, f.getFile()); // Load and display selection
      f.dispose(); // Get rid of the dialog box
    } else if (cmd.equals("close")) // If user clicked "Close" button
      this.dispose(); // then close the window
  }



  
}
