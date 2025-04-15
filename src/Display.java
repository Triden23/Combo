import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JFrame {
    String SaveLocation;
    Converter C;

    int windowWidth = 1455;
    int windowHeight = 925;
    String windowTitle = "FGC notation converter";
    Color backGround = new Color(18, 18, 18);
    Color objectBackGround = new Color(35, 35, 35);
    Color textColor = new Color(176, 176, 176);

    JLabel currentLabel;
    String clText = "Select Current Game Notation";
    int clX = 10;
    int clY = 10;
    int clWidth = 185;
    int clHeight = 40;

    JLabel targetLabel;
    String tlText = "Select Target Game Notation";
    int tlX = 10;
    int tlY = 420;
    int tlWidth = 185;
    int tlHeight = 40;

    JButton generate;
    String generateText = "Convert";
    int generateX = 10;
    int generateY = 830;
    int generateWidth = 185;
    int generateHeight = 40;

    JButton selectSaveLocation;
    String sslText = "Save";
    int sslX = 205;
    int sslY = 830;
    int sslWidth = 185;
    int sslHeight = 40;

    JTextArea ccwa;//Current Combo Writing Area
    int ccwaX = 10;
    int ccwaY = 60;
    int ccwaWidth = 1420;
    int ccwaHeight = 350;

    JTextArea tcwa;
    int tcwaX = 10;
    int tcwaY = 470;
    int tcwaWidth = 1420;
    int tcwaHeight = 350;

    JComboBox currentSelect;
    int currentSelectX = 205;
    int currentSelectY = 10;
    int currentSelectWidth = 150;
    int currentSelectHeight = 40;

    JComboBox targetSelect;
    int targetSelectX = 205;
    int targetSelectY = 420;
    int targetSelectWidth = 150;
    int targetSelectHeight = 40;

    Games current = Games.Select;
    Games target = Games.Select;

    public Display(){
    }

    public void init(){
        C = new Converter();
        setUpLabels();
        setUpCombos();
        setUpButtons();
        setUpTextArea();
        setUpThis();
    }

    //currentLabel targetLabel generate
    // selectSaveLocation ccwa tcwa
    // currentSelect targetSelect
    public void setUpThis(){
        this.setSize(windowWidth,windowHeight);
        this.setTitle(windowTitle);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(backGround);
        this.setLayout(null);
        this.add(currentLabel);
        this.add(targetLabel);
        this.add(generate);
        this.add(selectSaveLocation);
        this.add(ccwa);
        this.add(tcwa);
        this.add(currentSelect);
        this.add(targetSelect);

        this.setVisible(true);
        this.repaint();
        this.validate();
    }

    public void setUpCombos(){
        currentSelect = new JComboBox<>(Games.values());
        currentSelect.setBounds(new Rectangle(currentSelectX,currentSelectY,currentSelectWidth,currentSelectHeight));
        currentSelect.setBackground(objectBackGround);
        currentSelect.setForeground(textColor);


        targetSelect = new JComboBox<>(Games.values());
        targetSelect.setBounds(new Rectangle(targetSelectX,targetSelectY,targetSelectWidth,targetSelectHeight));
        targetSelect.setBackground(objectBackGround);
        targetSelect.setForeground(textColor);
    }

    public void setUpLabels(){
        currentLabel = new JLabel();
        currentLabel.setText(clText);
        currentLabel.setBounds(new Rectangle(clX,clY,clWidth,clHeight));
        currentLabel.setBackground(objectBackGround);
        currentLabel.setForeground(textColor);

        targetLabel = new JLabel();
        targetLabel.setText(tlText);
        targetLabel.setBounds(new Rectangle(tlX,tlY,tlWidth,tlHeight));
        targetLabel.setBackground(objectBackGround);
        targetLabel.setForeground(textColor);
    }

    private void setUpTextArea() {
        ccwa = new JTextArea();
        ccwa.setBounds(new Rectangle(ccwaX,ccwaY,ccwaWidth,ccwaHeight));
        ccwa.setBackground(objectBackGround);
        ccwa.setForeground(textColor);
        ccwa.setOpaque(true);

        tcwa = new JTextArea();
        tcwa.setBounds(new Rectangle(tcwaX,tcwaY,tcwaWidth,tcwaHeight));
        tcwa.setBackground(objectBackGround);
        tcwa.setForeground(textColor);
        tcwa.setOpaque(true);
    }

    private void setUpButtons() {

        generate = new JButton(generateText);
        generate.setBounds(new Rectangle(generateX,generateY,generateWidth,generateHeight));
        generate.setBackground(objectBackGround);
        generate.setForeground(textColor);
        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Make the button convert the string
            }
        });

        selectSaveLocation = new JButton(sslText);
        selectSaveLocation.setBounds(new Rectangle(sslX,sslY,sslWidth,sslHeight));
        selectSaveLocation.setBackground(objectBackGround);
        selectSaveLocation.setForeground(textColor);
        selectSaveLocation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Make the button save the game
            }
        });
    }

    public void setSaveLocation(String location){

        SaveLocation = location;

    }

}