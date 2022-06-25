package View;

import com.gec.controller.runController;
import com.gec.controller.scrapController;
import com.gec.controller.typeController;
import com.gec.entity.DeviceRun;
import com.gec.entity.DeviceScrap;
import com.gec.entity.DeviceType;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Device_scrap_enter {
    Font f = new Font("隶书",Font.PLAIN,30);
    public void Device_scrap_next() {
        JFrame jFrame = new JFrame();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);

//

        //        顶栏
        JLabel jLabel_title = new JLabel("报废设备管理");
        jLabel_title.setBounds(25, 0, 300, 90);
        jLabel_title.setFont(f);
        jLabel_title.setForeground(Color.gray);
        JPanel jPanel_label = new JPanel();
        jPanel_label.setLayout(null);
        jPanel_label.setBackground(Color.darkGray);
        jPanel_label.setBounds(0, 0, dimension.width, 90);
        jPanel_label.add(jLabel_title);
//        jFrame.add(jPanel_label);

        JButton jb1;
        jb1 = new JButton("确认");
        jb1.setContentAreaFilled(false);
        jb1.setBorder(null);
        jb1.setBounds(0, 300, 75, 75);
        jb1.setFont(new Font("隶书", Font.PLAIN, 30));

        JButton jb2;
        jb2=new JButton("返回");
        jb2.setContentAreaFilled(false);
        jb2.setBorder(null);
        jb2.setBounds(150,300,75,75);
        jb2.setFont(new Font("隶书",Font.PLAIN,30));

//        for (int i=0;i < 10;i++) {
//            name = "label" + i;
//
//        }


        JLabel label1 = new JLabel("设备ID:");
        label1.setBounds(20, 140, 200, 20);
        label1.setForeground(Color.gray);
        label1.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text1 = new JTextField("", 20);
        text1.setBounds(150, 140, 100, 20);
        JPanel jp1 = new JPanel();
        jp1.add(label1);
        jp1.add(text1);


        JLabel label2 = new JLabel("设备名称:");
        label2.setBounds(20, 220, 200, 20);
        label2.setForeground(Color.gray);
        label2.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text2 = new JTextField("", 20);
        text2.setBounds(150, 220, 100, 20);
        JPanel jp2 = new JPanel();
        jp2.add(label2);
        jp2.add(text2);


        JLabel label3 = new JLabel("设备类型:");
        label3.setBounds(20, 220, 200, 20);
        label3.setForeground(Color.gray);
        label3.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text3 = new JTextField("", 20);
        text2.setBounds(150, 220, 100, 20);
        JPanel jp3 = new JPanel();
        jp3.add(label3);
        jp3.add(text3);

        JLabel label4 = new JLabel("报废日期:");
        label4.setBounds(20, 220, 200, 20);
        label4.setForeground(Color.gray);
        label4.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text4 = new JTextField("", 20);
        text4.setBounds(150, 220, 100, 20);
        JPanel jp4 = new JPanel();
        jp4.add(label4);
        jp4.add(text4);




        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 11, 20));
//        jPanel.setLayout(null);
        jPanel.setBackground(Color.white);
//        jPanel.setBounds((image.getIconWidth()/2)-250,95,500,(image.getIconHeight()/2)+300);


        jPanel.add(jp1);
        jPanel.add(jp2);
        jPanel.add(jp3);
//        jPanel.add(jp4);


        JPanel jp13 = new JPanel();

        jp13.add(jb1);
        jp13.add(jb2);

        jp13.setBounds(10, 400, jb1.getWidth()*2, 50);


//        jPanel.setBounds(400,300,300,100);



//        JPanel jp2 = new JPanel();
//        jp2.add(label2);
//        jp2.add(pwd);
//        jPanel.add(jp2);

        Border b1 = new LineBorder(Color.gray, 4);//4为边框的宽度
        jPanel.setBorder(b1);//setBorder方法用于给控件设置边框
        jFrame.add(jp13);
        jFrame.add(jPanel);


        jFrame.setVisible(true);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeController typeController = new typeController();
                DeviceType dt = typeController.selectByID(text1.getText());
                String repairFac = text2.getText();
                String repairMoney = text3.getText();
                String headID = text4.getText();

                scrapController scrapController = new scrapController();
                DeviceScrap ds = new DeviceScrap(dt.getId(), dt.getName(), dt.getType(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), "1");
                scrapController.insert(ds);

                runController runController = new runController();
                DeviceRun data_dr = runController.selectID(ds.getId());
//                runController.update(new DeviceRun(dt.getId(), dt.getName(), "报废", dt.getDate(), data_dr.getLabName()));
                runController.delete(dt.getId());

                JLabel label0 = new JLabel("录入成功");
                label0.setBounds(jp13.getWidth()+100, 400, jb1.getWidth()*2, 50);
                label0.setForeground(Color.red);
                label0.setFont(new Font("隶书",Font.PLAIN,30));


                JButton jb1;
                jb1 = new JButton("确认");
                jb1.setContentAreaFilled(false);
                jb1.setBorder(null);
                jb1.setBounds(0, 300, 75, 75);
                jb1.setFont(new Font("隶书", Font.PLAIN, 30));

                JButton jb2;
                jb2=new JButton("返回");
                jb2.setContentAreaFilled(false);
                jb2.setBorder(null);
                jb2.setBounds(150,300,75,75);
                jb2.setFont(new Font("隶书",Font.PLAIN,30));

                JPanel jp13 = new JPanel();
                jp13.add(jb1);
                jp13.add(jb2);

                jp13.setBounds(10, 400, jb1.getWidth()*2, 50);


                JPanel jp14 = new JPanel();
                jp14.setBounds(jp13.getWidth()+100, 400, jb1.getWidth()*2, 50);
                jp14.add(label0);

                Border b1 = new LineBorder(Color.gray, 4);//4为边框的宽度
                jPanel.setBorder(b1);//setBorder方法用于给控件设置边框
                jFrame.add(jp14);
                jFrame.add(jp13);

                jFrame.add(jPanel);


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
