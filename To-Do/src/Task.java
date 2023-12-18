import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{

    private JLabel index;
    private JTextField taskName;
    private JButton done;
    private boolean completed;
    Task(){
        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(Color.red);

        this.setLayout(new BorderLayout());

        completed = false; 

        index = new JLabel(" ");
        index.setPreferredSize(new Dimension(20, 20));
        index.setHorizontalAlignment(JLabel.CENTER);

        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Your task here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.red);

        this.add(taskName, BorderLayout.CENTER);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40, 20));
        done.setBorder(BorderFactory.createEmptyBorder());
        
        this.add(done, BorderLayout.EAST);
    }

    public JButton getDone(){
        return done;
    }

    public void changeIndex(int num){
        this.index.setText(num + "");
        revalidate();
    }

    public void changeState(){
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        completed = true;
    }
}
