import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame implements ActionListener {
    private MyPanel myPanel = new MyPanel();

    private JMenuBar jMenu = new JMenuBar();
    private JMenu menu = new JMenu("Menu głowne");

    private JMenuItem author = new JMenuItem("Autor");
    private JMenuItem description = new JMenuItem("Opis programu");
    private JMenuItem close = new JMenuItem("Zakończ");

    public MyWindow(){
        this.setSize(700, 350);
        this.setLocationRelativeTo(null);
        this.setTitle("Michał Maziarz");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(myPanel);
        author.addActionListener(this);
        description.addActionListener(this);
        close.addActionListener(this);
        menu.add(author);
        menu.add(description);
        menu.add(close);
        jMenu.add(menu);
        this.setJMenuBar(jMenu);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
