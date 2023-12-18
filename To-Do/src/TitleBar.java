import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class TitleBar extends JPanel {
    public static final String BorderLayout = null;

    TitleBar(){
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.darkGray);

        JLabel titleText = new JLabel("TO DO LIST");
        titleText.setPreferredSize(new Dimension(200, 80));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);
    }
    
}