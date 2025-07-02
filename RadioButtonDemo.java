import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton birdBtn, catBtn, dogBtn, rabbitBtn, pigBtn;
    JLabel imageLabel;
    ButtonGroup group;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create radio buttons
        birdBtn = new JRadioButton("Bird");
        catBtn = new JRadioButton("Cat");
        dogBtn = new JRadioButton("Dog");
        rabbitBtn = new JRadioButton("Rabbit");
        pigBtn = new JRadioButton("Pig");

        // Group buttons
        group = new ButtonGroup();
        group.add(birdBtn);
        group.add(catBtn);
        group.add(dogBtn);
        group.add(rabbitBtn);
        group.add(pigBtn);

        // Add ActionListeners
        birdBtn.addActionListener(this);
        catBtn.addActionListener(this);
        dogBtn.addActionListener(this);
        rabbitBtn.addActionListener(this);
        pigBtn.addActionListener(this);

        // Panel for radio buttons
        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.add(birdBtn);
        panel.add(catBtn);
        panel.add(dogBtn);
        panel.add(rabbitBtn);
        panel.add(pigBtn);
        add(panel);

        // Label for image
        imageLabel = new JLabel();
        add(imageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedPet = "";
        String imagePath = "";

        if (e.getSource() == birdBtn) {
            selectedPet = "Bird";
            imagePath = "bird.png";
        } else if (e.getSource() == catBtn) {
            selectedPet = "Cat";
            imagePath = "cat.png";
        } else if (e.getSource() == dogBtn) {
            selectedPet = "Dog";
            imagePath = "dog.png";
        } else if (e.getSource() == rabbitBtn) {
            selectedPet = "Rabbit";
            imagePath = "rabbit.png";
        } else if (e.getSource() == pigBtn) {
            selectedPet = "Pig";
            imagePath = "pig.png";
        }

        // Show message box
        JOptionPane.showMessageDialog(this, "You selected: " + selectedPet);

        // Update image
        ImageIcon icon = new ImageIcon(imagePath);
        imageLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}

