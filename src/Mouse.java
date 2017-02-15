import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse extends JFrame {

     private JPanel mousepanel;
     private JLabel statursbar;
    //constructor
    public Mouse(){

        super("Mouse Event");
        mousepanel = new JPanel();
        statursbar = new JLabel("default");

        mousepanel.setBackground(Color.blue);
        add(mousepanel, BorderLayout.CENTER);
        add(statursbar, BorderLayout.NORTH);


       Handlerclass handler = new Handlerclass();

       mousepanel.addMouseListener(handler);
       mousepanel.addMouseMotionListener(handler);
    }

    private class Handlerclass implements MouseListener, MouseMotionListener{

        public void mouseClicked(MouseEvent event){
            statursbar.setText(String.format("Clicked at %d, %d", event.getX(),event.getY()));
        }
        public void mousePressed(MouseEvent event){
            statursbar.setText("you press down the button");

        }
       public void mouseReleased(MouseEvent event){
            statursbar.setText("you release the button");
       }

        public void mouseEntered(MouseEvent event){
           statursbar.setText("you enter the area");
           mousepanel.setBackground(Color.cyan);
        }

        public void mouseExited(MouseEvent event){
            statursbar.setText("the mouse have left the window");
            mousepanel.setBackground(Color.orange);
        }

        // mouse motion events
        public void mouseDragged(MouseEvent event){
            statursbar.setText("you are dragging the mouse");
        }

        public void mouseMoved(MouseEvent event){
            statursbar.setText("you moved the mouse");
        }
    }

}
