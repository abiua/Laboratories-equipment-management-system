package View;

import com.gec.controller.userController;
import com.gec.entity.user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class login_interface {
    Font f = new Font("隶书",Font.PLAIN,30);
    Font f1 = new Font("隶书",Font.PLAIN,15);
    Font f_user = new Font("隶书",Font.PLAIN,17);

    public void openview () {

//        窗口
        JFrame jFrame = new JFrame("");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);

//

        //        顶栏
        JLabel jLabel_title = new JLabel("实验室设备管理系统");
        jLabel_title.setBounds(25,0,300,90);
        jLabel_title.setFont(f);
        jLabel_title.setForeground(Color.gray);
        JPanel jPanel_label = new JPanel();
        jPanel_label.setLayout(null);
        jPanel_label.setBackground(Color.darkGray);
        jPanel_label.setBounds(0,0,dimension.width,90);
        jPanel_label.add(jLabel_title);
//        jFrame.add(jPanel_label);

        //创建测试按钮


        JLabel label1 = new JLabel("账号:");
        label1.setBounds(20,140,200,20);
        label1.setForeground(Color.black);
        label1.setFont(new Font("隶书",Font.PLAIN,30));
        JTextField username = new JTextField("", 20);
        username.setBounds(100,140,100,20);
        JLabel label2 = new JLabel("密码:");
        label2.setBounds(20,220,200,20);
        label2.setForeground(Color.gray);
        label2.setFont(new Font("隶书",Font.PLAIN,30));
        JTextField pwd = new JTextField("", 20);
        pwd.setBounds(100,220,100,20);

        JButton jb1, jb2, jb3;
        jb1=new JButton("登录");
        jb1.setContentAreaFilled(false);
        jb1.setBorder(null);
        jb1.setBounds(0,300,75,75);
        jb1.setFont(new Font("隶书",Font.PLAIN,30));
        jb1.setForeground(Color.gray);

        jb2=new JButton("注册");
        jb2.setContentAreaFilled(false);
        jb2.setBorder(null);
        jb2.setBounds(100,300,75,75);
        jb2.setFont(new Font("隶书",Font.PLAIN,30));
        jb2.setForeground(Color.gray);

        jb3=new JButton("root");
        jb3.setContentAreaFilled(false);
        jb3.setBorder(null);
        jb3.setBounds(200,300,75,75);
        jb3.setFont(new Font("隶书",Font.PLAIN,30));
        jb3.setForeground(Color.gray);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBackground(Color.white);
//        jPanel.setBounds((image.getIconWidth()/2)-250,95,500,(image.getIconHeight()/2)+300);


        jPanel.add(jPanel_label);
        jPanel.add(jb1);
        jPanel.add(label1);
        jPanel.add(username);
        jPanel.add(label2);
        jPanel.add(pwd);
        jPanel.add(jb2);
//        jPanel.add(jb3);


//        Border b1 = new LineBorder(Color.gray, 4);//4为边框的宽度
//        jPanel.setBorder(b1);//setBorder方法用于给控件设置边框

        jFrame.add(jPanel);

        jFrame.setVisible(true);


        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取⽤户输⼊的账号


                userController userController = new userController();
                List<user> list = userController.select();
                boolean flag = true;
                for (user m:list) {
                    String usernameText = username.getText();
                    String pwdText = pwd.getText();
                    String id = m.getId();
                    String pwd = m.getPassword();
                    if (id.equals(usernameText) && pwd.equals(pwdText)) {
                        System.out.println("登录成功");
                        if (m.getRoot().equals("normal")) {
                            consumer consumer = new consumer();
                            consumer.select_base(id);
                            jFrame.dispose();
                            return;
                        }
                        else {
                            Root root = new Root();
                            root.select_base();
                            jFrame.dispose();
                            return;
                        }
                    }
                }
                JLabel label11 = new JLabel("账号或密码错误");
                label11.setBounds(20,280,200,20);
                label11.setForeground(Color.red);
                label11.setFont(new Font("隶书",Font.PLAIN,16));

//                jPanel1.setBounds(300, 300, 200, 80);
                jPanel.add(jPanel_label);
                jPanel.add(jb1);
                jPanel.add(label1);
                jPanel.add(username);
                jPanel.add(label2);
                jPanel.add(pwd);
                jPanel.add(jb2);
//                jPanel.add(jb3);

                jPanel.add(label11);
                jFrame.add(jPanel);
//                jFrame.add(jLabel);
                jFrame.dispose();
                jFrame.setVisible(true);
                System.out.println("登录错误");
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register sn = new register();
                sn.register_next();
            }
        });

        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Root root = new Root();
                root.select_base();
            }
        });
    }



    public static void main(String[] args) {
        login_interface li = new login_interface();
        li.openview();
    }
}
