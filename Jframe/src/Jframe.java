import javax.swing.*;


public class Jframe {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Jframe");
        frame.setSize(500,500);
        JButton button=new JButton();
        JLabel l1=new JLabel();
        l1.setBounds(50,100,250,20);
        button.setText("tikla");
        final JTextField tf=new JTextField();
        tf.setBounds(50,50,150,20);
        button.setBounds(50,150,95,30);
        button.addActionListener(e -> {
            try{
                String host=tf.getText();
                String ip=java.net.InetAddress.getByName(host).getHostAddress();
                l1.setText("IP of "+host+" is "+ip);
            }catch (Exception ex){
                System.out.println(ex);
            }
        });
        frame.add(button); frame.add(tf); frame.add(l1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


    }
}
