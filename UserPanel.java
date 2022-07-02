
package tictactoegame2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserPanel implements ActionListener
{
    JFrame jf;
    JTextField jt1,jt2;
    JButton jb;
    JLabel jl1,jl2;
    UserPanel()
    {
        jf=new JFrame();
        jf.setSize(600,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jl1=new JLabel("ENTER PLAYER 1:(X)");
        jl1.setBounds(50,50,130,30);
        jf.add(jl1);
        jt1= new JTextField();
        jt1.setBounds(200,50 ,260 ,40 );
        jf.add(jt1);
        
        jl2=new JLabel("ENTER PLAYER 2:(0)");
        jl2.setBounds(50,150,120,30);
        jf.add(jl2);
        jt2=new JTextField();
        jt2.setBounds(200,150, 260, 40);
        jf.add(jt2);
        
        jb=new JButton("STAR GAME");
        jb.setBounds(150,280,160,50);
        jb.addActionListener(this);
        jf.add(jb);
        
        
        
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb)
        {
            String player1=jt1.getText();
            String player2=jt2.getText();
            
          GamePanel gp= new GamePanel(player1,player2);
           gp.openGamePanel();
           jf.setVisible(false);
        }
    }
}
