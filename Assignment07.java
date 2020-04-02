//This program simply draws a winky face to the JPanel

//Import the swing and awt packages
import javax.swing.*;
import java.awt.*;

public class Assignment07{
    public static void main(String[] args){
        JFrame window = new JFrame("Emoji");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JPanel canvas = new JPanel(){
            public void paintComponent(Graphics gr){
                Graphics2D g = (Graphics2D) gr;
                
                //Draw the head
                g.setColor(Color.YELLOW);
                g.fillOval(0, 0, 550, 550);
                
                //Draw the eyes
                g.setColor(Color.BLACK);
                g.fillOval(150, 170, 100, 10);//Width shorter to create wink
                g.fillOval(350, 100, 100, 100);

                //Draw the mouth
                g.fillOval(100, 400, 350, 60);

                //Add a smile
                g.setColor(Color.YELLOW);
                g.fillOval(100, 400, 350, 50);

                //Add text
                Font font = new Font("Times New Roman", Font.PLAIN, 60);//Set font type and size
                g.setColor(Color.BLACK);
                g.setFont(font);
                g.drawString("Winky Face", 150, 600);

            }
        };
        //Create the window
        window.add(canvas);
        window.setSize(600, 700);
        window.setVisible(true);
    }
}