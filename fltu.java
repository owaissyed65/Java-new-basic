import javax.swing.*;
class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("Owais First Gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,700);
        JButton button = new JButton("Owais");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
}