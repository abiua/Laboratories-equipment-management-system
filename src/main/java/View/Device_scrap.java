package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Device_scrap {
    Font f = new Font("隶书",Font.PLAIN,30);
    public void scrap() {
        JFrame jFrame = new JFrame();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);

//

        //        顶栏
        JLabel jLabel_title = new JLabel("报废设备管理检索方式");
        jLabel_title.setBounds(25,0,300,90);
        jLabel_title.setFont(f);
        jLabel_title.setForeground(Color.gray);
        JPanel jPanel_label = new JPanel();
        jPanel_label.setLayout(null);
        jPanel_label.setBackground(Color.darkGray);
        jPanel_label.setBounds(0,0,dimension.width,90);
        jPanel_label.add(jLabel_title);
        jFrame.add(jPanel_label);

        JButton jButton1 = new JButton("类别");
        jButton1.setContentAreaFilled(false);
        jButton1.setBorder(null);
        jButton1.setBounds(0,100,300,75);
        jButton1.setFont(new Font("隶书",Font.PLAIN,30));
        jButton1.setForeground(Color.gray);

        JButton jButton2 = new JButton("时间");
        jButton2.setContentAreaFilled(false);
        jButton2.setBorder(null);
        jButton2.setBounds(0,200,300,75);
        jButton2.setFont(new Font("隶书",Font.PLAIN,30));
        jButton2.setForeground(Color.gray);

        JButton jButton3 = new JButton("添加报废设备");
        jButton3.setContentAreaFilled(false);
        jButton3.setBorder(null);
        jButton3.setBounds(0,300,300,75);
        jButton3.setFont(new Font("隶书",Font.PLAIN,30));
        jButton3.setForeground(Color.gray);

        JButton jButton4 = new JButton("返回");
        jButton4.setContentAreaFilled(false);
        jButton4.setBorder(null);
        jButton4.setBounds(0,400,300,75);
        jButton4.setFont(new Font("隶书",Font.PLAIN,30));
        jButton4.setForeground(Color.gray);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(5, 1, 0, 0));
        jPanel.add(jPanel_label);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);

        jFrame.add(jPanel);

        jFrame.setVisible(true);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Device_scrap_vision dsv = new Device_scrap_vision();
                dsv.data("type");
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Device_scrap_vision_date dsv = new Device_scrap_vision_date();
                dsv.data("date");
            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Device_scrap_enter dse = new Device_scrap_enter();
                dse.Device_scrap_next();
            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });
    }
}
