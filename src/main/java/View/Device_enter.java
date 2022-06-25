package View;

import com.gec.controller.typeController;
import com.gec.controller.userController;
import com.gec.entity.DeviceType;
import com.gec.entity.user;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Device_enter {
    Font f = new Font("隶书", Font.PLAIN, 30);
    Font f1 = new Font("隶书", Font.PLAIN, 15);
    Font f_user = new Font("隶书", Font.PLAIN, 17);

    public void Device_enter_next() {
        JFrame jFrame = new JFrame();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);

//

        //        顶栏
        JLabel jLabel_title = new JLabel("设备入库管理");
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


        JLabel label1 = new JLabel("编号:");
        label1.setBounds(20, 140, 200, 20);
        label1.setForeground(Color.gray);
        label1.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text1 = new JTextField("", 20);
        text1.setBounds(150, 140, 100, 20);
        JPanel jp1 = new JPanel();
        jp1.add(label1);
        jp1.add(text1);


        JLabel label2 = new JLabel("设备名:");
        label2.setBounds(20, 220, 200, 20);
        label2.setForeground(Color.gray);
        label2.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text2 = new JTextField("", 20);
        text2.setBounds(150, 220, 100, 20);
        JPanel jp2 = new JPanel();
        jp2.add(label2);
        jp2.add(text2);


        JLabel label3 = new JLabel("型号:");
        label3.setBounds(20, 220, 200, 20);
        label3.setForeground(Color.gray);
        label3.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text3 = new JTextField("", 20);
        text2.setBounds(150, 220, 100, 20);
        JPanel jp3 = new JPanel();
        jp3.add(label3);
        jp3.add(text3);

        JLabel label4 = new JLabel("类型:");
        label4.setBounds(20, 220, 200, 20);
        label4.setForeground(Color.gray);
        label4.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text4 = new JTextField("", 20);
        text4.setBounds(150, 220, 100, 20);
        JPanel jp4 = new JPanel();
        jp4.add(label4);
        jp4.add(text4);


        JLabel label5 = new JLabel("规格:");
        label5.setBounds(20, 220, 200, 20);
        label5.setForeground(Color.gray);
        label5.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text5 = new JTextField("", 20);
        text4.setBounds(150, 220, 100, 20);
        JPanel jp5 = new JPanel();
        jp5.add(label5);
        jp5.add(text5);


        JLabel label6 = new JLabel("单价:");
        label6.setBounds(20, 220, 200, 20);
        label6.setForeground(Color.gray);
        label6.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text6 = new JTextField("", 20);
        text6.setBounds(150, 220, 100, 20);
        JPanel jp6 = new JPanel();
        jp6.add(label6);
        jp6.add(text6);


        JLabel label7 = new JLabel("购置日期:");
        label7.setBounds(20, 220, 200, 20);
        label7.setForeground(Color.gray);
        label7.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text7 = new JTextField("", 20);
        text7.setBounds(150, 220, 100, 20);
        JPanel jp7 = new JPanel();
        jp7.add(label7);
        jp7.add(text7);


        JLabel label8 = new JLabel("生产厂家:");
        label8.setBounds(20, 220, 200, 20);
        label8.setForeground(Color.gray);
        label8.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text8 = new JTextField("", 20);
        text8.setBounds(150, 220, 100, 20);
        JPanel jp8 = new JPanel();
        jp8.add(label8);
        jp8.add(text8);


        JLabel label9 = new JLabel("批次:");
        label9.setBounds(20, 220, 200, 20);
        label9.setForeground(Color.gray);
        label9.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text9 = new JTextField("", 20);
        text9.setBounds(150, 220, 100, 20);
        JPanel jp9 = new JPanel();
        jp9.add(label9);
        jp9.add(text9);


        JLabel label10 = new JLabel("购买人ID:");
        label10.setBounds(20, 220, 200, 20);
        label10.setForeground(Color.gray);
        label10.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text10 = new JTextField("", 20);
        text10.setBounds(150, 220, 100, 20);
        JPanel jp10 = new JPanel();
        jp10.add(label10);
        jp10.add(text10);


        JLabel label11 = new JLabel("购买人名字:");
        label11.setBounds(20, 220, 200, 20);
        label11.setForeground(Color.gray);
        label11.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text11 = new JTextField("", 20);
        text11.setBounds(150, 220, 100, 20);
        JPanel jp11 = new JPanel();
        jp11.add(label11);
        jp11.add(text11);


        JLabel label12 = new JLabel("数量:");
        label12.setBounds(20, 220, 200, 20);
        label12.setForeground(Color.gray);
        label12.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text12 = new JTextField("", 20);
        text12.setBounds(150, 220, 100, 20);
        JPanel jp12 = new JPanel();
        jp12.add(label12);
        jp12.add(text12);

        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 11, 20));
//        jPanel.setLayout(null);
        jPanel.setBackground(Color.white);
//        jPanel.setBounds((image.getIconWidth()/2)-250,95,500,(image.getIconHeight()/2)+300);


//        jPanel.add(jp1);
        jPanel.add(jp2);
        jPanel.add(jp3);
        jPanel.add(jp4);
        jPanel.add(jp5);
        jPanel.add(jp6);
//        jPanel.add(jp7);
        jPanel.add(jp8);
//        jPanel.add(jp9);
        jPanel.add(jp10);
        jPanel.add(jp11);
        jPanel.add(jp12);


        JPanel jp13 = new JPanel();

        jp13.add(jb1);
        jp13.add(jb2);

        jp13.setBounds(10, 400, jb1.getWidth()*2, 50);


        Border b1 = new LineBorder(Color.gray, 4);//4为边框的宽度
        jPanel.setBorder(b1);//setBorder方法用于给控件设置边框
        jFrame.add(jp13);
        jFrame.add(jPanel);


        jFrame.setVisible(true);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeController typeController = new typeController();
//                String id = text1.getText();
                String name = text2.getText();
                String model = text3.getText();
                String type = text4.getText();
                String spec = text5.getText();
                String price = text6.getText();
                String date = text7.getText();
                String factory = text8.getText();
//                String batch = text9.getText();
                String buyerID = text10.getText();
                String buyerName = text11.getText();
                String num = text12.getText();

                List<DeviceType> list_dt = typeController.select();
                String batch = "0";
                for (int i=0;i<list_dt.size();i++) {
                    DeviceType deviceType = list_dt.get(i);
                    if (deviceType.getModel().equals(model) && deviceType.getFactory().equals(factory)) {
                        batch = deviceType.getBatch();
                    }
                }
//                batch = Integer.parseInt(batch)+1
                batch = Integer.toString(Integer.parseInt(batch)+1);

                boolean flag = false;
                userController userController = new userController();
                List<user> data_user = userController.select();
                for (int i=0;i<data_user.size();i++) {
                    user user = data_user.get(i);
                    if (user.getId().equals(buyerID) && user.getName().equals(buyerName)) {
                        flag = true;
                    }
                }

                if (flag) {
                    for (int i = 0; i < Integer.parseInt(num); i++) {
                        typeController.insert(new DeviceType(null, name, model, type, spec, price, factory, batch, buyerID, buyerName));

                    }
                }

//                jPanel.add(jp1);
                jPanel.add(jp2);
                jPanel.add(jp3);
                jPanel.add(jp4);
                jPanel.add(jp5);
                jPanel.add(jp6);
                jPanel.add(jp7);
                jPanel.add(jp8);
//                jPanel.add(jp9);
                jPanel.add(jp10);
                jPanel.add(jp11);
                jPanel.add(jp12);

                JLabel label0;
                if (flag) {
                    label0 = new JLabel("录入成功");
                }
                else {
                    label0 = new JLabel("录入失败");
                }
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
