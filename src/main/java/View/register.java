package View;

import com.gec.controller.userController;
import com.gec.entity.user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register {
    Font f = new Font("隶书",Font.PLAIN,30);
    public void register_next() {
        JFrame jFrame = new JFrame();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);

//

        //        顶栏
        JLabel jLabel_title = new JLabel("注册界面");
        jLabel_title.setBounds(25,0,300,90);
        jLabel_title.setFont(f);
        jLabel_title.setForeground(Color.gray);
        JPanel jPanel_label = new JPanel();
        jPanel_label.setLayout(null);
        jPanel_label.setBackground(Color.darkGray);
        jPanel_label.setBounds(0,0,dimension.width,90);
        jPanel_label.add(jLabel_title);
        jFrame.add(jPanel_label);

        JButton jb1;
        jb1=new JButton("确认");
        jb1.setContentAreaFilled(false);
        jb1.setBorder(null);
        jb1.setBounds(0,300,75,75);
        jb1.setFont(new Font("隶书",Font.PLAIN,30));
        jb1.setForeground(Color.gray);

        JButton jb2;
        jb2=new JButton("返回");
        jb2.setContentAreaFilled(false);
        jb2.setBorder(null);
        jb2.setBounds(150,300,75,75);
        jb2.setFont(new Font("隶书",Font.PLAIN,30));
        jb2.setForeground(Color.gray);

        JLabel label1 = new JLabel("用户名:");
        label1.setBounds(20,140,200,20);
        label1.setForeground(Color.gray);
        label1.setFont(new Font("隶书",Font.PLAIN,30));
        JTextField username = new JTextField("", 20);
        username.setBounds(128,140,100,20);

        JLabel label2 = new JLabel("  密码:");
        label2.setBounds(20,220,200,20);
        label2.setForeground(Color.gray);
        label2.setFont(new Font("隶书",Font.PLAIN,30));
        JTextField pwd = new JTextField("", 20);
        pwd.setBounds(128,220,100,20);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBackground(Color.white);
//        jPanel.setBounds((image.getIconWidth()/2)-250,95,500,(image.getIconHeight()/2)+300);
        jPanel.add(jb1);
        jPanel.add(jb2);
        jPanel.add(label1);
        jPanel.add(username);
        jPanel.add(label2);
        jPanel.add(pwd);

//        Border b1 = new LineBorder(Color.gray, 4);//4为边框的宽度
//        jPanel.setBorder(b1);//setBorder方法用于给控件设置边框

        jFrame.add(jPanel);

        jFrame.setVisible(true);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = username.getText();
                String password = pwd.getText();
                userController userController = new userController();
                user n = new user();
                n.setName(name);
                n.setPassword(password);
                n.setRoot("normal");
                userController.insert(n);
                String id = n.getId();
                JLabel label11 = new JLabel("注册成功 您的账号为:" + id + "");
                label11.setBounds(20,280,800,20);
                label11.setForeground(Color.red);
                label11.setFont(new Font("隶书",Font.PLAIN,16));

                jPanel.add(jb1);
                jPanel.add(jb2);
                jPanel.add(label1);
                jPanel.add(username);
                jPanel.add(label2);
                jPanel.add(pwd);

                jPanel.add(label11);
                jFrame.add(jPanel);
//                jFrame.add(jLabel);
                jFrame.dispose();
                jFrame.setVisible(true);
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });

    }
}
