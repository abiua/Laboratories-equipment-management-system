package View;

import com.gec.controller.repairController;
import com.gec.controller.runController;
import com.gec.controller.typeController;
import com.gec.entity.DeviceRun;
import com.gec.entity.DeviceType;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Device_run_enter {
    Font f = new Font("隶书",Font.PLAIN,30);
    public void Device_run_enter_next() {
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
        jb1 = new JButton("空闲处理 ");
        jb1.setContentAreaFilled(false);
        jb1.setBorder(null);
        jb1.setBounds(0, 300, 50, 75);
        jb1.setFont(new Font("隶书", Font.PLAIN, 30));

        JButton jb2;
        jb2 = new JButton(" 运行处理 ");
        jb2.setContentAreaFilled(false);
        jb2.setBorder(null);
        jb2.setBounds(150,300,75,75);
        jb2.setFont(new Font("隶书",Font.PLAIN,30));

        JButton jb3;
        jb3 = new JButton(" 返回");
        jb3.setContentAreaFilled(false);
        jb3.setBorder(null);
        jb3.setBounds(300,300,75,75);
        jb3.setFont(new Font("隶书",Font.PLAIN,30));

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


        JLabel label2 = new JLabel("实验室名称:");
        label2.setBounds(20, 220, 200, 20);
        label2.setForeground(Color.gray);
        label2.setFont(new Font("隶书", Font.PLAIN, 30));
        JTextField text2 = new JTextField("", 20);
        text2.setBounds(150, 220, 100, 20);
        JPanel jp2 = new JPanel();
        jp2.add(label2);
        jp2.add(text2);




        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 11, 20));
//        jPanel.setLayout(null);
        jPanel.setBackground(Color.white);
//        jPanel.setBounds((image.getIconWidth()/2)-250,95,500,(image.getIconHeight()/2)+300);


        jPanel.add(jp1);
        jPanel.add(jp2);


        JPanel jp3 = new JPanel();

        jp3.add(jb1);
        jp3.add(jb2);
        jp3.add(jb3);

        jp3.setBounds(10, 400, 400, 50);


//        jPanel.setBounds(400,300,300,100);



//        JPanel jp2 = new JPanel();
//        jp2.add(label2);
//        jp2.add(pwd);
//        jPanel.add(jp2);

        Border b1 = new LineBorder(Color.gray, 4);//4为边框的宽度
        jPanel.setBorder(b1);//setBorder方法用于给控件设置边框
        jFrame.add(jp3);
        jFrame.add(jPanel);


        jFrame.setVisible(true);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                typeController typeController = new typeController();
                DeviceType dt = typeController.selectByID(text1.getText());

                runController runController = new runController();

                runController.delete(dt.getId());
                runController.insert(new DeviceRun(dt.getId(), dt.getName(), "空闲", dt.getDate(), text2.getText()));

                repairController repairController = new repairController();
                repairController.delete(text1.getText());

                JLabel label0 = new JLabel("处理成功");
                label0.setBounds(jp3.getWidth() + 100, 400, jb1.getWidth()*2, 50);
                label0.setForeground(Color.red);
                label0.setFont(new Font("隶书",Font.PLAIN,30));


                JButton jb1;
                jb1 = new JButton("空闲处理");
                jb1.setContentAreaFilled(false);
                jb1.setBorder(null);
                jb1.setBounds(0, 300, 75, 75);
                jb1.setFont(new Font("隶书", Font.PLAIN, 30));

                JButton jb2;
                jb2=new JButton("运行处理");
                jb2.setContentAreaFilled(false);
                jb2.setBorder(null);
                jb2.setBounds(150,300,75,75);
                jb2.setFont(new Font("隶书",Font.PLAIN,30));

                JButton jb3;
                jb3=new JButton("返回");
                jb3.setContentAreaFilled(false);
                jb3.setBorder(null);
                jb3.setBounds(300,300,75,75);
                jb3.setFont(new Font("隶书",Font.PLAIN,30));

                JPanel jp3 = new JPanel();
                jp3.add(jb1);
                jp3.add(jb2);
                jp3.add(jb3);

                jp3.setBounds(10, 400, jb1.getWidth()*3, 50);


                JPanel jp4 = new JPanel();
                jp4.setBounds(jp3.getWidth()+200, 400, jb1.getWidth()*2, 50);
                jp4.add(label0);

                Border b1 = new LineBorder(Color.gray, 4);//4为边框的宽度
                jPanel.setBorder(b1);//setBorder方法用于给控件设置边框
                jFrame.add(jp4);
                jFrame.add(jp3);

                jFrame.add(jPanel);


                jFrame.dispose();
                jFrame.setVisible(true);
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean flag = false;

                runController runController = new runController();

                List<DeviceRun> list_dr = runController.select();
                for (int i=0;i<list_dr.size();i++) {
                    DeviceRun data_dr = list_dr.get(i);
                    if (data_dr.getIdRun().equals(text1.getText())) {
                        flag = true;
                    }
                }

                JLabel label0;
                if (flag) {
                    DeviceRun dr = runController.selectID(text1.getText());
                    runController.update(new DeviceRun(dr.getIdRun(), dr.getNameRun(), "忙碌", dr.getDateRun(), dr.getLabName()));


                    label0 = new JLabel("处理成功");
                    label0.setBounds(jp3.getWidth() + 100, 400, jb1.getWidth() * 2, 50);
                    label0.setForeground(Color.red);
                    label0.setFont(new Font("隶书", Font.PLAIN, 30));
                }
                else {
                    DeviceRun dr = runController.selectID(text1.getText());
                    runController.update(new DeviceRun(dr.getIdRun(), dr.getNameRun(), "忙碌", dr.getDateRun(), dr.getLabName()));


                    label0 = new JLabel("处理失败 该设备当前并未在实验室中");
                    label0.setBounds(jp3.getWidth() + 100, 400, jb1.getWidth() * 10, 50);
                    label0.setForeground(Color.red);
                    label0.setFont(new Font("隶书", Font.PLAIN, 30));

                }

                JButton jb1;
                jb1 = new JButton("空闲处理");
                jb1.setContentAreaFilled(false);
                jb1.setBorder(null);
                jb1.setBounds(0, 300, 75, 75);
                jb1.setFont(new Font("隶书", Font.PLAIN, 30));

                JButton jb2;
                jb2=new JButton("运行处理");
                jb2.setContentAreaFilled(false);
                jb2.setBorder(null);
                jb2.setBounds(150,300,75,75);
                jb2.setFont(new Font("隶书",Font.PLAIN,30));

                JButton jb3;
                jb3=new JButton("返回");
                jb3.setContentAreaFilled(false);
                jb3.setBorder(null);
                jb3.setBounds(300,300,75,75);
                jb3.setFont(new Font("隶书",Font.PLAIN,30));

                JPanel jp3 = new JPanel();
                jp3.add(jb1);
                jp3.add(jb2);
                jp3.add(jb3);

                jp3.setBounds(10, 400, jb1.getWidth()*3, 50);


                JPanel jp4 = new JPanel();
                jp4.setBounds(jp3.getWidth()+200, 400, jb1.getWidth()*2, 50);
                jp4.add(label0);

                Border b1 = new LineBorder(Color.gray, 4);//4为边框的宽度
                jPanel.setBorder(b1);//setBorder方法用于给控件设置边框
                jFrame.add(jp4);
                jFrame.add(jp3);

                jFrame.add(jPanel);


                jFrame.dispose();
                jFrame.setVisible(true);
            }
        });

        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });
    }
}
