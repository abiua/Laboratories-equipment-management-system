package View;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class consumer {
    Font f = new Font("隶书",Font.PLAIN,30);
    Font f1 = new Font("隶书",Font.PLAIN,15);
    Font f_user = new Font("隶书",Font.PLAIN,17);
    public void select_base(String id) {
        JFrame jFrame = new JFrame();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);

//

        //        顶栏
        JLabel jLabel_title = new JLabel("用户" + id + " 欢迎使用设备检索系统 请选择检索方式");
        jLabel_title.setBounds(25,0,800,90);
        jLabel_title.setFont(f);
        jLabel_title.setForeground(Color.gray);
        JPanel jPanel_label = new JPanel();
        jPanel_label.setLayout(null);
        jPanel_label.setBackground(Color.darkGray);
        jPanel_label.setBounds(0,0,dimension.width,90);
//        jPanel_label.add(jLabel_title);
//        jFrame.add(jPanel_label);

        JButton jButton1 = new JButton("设备名称");
        jButton1.setContentAreaFilled(false);
        jButton1.setBorder(null);
        jButton1.setBounds(0,100,300,20);
        jButton1.setFont(new Font("隶书",Font.PLAIN,30));
        jButton1.setForeground(Color.gray);

        JButton jButton2 = new JButton("机房名称");
        jButton2.setContentAreaFilled(false);
        jButton2.setBorder(null);
        jButton2.setBounds(0,101,300,20);
        jButton2.setFont(new Font("隶书",Font.PLAIN,30));
        jButton2.setForeground(Color.gray);

        JButton jButton3 = new JButton("日期");
        jButton3.setContentAreaFilled(false);
        jButton3.setBorder(null);
        jButton3.setBounds(0,102,300,20);
        jButton3.setFont(new Font("隶书",Font.PLAIN,30));
        jButton3.setForeground(Color.gray);

        JButton jButton4 = new JButton("退出");
        jButton4.setContentAreaFilled(false);
        jButton4.setBorder(null);
        jButton4.setBounds(0,400,300,20);
        jButton4.setFont(new Font("隶书",Font.PLAIN,30));
        jButton4.setForeground(Color.gray);

//        JPanel jPanel1 = new JPanel();
//        jPanel1.setLayout(null);
//        jPanel1.setBackground(Color.darkGray);
//        jPanel1.setBounds(0,image.getIconHeight(),image.getIconWidth(),50);
        JButton jButton5 = new JButton("切换账号");
        jButton5.setContentAreaFilled(false);
        jButton5.setBorder(null);
        jButton5.setBounds(0,80,100,20);
        jButton5.setFont(new Font("正楷",Font.PLAIN,15));
        jButton5.setForeground(Color.lightGray);
        jPanel_label.add(jButton5);
        jPanel_label.add(jLabel_title);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(5, 1, 0, 0));
        jPanel.add(jPanel_label);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        int x = jPanel.getX();
        jPanel.setBounds(x, 100, 200, 100);

        Border b1 = new LineBorder(Color.gray, 4);//4为边框的宽度
        jPanel.setBorder(b1);//setBorder方法用于给控件设置边框

        jFrame.add(jPanel);

        jFrame.setVisible(true);


        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Device_run_vision drv = new Device_run_vision();
                drv.showFrame("nameRun");
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Device_run_vision drv = new Device_run_vision();
                drv.showFrame("LabName");
            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Device_run_vision_date drv = new Device_run_vision_date();
                drv.data("dateRun");
            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });

        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] s = new String[0];
                login_interface.main(s);
            }
        });
    }
}
